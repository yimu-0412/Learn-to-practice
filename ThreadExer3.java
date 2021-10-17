
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author wangyimu
 * @Program ThreadExer
 * @create 2021-10-17-17:21
 */
public class ThreadExer3 {
    // 使用这个类来描述一个任务
    static class Task implements Comparable<Task>{
        // command 代表这个任务是啥
        private Runnable command;
        // time 代表这个任务什么时候到时间
        // 这里的 time 使用 ms 级的时间戳来表示
        private long time;

        // 约定参数 time 是一个时间差
        // 希望 this.time 保存一个绝对的时间(毫秒级时间戳)
        public Task(Runnable command, long time) {
            this.command = command;
            this.time = System.currentTimeMillis() + time;
        }

        public void run(){
            command.run();
        }


        @Override
        public int compareTo(Task o) {
            return (int)(this.time - o.time );
        }
    }

    static class Timer{
        // 使用这个带优先级的阻塞队列来组织这些任务
        private PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<Task>();

        // 使用这个 Locker 对象
        private Object locker = new Object();

        public void secedule(Runnable command,long delay){
            Task task = new Task(command,delay);
            queue.put(task);

            // 每次插入新的任务都要唤醒扫描线程,让扫描线程能够重新计算 wait 的时间,保证新的任务不会错过
            synchronized (locker) {
                locker.notify();
            }
        }

        public Timer(){
            // 来创建一个扫描线程,用来判定当前的任务,看看是不是已经到时间执行了
            Thread worker = new Thread(){
                @Override
                public void run() {
                    while(true){
                        try {
                            // 取出队列的首元素,判定时间是不是到了
                            Task task = queue.take();
                            long curtime = System.currentTimeMillis();
                            if(task.time > curtime){
                                // 时间还没到
                                // 前面的 take 操作会把首元素删除,
                                // 但是此时队首元素的任务还没有执行,不能删持,于是需要重新插入回队列
                                queue.put(task);
                                // 根据时间差进行一个等待
                                synchronized (locker) {
                                    locker.wait(task.time - curtime);
                                }
                            }else{
                                // 时间到了
                                task.run();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            // 如果出现了 interrupt 方法,就退出线程
                            break;
                        }
                    }
                }
            };
            worker.start();
        }
    }

    public static void main(String[] args) {
        System.out.println("程序启动");
        Timer timer = new Timer();
        timer.secedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        },3000);
    }
}
