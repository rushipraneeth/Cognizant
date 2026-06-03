import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exercise41 {

    public static void main(String[] args)
            throws Exception {

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        List<Callable<Integer>> tasks =
                new ArrayList<>();

        tasks.add(() -> 10 + 20);
        tasks.add(() -> 30 + 40);
        tasks.add(() -> 50 + 60);

        List<Future<Integer>> results =
                executor.invokeAll(tasks);

        for (Future<Integer> result : results) {

            System.out.println(
                    result.get()
            );
        }

        executor.shutdown();
    }
}