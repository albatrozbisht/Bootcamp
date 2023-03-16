import java.util.concurrent.*;

public class Question1{
    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Thread.currentThread().getName();
            }
        };

        Future<String> future = executor.submit(callable);
        System.out.println(future.get());
        executor.shutdown();


    }
}


//Output:
//        pool-1-thread-1