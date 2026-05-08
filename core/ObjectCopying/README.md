# TODO: Refine this: Object Copying strategies in Java:


## Shallow copy:

Copying an object such that only the top level is copied into a new container while complex nested objects still point to the same underlying object is called as Shallow copy


## Deep copy:

Copying an object recursively such that both the top level objects and the nested objects within are copied recursively is called as Deep copy

[Deepcopy Example](./DeepCopy/DeepCopy.java)

```
Note: when you do something like this

Object A = new Object()
Object B = A

This is not a copy, this is just a reference assignment where you assign the memory reference of Object A to Object B
```