import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTurnsSynchronized {
        static AtomicInteger integer =new AtomicInteger(0);
     static Object lock=new Object();
        public static void main(String[] args) {
            new Thread(()->{
                while (integer.get()<=200){
                    synchronized (lock){
                        lock.notify();
                        System.out.println(Thread.currentThread().getName()+"打印出"+integer.getAndIncrement());
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }).start();
            new Thread(()->{
                while (integer.get()<=200){
                    synchronized (lock){
                        lock.notify();
                        System.out.println(Thread.currentThread().getName()+"打印出"+integer.getAndIncrement());
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }).start();

        }
    }

