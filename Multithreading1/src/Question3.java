
public class Question3 {

    static volatile int a=100;
    static synchronized int increment(){
        a+=20;
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Original value of a is: "+a);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Value of a in "+Thread.currentThread().getName()+" is "+increment());

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Value of a in "+Thread.currentThread().getName()+" is "+increment());

            }
        }).start();

    }
}


//Output:
//        Original value of a is: 100
//        Value of a in Thread-0
//        120
//        Value of a in Thread-1
//        140