# Synchronized

The `synchronized` keyword in Java is used to **control access to shared resources** in multithreaded programs. It ensures that **only one thread at a time** can execute a block of code or a method that manipulates shared data, preventing **race conditions**.

---

## Key Points

- **Mutex-like behavior:**  
  When a thread enters a `synchronized` method or block, it **locks** the associated object or class. Other threads trying to enter the same synchronized code will wait until the lock is released.

- **Prevents race conditions:**  
  Multiple threads trying to modify shared data simultaneously can lead to inconsistent results. `synchronized` ensures that updates happen **atomically**.


## Where `synchronized` Can Be Applied

`synchronized` can be used in three main ways, each with slightly different locking behavior:


### 1. Instance Methods → locks the instance (`this`)

When a **non-static method** is marked `synchronized`, it locks the **specific object instance**:

```java
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }
}
````

* Two threads calling `increment()` on the **same object** must wait for each other.
* Two threads calling `increment()` on **different objects** can run concurrently.


### 2. Static Methods → locks the class object

When a **static method** is marked `synchronized`, it locks the **`Class` object**:

```java
class Counter {
    private static int count = 0;

    public static synchronized void incrementStatic() {
        count++;
    }
}
```

* The lock is on `Counter.class`.
* Only **one thread** can execute any synchronized static method on this class at a time, across all instances.


### 3. Blocks → locks a specific object you specify

You can synchronize only a **part of a method** using a synchronized block:

```java
class Counter {
    private int count = 0;
    private final Object lock = new Object();

    public void increment() {
        synchronized(lock) {
            count++;
        }
    }
}
```

* Only the code inside the block is synchronized.
* The lock is on the object you specify (`lock` in this case).
* This allows **fine-grained control** and reduces contention compared to synchronizing the whole method.