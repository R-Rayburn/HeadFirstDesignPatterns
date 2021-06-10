## Chapter 9

### Iterator Pattern
Provide a way to access the elements of an aggregate object
sequentially without exposing its underlying representation.

### Composite Pattern
Compose objects into tree structures to represent part-whole
hierarchies. Composite lets clients treat individual objects
and compositions of objects uniformly.

### Principles to know
- A class should only have one reason to change
    - Known as the Single Responsibility Principle

### Bullet Points
- An Iterator allows access to an aggregate’s elements
  without exposing its internal structure.
- An Iterator takes the job of iterating over an aggregate
  and encapsulates it in another object.
- When using an Iterator, we relieve the aggregate of the
  responsibility of supporting operations for traversing
  its data.
- An Iterator provides a common interface for traversing
  the items of an aggregate, allowing you to use
  polymorphism when writing code that makes use of the
  items of the aggregate.
- There can be an external iterator, meaning the client
  controls the iteration by calling `next()`, or an
  internal iterator, meaning it is controlled by
  the iterator itself. Internal iterators are less flexible
  than external ones, because the client doesn't have
  control of the iteration. Some might argue that internal
  iterators are easier to use, since you can just hand them
  an operation and tell them to iterate, and they do all the
  work for you.
- The Iterable interface provides a means of getting
  an iterator and enables Java’s enchanced for loop.
- We should strive to assign only one responsibility
  to each class.
- The Composite Pattern allows clients to treat
  composites and individual objects uniformly.
- A Component is any object in a Composite structure.
  Components may be other composites or leaves.
- There are many design tradeoffs in implementing
  Composite. You need to balance transparency and
  safety with your needs.