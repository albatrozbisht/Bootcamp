public class Question2 {
    private int count;

    public static void main(String[] args) {
        SynchronizationExample ex = new SynchronizationExample();
        Thread t1 = new Thread(ex);
        Thread t2 = new Thread(ex);
        t1.start();
        t2.start();

    }
}

class SynchronizationExample implements Runnable{
    synchronized void increment() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is inside a synchronized method "+i);
        }
    }

    void unsynchronized(){
        System.out.println(Thread.currentThread().getName()+" is inside unsynchronized method");
        synchronized (this){
            try{
                Thread.sleep(400);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            for(int i=0;i<3;i++){
                System.out.println(Thread.currentThread().getName()+" is inside synchronized block "+i);
            }
        }
    }

    public void run(){
        increment();
        unsynchronized();

    }
}


//Output:
//        Thread-0 is inside a synchronized method 0
//        Thread-0 is inside a synchronized method 1
//        Thread-0 is inside a synchronized method 2
//        Thread-1 is inside a synchronized method 0
//        Thread-1 is inside a synchronized method 1
//        Thread-1 is inside a synchronized method 2
//        Thread-1 is inside unsynchronized method
//        Thread-0 is inside unsynchronized method
//        Thread-1 is inside synchronized block 0
//        Thread-1 is inside synchronized block 1
//        Thread-1 is inside synchronized block 2
//        Thread-0 is inside synchronized block 0
//        Thread-0 is inside synchronized block 1
//        Thread-0 is inside synchronized block 2

