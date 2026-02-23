# Four main Functional interface shapes:

| Interface Type   | Syntax        | Description                                                     |
|------------------|---------------|-----------------------------------------------------------------|
| Predicate<T>     | T -> boolean  | Takes an object and returns a boolean. |
| Function<T, R>   | T -> R        | Transforms an input into a different output.                    |
| Consumer<T>      | T -> void     | "Consumes" an object (e.g., printing or saving to a DB).        |
| Supplier<T>      | () -> T       | Provides a new object without taking any input.                 |