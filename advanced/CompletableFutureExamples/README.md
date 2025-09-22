# CompletableFuture

`CompletableFuture` was introduced in **Java 8** to facilitate **asynchronous, non-blocking programming**. It implements the `Future` interface from Java 5 but extends its capabilities with a rich API for **chaining, combining, and handling asynchronous computations**.

> **Important clarification about `Future`:**  
> A `Future` **does not by itself run tasks asynchronously**. It's just a handle to retrieve the result of a task. To execute a task asynchronously, you must submit it to an `ExecutorService`. Even then, calling `future.get()` **blocks the thread** until the result is ready.  
>
> In contrast, `CompletableFuture` can **run tasks asynchronously on another thread automatically** (using `supplyAsync` or `runAsync`) and provides **non-blocking ways to handle results**.

## Key Advantages Over `Future`

- **Automatic asynchronous execution**: Methods like `supplyAsync` and `runAsync` run tasks on another thread automatically, without needing an explicit executor.  
- **Non-blocking callbacks**: Chain actions using `thenApply`, `thenAccept`, or `thenCompose` without blocking the main thread.  
- **Combining multiple async tasks**: Wait for several futures to complete with `allOf` or `anyOf`.  
- **Better error handling**: Methods like `exceptionally` and `handle` allow you to manage exceptions gracefully.  
- **Keeps main thread free**: Unlike `Future.get()`, you can react to results as soon as they are ready without stopping the main thread.