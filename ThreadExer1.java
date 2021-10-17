import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author wangyimu
 * @Program 生产者消费者模型
 * @create 2021-10-17-10:11
 */
public class ThreadExer1 {
    public static void main(String[] args) {
        // 先创建一个 BlockingQueue 队列作为交易场所
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        // 创建一个线程作为消费者
        Thread customer = new Thread(){
            @Override
            public void run() {
                while(true){
                    // 获取队首元素
                    try {
                        Integer value = queue.take();
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
                for(int i = 0; i < 10; i ++){
                    System.out.println("生产了元素: " + i);
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
