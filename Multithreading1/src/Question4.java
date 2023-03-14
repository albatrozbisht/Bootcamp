public class Question4 {
    static int a;
    static void increment(){
        a++;
        System.out.println(a);
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++)
                    increment();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<6;i++)
                    increment();
            }
        });
        t1.start();
        t2.start();
    }
}
