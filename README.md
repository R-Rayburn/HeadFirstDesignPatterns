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

Q: Based on our first implementation, which of the following applies?
- [x] A. We are coding to create implementations, not interfaces.
- [x] B. For every new display, we will need to alter the code.
- [x] C. We have no way to add/remove display elements at runtime.
- [ ] D. The display elements don't implement a common interface.
- [x] E. We haven't encapsulated the part that changes.
- [x] F. We are violating encapsulation of the WeatherData class.
