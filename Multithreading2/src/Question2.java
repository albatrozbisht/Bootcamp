import java.util.concurrent.locks.ReentrantLock;

public class Question2 {
    private static ReentrantLock lock = new ReentrantLock();
    static int a;
    static void increment(){
        a++;
        System.out.println(a);
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    for (int i = 0; i < 5; i++)
                        increment();
                } finally {
                    System.out.println(Thread.currentThread().getName() + " is unlocked");
                    lock.unlock();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    for (int i = 0; i < 6; i++)
                        increment();
                }
                finally {
                    lock.unlock();
                    System.out.println(Thread.currentThread().getName()+" is unlocked");
                }
            }
        });
        t1.start();
        t2.start();
    }
}


//Output:
//        1
//        2
//        3
//        4
//        5
//        Thread-0 is unlocked
//        6
//        7
//        8
//        9
//        10
//        11
//        Thread-1 is unlocked
