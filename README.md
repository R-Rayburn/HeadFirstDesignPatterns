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
The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
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
- Patterns don’t give you code, they give you general solutions to design problems. You apply them to your specific application.
- Patterns are not invented, they are discovered.
- Most patterns and principles address issues of change in software.
- Most patterns allow some part of a system to vary independently of all other parts.
- We often try to take what varies in a system and encapsulate it.
- Patterns provide a shared language that can maximize the value of your communication with other developers.
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
- Inheritance is one form of extension, but not necessarily the best way to
  achieve flexibility in our designs.
- In our designs we should allow behavior to be extended without the need to
  modify existing code.
- Composition and delegation can often be used to add new behaviors at runtime.
- The Decorator Pattern provides an alternative to subclassing for extending
  behavior.
- The Decorator Pattern involves a set of decorator classes that are used to
  wrap concrete components.
- Decorator classes mirror the type of the components they decorate. 
  (In fact, they are the same type as the components they decorate, either
  through inheritance or interface implementation.)
- Decorators change the behavior of their components by adding new 
  functionality before and/or after (or even in place of) method calls
  to the component.
- You can wrap a component with any number of decorators.
- Decorators are typically transparent to the client of the component — that
  is, unless the client is relying on the component’s concrete type.
- Decorators can result in many small objects in our design, and overuse
  can be complex.
