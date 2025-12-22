# Records:

Records are special types of classes (introduced in Java 16) that are useful while declaring data carrier classes, the main benefits of records are that they reduce boilerplate and signal to other devs that this class is a data carrier. Record fields are private and final, meaning the field references are immutable. However, records are only shallowly immutable; mutable objects (example: List) stored inside a record can still be modified.


Records should define their fields in the record header, the fields can either have a declared data type or can be generic

Records automatically generate the following methods

- accessor methods for the declared fields
- constructor that matches the record declaration
- toString, hashcode and equals methods