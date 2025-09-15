import java.util.concurrent.CompletableFuture;

class CompletableFutureExamples {

    public static void main(String args[]) {

        CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(200); } catch (InterruptedException e) { e.printStackTrace(); }
            return 42;
        });

        cf.thenAccept(result -> System.out.println("Got the result: " + result));

        System.out.println("Main thread continues...");

        // Wait for the async task to finish
        cf.join();
    }
}