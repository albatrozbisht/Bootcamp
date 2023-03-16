import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question3 {
    public static void main(String[] args) throws InterruptedException{
        List<Runnable> list = new ArrayList<>();
        list.add(() -> System.out.println("Task 1"));
        list.add(() -> System.out.println("Task 2"));
        list.add(() -> System.out.println("Task 3"));

        ExecutorService executor1 = Executors.newSingleThreadExecutor();
        executeTasks(executor1, list);

        ExecutorService executor2 = Executors.newCachedThreadPool();
        executeTasks(executor2, list);

        ExecutorService executor3 = Executors.newFixedThreadPool(2);
        executeTasks(executor3, list);

    }


    private static void executeTasks(ExecutorService executor, List<Runnable> tasks) throws InterruptedException {
        for (Runnable task : tasks) {
            executor.submit(task);
        }

        executor.shutdown();
    }
}


//Output:
//        Task 1
//        Task 2
//        Task 1
//        Task 2
//        Task 3
//        Task 1
//        Task 3
//        Task 2
//        Task 3
//
//        Process finished with exit code 0
