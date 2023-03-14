import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class Question1 {
    public static void main(String[] args) {

        NewThread n1 = new NewThread("Thread1");
        Thread t1 = new Thread(n1);

        NewThread n2 = new NewThread("Thread2");
        Thread t2 = new Thread(n2);


        NewThread n3 = new NewThread("Thread3");
        Thread t3 = new Thread(n3);

        t1.start();
        try{
            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}


class NewThread implements Runnable{
    private String ThreadName;

    NewThread(String ThreadName){
        this.ThreadName=ThreadName;
    }

    public void run(){
        for(int i=0;i<3;i++) {
            System.out.println(ThreadName+" is running "+i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
        System.out.println(ThreadName+" is stopped");

    }
}


//Output:
//        Thread1 is running 0
//        Thread1 is running 1
//        Thread1 is running 2
//        Thread1 is stopped
//        Thread2 is running 0
//        Thread3 is running 0
//        Thread2 is running 1
//        Thread3 is running 1
//        Thread2 is running 2
//        Thread3 is running 2
//        Thread2 is stopped
//        Thread3 is stopped
//
//        Process finished with exit code 0
