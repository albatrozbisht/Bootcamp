import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Question4 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es= Executors.newSingleThreadExecutor();
        Future<String> future = es.submit(() ->
        {

            Thread.sleep(2000);
            return "Welcome";
        });
        while(!future.isDone()){
            System.out.println("waiting");
            Thread.sleep(200);

        }
        System.out.println("future completed");

        String s=future.get();

        System.out.println(s);

        es.shutdown();
    }
}