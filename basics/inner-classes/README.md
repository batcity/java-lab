# Inner Classes

An **Inner Class** is a class defined within another class. Unlike a standard class, a non-static inner class is associated with a specific **instance** of the outer class.

## Key Concepts

- **Access:** Inner classes have a "backstage pass"—they can access all members of the outer class, including those marked `private`.
- **Encapsulation:** By marking an inner class as `private`, you ensure it cannot be accessed or instantiated from classes outside of the parent class.
- **Instantiation Syntax:** To create the inner object, you must use an existing outer object: `outerInstance.new InnerClass()`.
