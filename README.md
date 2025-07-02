# Low-Level Design Patterns in Java

Low-Level Design (LLD) patterns in Java can elevate your code from functional to phenomenal. This repository explores 10 essential Java LLD patterns, each with practical insights and examples to help you write cleaner, more maintainable code. Whether you're building a small app or a large system, these patterns will streamline your development process and showcase your skills.

## Table of Contents
- [1. Singleton Pattern](#1-singleton-pattern-for-resource-control)
- [2. Factory Pattern](#2-factory-pattern-for-flexible-object-creation)
- [3. Builder Pattern](#3-builder-pattern-for-complex-objects)
- [4. Strategy Pattern](#4-strategy-pattern-for-swappable-behaviors)
- [5. Observer Pattern](#5-observer-pattern-for-event-handling)
- [6. Decorator Pattern](#6-decorator-pattern-for-flexible-enhancements)
- [7. Adapter Pattern](#7-adapter-pattern-for-compatibility)
- [8. Command Pattern](#8-command-pattern-for-action-encapsulation)
- [9. Facade Pattern](#9-facade-pattern-for-simplified-interfaces)
- [10. Template Method Pattern](#10-template-method-pattern-for-reusable-algorithms)

## Pattern Categories

### Creational Patterns
- **Singleton**: Control object instantiation
- **Factory**: Flexible object creation
- **Builder**: Complex object construction

### Behavioral Patterns
- **Strategy**: Swappable algorithms
- **Observer**: Event-driven communication
- **Command**: Action encapsulation
- **Template Method**: Reusable algorithm skeletons

### Structural Patterns
- **Decorator**: Dynamic feature enhancement
- **Adapter**: Interface compatibility
- **Facade**: Simplified subsystem access

---

## 1. Singleton Pattern for Resource Control

**Purpose**: Ensures a class has only one instance and provides a global point of access to it.

**Use Cases**:
- Database connections
- Configuration managers
- Logging services

**Key Benefits**:
- Prevents resource wastage
- Ensures consistent access across your application
- Controls instantiation

**⚠️ Caution**: Use wisely to avoid overcomplicating simple classes.

**📝 [View Example](src/main/java/com/xmacedo/singleton/SingletonExample.java)**

---

## 2. Factory Pattern for Flexible Object Creation

**Purpose**: Delegates object creation to a dedicated factory class, making your code more flexible and easier to extend.

**Use Cases**:
- Payment processors selection
- Database driver creation
- UI component generation

**Key Benefits**:
- Reduces tight coupling
- Simplifies maintenance
- Enables conditional object creation

**📝 [View Example](src/main/java/com/xmacedo/factory/FactoryExample.java)**

### Architecture Diagram
![Factory Pattern Diagram](images/factory-diagram.png)

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

--- 
## 3. Builder Pattern for Complex Objects

**Purpose**: Simplifies constructing objects with many optional fields through a fluent interface.

**Use Cases**:
- User profiles with varying attributes
- Configuration objects
- Complex data structures

**Key Benefits**:
- Improves code readability
- Avoids constructor bloat
- Enables step-by-step configuration

**📝 [View Example](src/main/java/com/xmacedo/builder/BuilderExample.java)**

---

## 4. Strategy Pattern for Swappable Behaviors

**Purpose**: Defines a family of algorithms and allows swapping them at runtime.

**Use Cases**:
- Sorting algorithms
- Payment processing strategies
- Validation rules

**Key Benefits**:
- Promotes flexibility and reusability
- Enables runtime algorithm switching
- Simplifies testing different approaches

**📝 [View Example](src/main/java/com/xmacedo/strategy/StrategyExample.java)**

---

## 5. Observer Pattern for Event Handling

**Purpose**: Enables objects to listen for changes in another object's state.

**Use Cases**:
- UI updates
- Event-driven systems
- Model-View architectures

**Key Benefits**:
- Decouples components
- Makes systems more modular
- Enables reactive programming

**⚠️ Caution**: Be cautious of memory leaks with long-lived observers.

**📝 [View Example](src/main/java/com/xmacedo/observer/ObserverExample.java)**

### Architecture Diagram
![Observer Pattern Diagram](images/Observer-diagram.png)

---

## 6. Decorator Pattern for Flexible Enhancements

**Purpose**: Adds functionality to objects dynamically without modifying their structure.

**Use Cases**:
- Adding logging to services
- Feature toggles
- Middleware chains

**Key Benefits**:
- Cleaner alternative to subclassing
- Enables optional features
- Maintains single responsibility

**📝 [View Example](src/main/java/com/xmacedo/decorator/DecoratorExample.java)**

---

## 7. Adapter Pattern for Compatibility

**Purpose**: Bridges incompatible interfaces to enable seamless integration.

**Use Cases**:
- Legacy system integration
- Third-party library adaptation
- API compatibility layers

**Key Benefits**:
- Ensures seamless communication
- Saves time on rewrites
- Enables gradual system migration

**💡 Tip**: Always document adapters clearly to avoid confusion.

**📝 [View Example](src/main/java/com/xmacedo/adapter/AdapterExample.java)**

---

## 8. Command Pattern for Action Encapsulation

**Purpose**: Encapsulates actions as objects, enabling undoable operations and queued tasks.

**Use Cases**:
- Task schedulers
- Undo/Redo functionality
- Macro recording

**Key Benefits**:
- Decouples requester from executor
- Enables operation history
- Supports queuing and logging

**📝 [View Example](src/main/java/com/xmacedo/command/CommandExample.java)**

### Architecture Diagram
![Command Pattern Diagram](images/command-diagram.png)

### Diagram: Command Pattern Flow
```
   +---------+       +---------+       +---------+
   | Invoker | ----> | Command | ----> | Receiver|
   +---------+       +---------+       +---------+
          |               ^                 |
          +---------------+-----------------+
                     execute()
```

---

## 9. Facade Pattern for Simplified Interfaces

**Purpose**: Provides a simplified interface to a complex subsystem.

**Use Cases**:
- Library with multiple modules
- Complex API simplification
- System integration layers

**Key Benefits**:
- Reduces complexity for clients
- Improves usability
- Hides implementation details

**⚠️ Caution**: Ensure the facade doesn't become a bloated catch-all.

**📝 [View Example](src/main/java/com/xmacedo/facade/FacadeExample.java)**

---

## 10. Template Method Pattern for Reusable Algorithms

**Purpose**: Defines a skeleton for an algorithm, allowing subclasses to customize specific steps.

**Use Cases**:
- Report generators
- Data processing pipelines
- Framework hooks

**Key Benefits**:
- Ensures consistency while allowing flexibility
- Promotes code reuse
- Standardizes process flow

**📝 [View Example](src/main/java/com/xmacedo/template_method/TemplateMethodExample.java)**

---

## Getting Started

### Prerequisites
- Java 8 or higher
- Maven or Gradle (for dependency management)

### Running the Examples
1. Clone this repository
2. Navigate to the project directory
3. Compile and run individual examples:
   ```bash
   javac src/main/java/com/xmacedo/[pattern]/[PatternName]Example.java
   java com.xmacedo.[pattern].[PatternName]Example
   ```

## Best Practices

- **Don't Overuse Patterns**: Apply patterns only when they solve real problems
- **Keep It Simple**: Choose the simplest solution that meets your needs
- **Document Your Decisions**: Explain why you chose specific patterns
- **Consider Performance**: Some patterns add overhead - measure when necessary
- **Test Thoroughly**: Patterns can add complexity - ensure good test coverage

## Contributing

Feel free to contribute by:
- Adding new pattern examples
- Improving existing documentation
- Reporting issues or suggesting improvements
- Adding unit tests for examples

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

**Happy Coding!** 🚀

