import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTurns {
    static AtomicInteger integer =new AtomicInteger(0);
    static volatile boolean flag=true;
    public static void main(String[] args) {
        new Thread(()->{
            while (integer.get()<=200){
               if(flag){
                   flag=false;
                   System.out.println(Thread.currentThread().getName()+"打印出"+integer.getAndIncrement());
              }
            }
        }).start();
        new Thread(()->{

            while (integer.get()<=20000){
            if(!flag){
                flag=true;
                System.out.println(Thread.currentThread().getName()+"打印出"+integer.getAndIncrement());
            }}
        }).start();

    }
}
//import java.util.concurrent.locks.LockSupport;
//
//public class ThreadTurns {
//    private static final int MAX = 200;
//    private static final Thread[] threads = new Thread[2];
//    private static final AtomicInteger count = new AtomicInteger(0);
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 2; i++) {
//            final int id = i;
//            threads[id] = new Thread(() -> {
//                while (true) {
//                    int c = count.get();
//                    if (c > MAX) break;           // 终止条件
//                    if (c % 2 == id) {            // 0号线程打印偶数，1号线程打印奇数
//                        System.out.println(Thread.currentThread().getName() + " -> " + c);
//                        count.compareAndSet(c, c + 1); // CAS 递增
//                        LockSupport.unpark(threads[1 - id]); // 唤醒对方
//                    } else {
//                        LockSupport.park();                // 自己挂起
//                    }
//                }
//            }, "Thread-" + id);
//            threads[id].start();
//        }
//    }
//}