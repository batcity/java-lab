# Stream API:

The Stream API allows devs to apply functions to a **sequence** of items

### Key Characteristics

* **Non-Interfering:** Operations on a stream do not modify the original data source (e.g., the underlying `List` or `Set` remains unchanged).
* **Consumable:** A stream is a "one-shot" object. Once a terminal operation (like `collect` or `forEach`) is called, the stream is closed and cannot be reused.
* **Lazy Execution:** Intermediate operations (like `filter` or `map`) are not executed immediately. They are only triggered when a terminal operation is invoked.

### Execution Modes
The Stream API offers two ways to process data, which developers can define based on the size and complexity of the task:

* **Sequential (Default):** Elements are processed one after another in a single thread using the `.stream()` method.
* **Parallel:** Elements are partitioned and processed across multiple CPU cores using the `.parallelStream()` method. This is typically reserved for large datasets where the overhead of thread management is justified.



### The Stream Pipeline
A typical stream operation follows a three-step flow:
1. **Source:** Where the data comes from (e.g., `myList.stream()`).
2. **Intermediate Operations:** Functions that transform the stream into another stream (e.g., `.filter()`, `.map()`).
3. **Terminal Operation:** A final step that produces a result or a side-effect (e.g., `.toList()`, `.count()`).