# 🧩 Registry Design Pattern

The **Registry Design Pattern** provides a **global access point** to a set of shared objects or services by storing them in a centralized **registry** (usually a HashMap or dictionary).  
It allows different parts of the application to **register**, **retrieve**, and **manage shared instances** without tightly coupling their creation or lifecycle.

---

## 📘 Concept

Instead of passing references of commonly used objects between multiple classes, you can **store those objects in a registry** and **fetch them globally** whenever needed.

This is especially useful when multiple components or modules need to access the same instance (like a logger, configuration object, or analytics session manager).

---

## ⚙️ How It Works

1. A **Registry class** (often a Singleton) maintains a map of key-value pairs:
    - **Key** → A unique identifier (string, enum, etc.)
    - **Value** → The object instance

2. Other parts of the system can:
    - **Register** an object using a unique key
    - **Retrieve** an object using that key whenever required

---

## ✅ Advantages
  - Centralized object management
  - Reduces duplication of shared instances
  - Makes commonly used objects globally accessible
  - Useful for dependency injection or service lookup

---

## ⚠️ Disadvantages
  - Can become a global state anti-pattern if misused (harder to test/debug)
  - May introduce tight coupling between modules and the registry
  - Requires thread-safety handling in concurrent systems

---

## 🕓 When to Use
- When multiple classes need access to the same instance (e.g., logger, configuration, SDK manager)
- When object creation is expensive, and reuse is desired
- When you want a centralized lookup mechanism for shared services

---

## 🔗 Relation to Prototype Pattern

This pattern often works alongside the Prototype Design Pattern.
In many implementations, the get() method of the registry returns a clone of the stored object (created via the prototype’s clone() method) instead of the original instance to avoid unintended side effects.