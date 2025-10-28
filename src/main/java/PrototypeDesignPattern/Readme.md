# 🧩 Prototype Design Pattern

The **Prototype Design Pattern** is a *creational design pattern* used to **create a clone (copy)** of an existing object instead of constructing a new one from scratch.

---

## 💡 Problem Without Prototype Pattern

Without using the prototype pattern, cloning objects typically involves:

1. **Manual Copy**
    - Create a new object and **manually assign all values** from the old object to the new one.
    - This becomes repetitive and error-prone when cloning multiple objects.

2. **Copy Constructor**
    - Use a constructor that accepts another instance and copies its fields.
    - However:
        - It’s **not scalable** if there are too many parameters.
        - It’s **not possible** if all properties are private and there are **no getters**.

---

## ⚙️ Prototype Pattern Solution

The **Prototype Design Pattern** simplifies object cloning by defining a dedicated `clone()` method inside the class itself.

### ✅ Key Idea

> Provide a `clone()` method in the class so that clients can easily create as many copies as needed, without worrying about the object’s internal structure.

### Example Flow
1. The class implements a `clone()` method.
2. Inside this method, create a **new object** using a copy constructor (or deep copy logic).
3. Return the newly created object.

This approach makes object duplication clean, consistent, and encapsulated.

---

## 🧱 Relation with Registry Pattern

The **Registry Design Pattern** often works hand-in-hand with the Prototype pattern.

- The **Registry** stores all objects in **key–value pairs** (e.g., `"circle" -> CircleObject`).
- When the client requests an object, the registry usually returns a **clone of the stored object**, not the original instance.

### Why return a clone?
To ensure that the retrieved object is **independent** and **modifications** on it do not affect the prototype stored in the registry.

---

## 📘 Summary

| Concept | Description |
|----------|--------------|
| **Pattern Type** | Creational |
| **Intent** | Create new objects by cloning existing ones |
| **Key Method** | `clone()` |
| **Used With** | Registry Pattern (for global object management) |
| **Advantages** | Reduces object creation cost, avoids repetitive setup code |
| **Common Use Case** | Object templates, configurations, and runtime cloning |

---

> **In short:**  
> The Prototype Pattern makes object duplication flexible and efficient,  
> and when combined with the Registry Pattern, it enables easy global access and cloning of predefined templates.