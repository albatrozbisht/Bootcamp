import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Question5 {
    public static void main(String[] args) {
        ExecutorService executor1 = Executors.newFixedThreadPool(2);
        ExecutorService executor2 = Executors.newFixedThreadPool(2);
        executor1.submit(new Task("Task 1"));
        executor2.submit(new Task("Task 2"));

        try {
            if (!executor1.awaitTermination(500, TimeUnit.MILLISECONDS)) {
                executor2.shutdownNow();
                executor1.shutdown();

            }
        } catch (InterruptedException e) {
        }
    }

    static class Task implements Runnable {
        private String name;

        public Task(String name) {
            this.name = name;
        }

        public void run() {
            System.out.println(name + " is running...");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle the InterruptedException
                System.out.println(name + " was interrupted!");
            }
            System.out.println(name + " is done!");
        }
    }
}


//Output:
//        Task 1 is running...
//        Task 2 is running...
//        Task 2 was interrupted!
//        Task 2 is done!
//        Task 1 is done!
