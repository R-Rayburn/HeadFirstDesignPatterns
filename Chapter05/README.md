## Chapter 5

### Singleton Pattern
Ensures a class has only one instance and provides a global point of
access to it.

### Other things we learned form this chapter:
- There are different options for a Singleton to handle multithreading:
    1. Do nothing if the performance of the `getInstance()` method isn't
       critical to the application.
    2. Move to an eagerly created instance rather than a lazily created
       one.
        - Useful when the application always creates an instance of the
          Singleton, or the overhead of creation and runtime aspects of
          the Singleton isn't onerous.
    3. Use "double-checked locking" to reduce the use of synchronization
       in `getInstance()`.
        - If performance is an issue, this implementation can drastically
          reduce overhead.

### Bullet Point
- The Singleton Pattern ensures you have at most one instance of a
  class in your application.
- The Singleton Pattern also provides a global access point to that
  instance.
- Java's implementation of the Singleton Pattern makes use of a private
  constructor, a static method combined with a static variable.
- Examine your performance and resource constraints and carefully choose
  an appropriate Singleton implementation for multithreaded applications
  (and all applications should be considered multithreaded).
- Beware of the double-checked locking implementation; it is not thread
  safe in versions prior to Java 5.
- Be careful if using multiple class loaders; this could defeat the
  singleton implementation and result in multiple instances.
- Java's enums can be used to simplify a Singleton implementation.