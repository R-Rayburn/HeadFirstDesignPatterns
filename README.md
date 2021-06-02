# HeadFirstDesignPatterns
Examples from Head First Design Patterns book
___
## Basics of OO
#### Abstraction
#### Encapsulation
#### Polymorphism
#### Inheritance
___
## Chapter 1

### Strategy Pattern
The Strategy Pattern defines a family of algorithms, encapsulates each one,
and makes them interchangeable.
Strategy lets the algorithm vary independently of clients that use it.

### Principles to know
- Encapsulate what varies
  - If there are different values, move it out into its own instance.
- Favor composition over inheritance
  - has-a can be better than is-a
- Program to an interface, not an implementation
  - Pros for this is that testing is easier, and it prevents brittle code

### Other things we learned from this chapter:
- Knowing the OO basics does not make you a good OO designer.
- Good OO designs are reusable, extensible, and maintainable.
- Patterns show you how to build systems with good OO design qualities.
- Patterns are proven object-oriented experience.
- Patterns don’t give you code, they give you general solutions to design
  problems. You apply them to your specific application.
- Patterns are not invented, they are discovered.
- Most patterns and principles address issues of change in software.
- Most patterns allow some part of a system to vary independently of all 
  other parts.
- We often try to take what varies in a system and encapsulate it.
- Patterns provide a shared language that can maximize the value of your
  communication with other developers.
---
## Chapter 2

### Observer Pattern
Defines a **one-to-many** (one subject, many observers)
dependency between objects so that when one object
changes state; all of its dependents are notified
and updated automatically.\
_Supposedly the most commonly used pattern._\
_Real World Example: Subscription with a publisher
(subject) and subscribers (observers)_

### Principles to know
- Strive for loosely coupled designs between objects
  that interact.

Other Notes:
- **Loose coupling**
  - Means there is a minimized interdependency between objects.
  - The only thing the subject knows about an observer
    is that it implements a certain interface (the Observer interface),
    It does not need to know anything about the concrete class.
  - New observers can be added at any time.
  - We never need to modify the subject to add new observers.
  - We can reuse subjects or observers independently of each other.
  - Changes to either the subject, or an observer will
    not affect the other.
- How many kinds of change can be identified here?

### Other things we learned from this chapter:
- Subjects update Observers using a common interface
- Observers of any concept type can participate in the pattern
  as long as they implement the Observer interface.
- Observers are loosely coupled in that the Subject
  knows nothing about them, other than that they implement
  the Observer interface.
- You can push or pull data from the Subject when using
  this patter (pull is more "correct").
- Swing makes heavy use of the Observer Patter, as do
  many GUI frameworks.
- This pattern exists in many other places, including
  RxJava, JavaBeans, and RMI, as well as other language
  frameworks, like Cocoa, Swift, and JavaScript events.
- The Observer Pattern is related to the Publish/Subscribe
  Pattern, which is for more complex situations with
  multiple Subjects and/or multiple message types.
- The Observer Pattern is a commonly used pattern, and
  will be viewed again with the Model-View-Controller.

Q: Based on our first implementation, which of the following applies?
- [x] A. We are coding to create implementations, not interfaces.
- [x] B. For every new display, we will need to alter the code.
- [x] C. We have no way to add/remove display elements at runtime.
- [ ] D. The display elements don't implement a common interface.
- [x] E. We haven't encapsulated the part that changes.
- [ ] F. We are violating encapsulation of the WeatherData class.
---
## Chapter 3

### Decorator Pattern
Attach additional responsibilities to an object dynamically.
Provides a flexible alternative to subclassing for extended functionality.
Satisfies the Open-Close principle.

### Principles to know
- Classes should be **open** for extension but **closed** for modification.

### Other things we learned from this chapter:
- Inheritance is one form of extension, but not necessarily the best way
  to achieve flexibility in our designs.
- In our designs we should allow behavior to be extended without the need
  to modify existing code.
- Composition and delegation can often be used to add new behaviors at
  runtime.
- The Decorator Pattern provides an alternative to subclassing for
  extending behavior.
- The Decorator Pattern involves a set of decorator classes that are used
  to wrap concrete components.
- Decorator classes mirror the type of the components they decorate. 
  (In fact, they are the same type as the components they decorate, either
  through inheritance or interface implementation.)
- Decorators change the behavior of their components by adding new 
  functionality before and/or after (or even in place of) method calls
  to the component.
- You can wrap a component with any number of decorators.
- Decorators are typically transparent to the client of the 
  component — that is, unless the client is relying on the component’s
  concrete type.
- Decorators can result in many small objects in our design, and overuse
  can be complex.
---
## Chapter 4

### Factory Method Pattern
Defines an interface for creating an object, but lets subclasses decide
which class to instantiate. Factory Method lets a class defer
instantiation to subclasses.

### Abstract Factory Pattern
Provides an interface for creating families of related or dependent
objects without specifying their concrete classes.

### Principles to know
- Depend upon abstractions. Do not depend upon concrete classes.
  - Not necessarily "Program to an interface, not an implementation",
    but also suggests high-level components shouldn't depend on
    low-level components; rather they both depend on abstractions.
  - Guidelines (to strive for, not strictly follow):
    - No variable should hold a reference to a concrete class.
    - No class should derive from a concrete class.
    - No method should override an implemented method of its base classes.

### Other things we learned from this chapter:
- In design patterns, the phrase “implement an interface” does NOT
  always mean “write a class that implements an interface, by using the
  ‘implements’ (Java) keyword in the class declaration.” In the general
  use of the phrase, a concrete class implementing a method from a
  supertype (which could be a abstract class OR interface) is still
  considered to be “implementing the interface” of that supertype.
- A <u>factory method</u> handles object creation and encapsulates it
  in a subclass. This decouples the client code in the superclass
  from the object creation code in the subclass.
- ```java
  abstract Product factoryMethod(String type);
  ```
  - A factory method is abstract, so the subclasses are counted on to
    handle object creation.
  - A factory method returns a <u>Product</u> that is typically used 
    within methods defined in the superclass.
  - A factory method isolates the <u>Client</u> (the code in the
    superclass, like orderPizza()) from knowing what kind of concrete
    Product is actually created.
  - A factory method may be parameterized (or not) to select among
    several variations of a product.
- Factory Method Pattern has Creator classes and Product classes:
  - Creator classes cover both abstract and concrete classes. The 
    abstract creator class defines an abstract factory methods that 
    the concrete creator subclasses implement to produce products. 
    Often the creator contains code that depends on an abstract product,
    which is produced by a subclass. The creator never really knows
    which concrete product was produced.
  - Product classes cover both abstract and concrete classes. An
    abstract factory may reference an abstract product class, but the 
    concrete factory will instantiate a concrete product to the 
    abstract property.
- Products must implement the same interface so that the classes that 
  use the products can refer to the interface, not the concrete class.
- Creator is a class that contains the implementations for all the 
  methods to manipulate products, except for the factory method.
- The abstract factoryMethod() is what all Creator subclasses must 
  implement.
- ConcreteCreator implements the factoryMethod(), which is the method 
  that produces products.
- ConcreteCreator is responsible for creating one or more concrete 
  products. It is the only class that has the knowledge of how to
  create these products.
- Often, methods in an Abstract Factory are implemented as factory 
  methods.
- Factory Method creates objects through interfaces, while Abstract
  Factory does it through object composition
  
### Bullet Points
- All factories encapsulate object creation.
- Simple factory, while not a bona fide design pattern, is a simple way
  to decouple clients from concrete classes.
- Factory Method relies on inheritance: object creation is delegated to 
  subclasses, which implement the factory method to create objects.
- Abstract Factory relies on object composition: object creation is 
  implemented in methods exposed in the factory interface.
_ All factory patterns promote loose coupling by reducing the dependency
  of your application on concrete classes.
- The intent of Factory Method is to allow a class to defer instantiation
  to its subclasses.
_ The intent of Abstract Factory is to create families of related objects
  without having to depend on their concrete classes.
- The Dependency Inversion Principle guides us to avoid dependencies on
  concrete types and to strive for abstractions.
- Factories are a powerful technique for coding to abstractions, not 
  concrete classes.
---
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
---
## Chapter 6

### Command Pattern
Encapsulates a request as an object, thereby letting you parameterize other
objects with different requests, queue or log requests and support undoable
operations.

### Other things we learned from this chapter:
- NUll Object Pattern:
  - While not a true pattern, this is something that is used alongside other
    patterns. This works by removing handling null from the client by adding
    a surrogate object that does nothing.
- Commands can be added to a queue that can later be picked up by threads on
  timed selections by different threads.

### Bullet Points
- The Command Pattern decouples an object making a request from the one that
  knows how to perform it.
- A Command object is at the center of this decoupling and encapsulates a
  receiver with an action (or set of actions).
- An invoker makes a request of a Command object by calling its execute()
  method, which invokes those actions on the receiver.
- Invokers can be parameterized with Commands, even dynamically at runtime.
- Commands may support undo by implementing an undo() method that restores
  the object to its previous state before the execute() method was last
  called.
- MacroCommands are a simple extension of the Command Pattern that allows
  multiple commands to be invoked. Likewise, MacroCommands can easily support
  undo().
- In practice, it's not uncommon for "smart" Command objects to implement the
  request themselves rather than delegating to a receiver.
- Commands may also be used to implement logging and transactional systems.

### Real world example of Command Pattern
- Waitress         --> Invoker
- Short-Order Cook --> Receiver
- orderUp()        --> execute()
- Order            --> Command
- Customer         --> Client
- takeOrder()      --> setCommand()

---
## Chapter 7

### Adapter Pattern
Converts the interface of a class into another interface the clients expect.
Adapter lets classes work together that couldn't otherwise because of compatible
interfaces.

### Facade Pattern
Provides a unified interface to a set of interfaces in a subsystem. Facade defines
a higher-level interface that makes the subsystem easier to use.

### Principles to know
- Talk only to your immediate friends.
  - This means only invoke methods that belong to; the object itself, objects
    passed in as a parameter of a method, any object the method creates or
    instantiates, or any components of the object.
  - Often referred to as the Principle of Least Knowledge (Law of Demeter).
  - Pros:
    - reduces dependencies between objects
    - reduces software maintenance
  - Cons:
    - results in more wrapper classes to handle method calls to other components.
    - increased complexity and development time
    - decreased runtime performance

### Bullet Points
- When you need to use an existing class and its interface is not the one you need,
  use an adapter.
- When you need to simplify and unify a large interface or complex set of interfaces,
  use a facade.
- An adapter changes an interface into one a client expects.
- A facade decouples a client from a complex system.
- Implementing an adapter may require little work, or a great deal of work depending
  on the size and complexity of the target interface.
- Implementing a facade requires that we compose the facade with its subsystem and
  use delegation to perform the work of the facade.
- There are two forms of the Adapter Pattern: object and class adapters. Class
  adapters require multiple inheritance.
- You can implement more than one facade for a subsystem.
- An adapter wraps an object to change its interface, a decorator wraps an object
  to add new behaviors and responsibilities, and a facade "wraps" a set of objects
  to simplify.

---
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
