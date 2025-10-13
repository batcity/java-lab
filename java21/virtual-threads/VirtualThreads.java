import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

class VirtualThreads {
    public static void main(String args[]) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3000); // Limited pool
        CountDownLatch latch = new CountDownLatch(10_000);
        IntStream.range(0, 10_000).forEach(i ->
            executor.submit(() -> {
                try {
                    Thread.sleep(10); // Simulate blocking I/O
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    latch.countDown();
                }
            })
        );
        latch.await();
        executor.shutdown();
        long endtime = System.currentTimeMillis();
        System.out.println("The task took: " + (endtime - startTime) + " milliseconds with traditional threads");



        long startTimeVirtual = System.currentTimeMillis();
        try (var virtualThreadExecutor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 10_000).forEach(i ->
                virtualThreadExecutor.submit(() -> {
                    // Simulate some I/O
                    Thread.sleep(10);
                    return i;
                })
            );
        }
        long endTimeVirtual = System.currentTimeMillis();
        System.out.println("The task took: " + (endTimeVirtual - startTimeVirtual) + " milliseconds with virtual threads");
    }
}