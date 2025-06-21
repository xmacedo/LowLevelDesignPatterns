
# Low-Level Design patterns
Low-Level Design (LLD) patterns in Java can elevate your code from functional to phenomenal. 
This examples explores 10 essential Java LLD patterns, each with practical insights and examples to help you write cleaner, 
more maintainable code. Whether you’re building a small app or a large system, these patterns will streamline your development process and showcase your skills.

1. Singleton Pattern for Resource Control
- This pattern ensures a class has only one instance and provides a global point of access to it, 
perfect for managing shared resources like database connections. 
It prevents resource wastage and ensures consistent access across your application. Use it wisely to avoid overcomplicating simple classes.
<br> [Singleton Pattern Example](src/main/java/com/xmacedo/singleton/SingletonExample.java)
---
2. Factory Pattern for Flexible Object Creation
- This pattern delegates object creation to a dedicated factory class, making your code more flexible and easier to extend. 
It’s ideal when you need to create objects based on conditions, like choosing a payment processor. This pattern reduces tight coupling and simplifies maintenance.
<br> [Factory Pattern Example](src/main/java/com/xmacedo/factory/FactoryExample.java)
  
This factory creates the right processor based on input, keeping client code clean.
![factory-diagram.png](images/factory-diagram.png)

Diagram: Factory Pattern Structure
```
   +--------+       +-----------------+
   | Client | ----> | PaymentFactory  |
   +--------+       +-----------------+
                           |
                           v
             +-----------------------------+
             | PaymentProcessor Interface  |
             +-----------------------------+
                    ^               ^
                    |               |
         +----------------+   +----------------+
         | CreditCardProc |   | PayPalProcessor |
         +----------------+   +----------------+
```
Caption: Visualizing how the Factory pattern delegates object creation.

---
3. Builder Pattern for Complex Objects
- This pattern simplifies constructing objects with many optional fields, like a user profile with varying attributes. 
It improves readability and avoids constructor bloat. Use it for objects requiring step-by-step configuration.
<br> [Builder Patterrn Example](src/main/java/com/xmacedo/builder/BuilderExample.java)

---
4. Strategy Pattern for Swappable Behaviors
- The Strategy pattern lets you define a family of algorithms and swap them at runtime, like sorting methods for a dataset. 
It promotes flexibility and reusability, making your code easier to modify without changing core logic.
<br> [Strategy Pattern Example](src/main/java/com/xmacedo/strategy/StrategyExample.java)

This allows switching sorting algorithms without altering DataProcessor.

---
5. Observer Pattern for Event Handling
- The Observer pattern enables objects to listen for changes in another object’s state, ideal for event-driven systems like UI updates. 
It decouples components, making your system more modular. Be cautious of memory leaks with long-lived observers.
<br> [Observer Pattern Example](src/main/java/com/xmacedo/observer/ObserverExample.java)

This notifies traders when stock prices change.
![Observer-diagram.png](images/Observer-diagram.png)
---

6. Decorator Pattern for Flexible Enhancements
7. Adapter Pattern for Compatibility
8. Command Pattern for Action Encapsulation
9. Facade Pattern for Simplified Interfaces
10. Template Method Pattern for Reusable Algorithms
- The Template Method pattern defines a skeleton for an algorithm, allowing subclasses to customize steps, like a report generator. It ensures consistency while allowing flexibility. Use it for processes with fixed steps but variable details.
[Template Method Example](src/main/java/com/xmacedo/template_method/TemplateMethodExample.java)
