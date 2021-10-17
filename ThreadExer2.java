/**
 * @author wangyimu
 * @Program ThreadExer
 * @create 2021-10-17-11:48
 */
public class ThreadExer2 {
    static class BlockingQueue{
        // 1000相当于队列的最大容量，不考虑扩容
        private int[] items = new int[1000];
        private int head = 0;
        private int tail = 0;
        private int size = 0;
        Object locker = new Object();

        // put 用来入队列
        public void put(int item) throws InterruptedException {
            synchronized (locker) {
                while(size == items.length){
                    // 队列已满，对于阻塞队列来说就要阻塞，进行等待
                    locker.wait();
                }

                items[tail] = item;
                tail ++;

                // 当队列到达末尾，就要回到起始位置
                if(tail >= items.length){
                    tail = 0;
                }

                size ++;
                // 此处的 notify 用来唤醒 take 中的 wait
                locker.notify();
            }
        }

        public int take() throws InterruptedException {
            int ret = 0;
            synchronized (locker) {
                while(size == 0){
                    locker.wait();
                }

                ret = items[head];
                head ++;

                if(head >= items.length){
                    head = 0;
                }
                size --;

                // 此处的 notify 用来唤醒 put 中的 wait
                locker.notify();
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        BlockingQueue queue = new BlockingQueue();

        // 创建一个线程作为消费者
        Thread customer = new Thread(){
            @Override
            public void run() {
                for(int i = 1;i <= 10; i ++){

                    try {
                        int value = queue.take();
                        System.out.println("消费的模型：" + value);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        customer.start();

        // 创建一个线程作为生产者
        Thread producer = new Thread(){

            @Override
            public void run() {
                for(int i = 1;i <= 10; i ++){
                    System.out.println("生产的模型：" + i );
                    try {
                        queue.put(i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        producer.start();

        try {
            customer.join();
            producer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
