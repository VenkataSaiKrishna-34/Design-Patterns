
# Decorator Pattern

The Decorator Design Pattern is a structural design pattern that lets you dynamically add new behaviors or responsibilities to an object without modifying its original class.
It is used to extend functionality in a flexible and reusable way.

### **✅ What Problem It Solves**

Sometimes you want to add features to an object, but:
- You don’t want to modify the base class (Open/Closed Principle).
- You want to combine features dynamically (not fixed subclasses).
- You want to avoid creating many subclasses for every combination of features.

### **🎯 Core Idea**
- You have a base interface (e.g., Coffee).
- You have a concrete implementation (e.g., Americano).
- You create Decorator classes that wrap the base object and add behavior.

### **Each decorator:**
- Has the same interface as the object it decorates.
- Holds a reference to the wrapped object.
- Adds extra logic before/after delegating the call.


### **⭐ When to Use the Decorator Pattern**

Use it when:
- You need to add responsibilities to objects at runtime.
- You want to avoid huge numbers of subclasses.
- Using inheritance will cause tight coupling or code duplication.
- You follow the Open/Closed Principle (open for extension, closed for modification).