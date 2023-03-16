import java.util.concurrent.*;

public class Question4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> callable = new Callable<Integer>() {

            public Integer call() throws Exception {
                // Random generator = new Random();
                // Integer randomNumber = generator.nextInt(5);
                return (int)(Math.random()*100);
            }
        };
        Future<Integer> future = executor.submit(callable);

        int result = future.get();
        System.out.println(result);
        executor.shutdown();
    }
}


//Output:
//        53