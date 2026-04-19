# Mutex:

A Mutex (Mutual exclusion) is a type of locking pattern used to control access to a shared resource. In concurrent programs two or more threads might want to access a shared resource (like data structures, files, network connections) at the same time, this could lead to unexpected behaviors. This phenomenon is known as a race condition.

There are two primary ways to implement Mutexes in Java

1. [Using the Synchronized keyword](./Synchronized/README.md)
2. [Using Reentrant Locks](./Reentrant/README.md)