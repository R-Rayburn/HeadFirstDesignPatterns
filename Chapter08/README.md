## Chapter 8

### Template Method Pattern
Define the skeleton of an algorithm in an operation,
deferring some steps to subclasses. Lets subclasses
redefine certain steps of an algorithm without changing
the algorithm's structure.

### Principles to know
- Don't call us, we'll call you.
    - Also called the Hollywood Principle.
    - Helps prevent dependency rot by allowing low level
      components to hook into a system, and the high level
      components determine when to use them.
        - Dependency rot is when high-level components depend on
          low level components, that depend on high level components
          that depend on sideways components that depend on etc.
    - A technique for building frameworks or components so that
      lower level components can be hooked into the computation, but
      without creating dependencies between the lower level components,
      and the higher level layers.

### Bullet Points
- A template method defines the steps of an algorithm, deferring
  to subclasses for the implementation of those steps.
- The Template Method Pattern gives us an important technique
  for code reuse.
- The template method’s abstract class may define concrete
  methods, abstract methods, and hooks.
- Abstract methods are implemented by subclasses.
- Hooks are methods that do nothing or default behavior
  in the abstract class, but may be overridden in the subclass.
- To prevent subclasses from changing the algorithm in the
  template method, declare the template method as final.
- The Hollywood Principle guides us to put decision making
  in high-level modules that can decide how and when to
  call low-level modules.
- You’ll see lots of uses of the Template Method Pattern
  in real-world code, but (as with any pattern) don’t
  expect it all to be designed “by the book.”
- The Strategy and Template Method Patterns both
  encapsulate algorithms, the first by composition and the
  other by inheritance.
- Factory Method is a specialization of Template Method.
