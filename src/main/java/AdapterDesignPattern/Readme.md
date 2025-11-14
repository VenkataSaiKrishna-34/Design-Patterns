# 🧩 Adapter Design Pattern

The **Adapter Design Pattern** is a structural pattern that allows two incompatible interfaces to work together. It acts as a **bridge** between an existing class (Adaptee) and the interface expected by the client (Target).

---

## 📌 Definition
The adapter converts the interface of a class into another interface that the client expects.

---

## 📌 Why Use Adapter Pattern?
- To make incompatible classes collaborate.
- To reuse existing or third-party code without modifying it.
- To integrate legacy systems into modern applications.
- To unify multiple different APIs under a common interface.

---

## 🛠 How It Works
- **Target** → Interface your application expects
- **Adaptee** → Existing class with incompatible interface
- **Adapter** → Converts Target requests into Adaptee calls

---

## 🔌 Real-World Analogy
A charger plug doesn’t fit into the wall socket → you use a **plug adapter**.  
The charger and socket remain unchanged, but they work together through the adapter.

---

Client → Target → Adapter → Adaptee

---

## 📘 Code Example

### Target Interface
```java
public interface PaymentGateway {
    void pay(double amount);
}
```

### Adaptee
```java
public class YesBankAPI {
    public void makeTransaction(double amt) {
        System.out.println("Transaction done via YesBank: " + amt);
    }
}
```

### Adapter
```java
public class YesBankAdapter implements PaymentGateway {

    private YesBankAPI bankAPI;

    public YesBankAdapter(YesBankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    @Override
    public void pay(double amount) {
        bankAPI.makeTransaction(amount);
    }
}
```

---

## 👉 When to Use
- When the interface of an existing class does not match the required interface.
- When you cannot modify the existing (legacy/third-party) class.
- When you want to convert multiple different APIs into a uniform interface.

---