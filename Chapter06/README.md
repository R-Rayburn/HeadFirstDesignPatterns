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