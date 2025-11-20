

# Factory Patterns – Overview with Cross-Platform UI Example

Factory patterns belong to the Creational Design Patterns category in object-oriented design.
Their main purpose is to encapsulate object creation, making systems more flexible, modular, and scalable.

Instead of creating objects directly using new, factory patterns allow us to delegate object creation to a dedicated component (factory) that decides which concrete class to instantiate.

⭐ Why Use Factory Patterns?

Factory patterns help when:
- You want to decouple object creation from object usage.
- You want to hide complex creation logic.
- You expect the system to grow (more platforms, types, features).
- You want to follow the Open/Closed Principle (add new behavior without modifying existing code).
- You want to create families of related objects in a consistent way.

This document explains **Simple Factory**, **Factory Method**, and **Abstract Factory** using an example of a cross-platform UI system (Android & iOS) with multiple components like **Button**, **Menu**, and **Dropdown**.

---

## 🏗️ Simple Factory (Static Factory)

A **Simple Factory** uses basic conditional logic (`if/else`, `switch`) to create objects.

### **When to Use**
- When object creation is based on a simple input.
- When all creation logic can stay inside one method.

### **Explanation**
In this example, we create a **Platform** object based on the user's input (e.g., `"android"` or `"ios"`).

We define:
- A `PlatformFactory` class.
- A **static** method that returns the correct `Platform` instance depending on the input.

---

## 🏗️ Factory Method

Use the **Factory Method Pattern** when the creation of one object depends on another object.

### **When to Use**
- When the creation of one object depends on another object.
- When you need to create **only a single component** based on a platform (e.g., just a Button).

### **Explanation**
We add a factory method inside the `Platform` interface, such as:

```text
createButton()
```
Each platform class (Android, iOS) implements this method to create platform-specific Button instances.

### **Limitations**
If there are multiple components such as:
- Button
- Menu
- Dropdown

then Factory Method becomes unmanageable because:
- The interface must expose multiple creation methods.
- Each platform must implement all these methods.
- Violates scalability and increases boilerplate code.

---

## 🏗️ Abstract Factory

The Abstract Factory Pattern is used to create families of related objects. (To support multiple components cleanly, we use the Abstract Factory Pattern.)

### **When to Use**
- When multiple related UI components must be created for each platform.
- When each platform must provide its own implementations for several components.


### **Explanation**

We create:
1. ComponentFactory Interface. It contains methods such as:
   - createButton()
   - createMenu()
   - createDropdown()


2. Platform-Specific Component Factories:
   - AndroidComponentFactory
   - iOSComponentFactory
   - These implement the interface and return platform-specific components.


3. Platform Code:
   - Contains logic to return the correct factory instance.
   - Does not need to change when new components are added.


### **Benefits:**
- Suitable for systems needing families of related objects.
- Easy to add new platforms — just create a new factory class.
- Does not require modifying platform code for new components.
- Scalable, clean, and follows the Open/Closed Principle.