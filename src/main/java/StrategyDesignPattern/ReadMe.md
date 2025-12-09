# ✅ Strategy Design Pattern

The Strategy Pattern is used when we want to define a family of algorithms, encapsulate each one, and make them interchangeable at runtime.

It helps to avoid writing large if-else or switch blocks when we want different behavior based on some condition.

### ✔ What it does:
- Defines a common interface for all strategies (algorithms).
- Lets you switch strategies dynamically.
- Makes code cleaner, extensible, and follows Open/Closed Principle.


## 🎯 Real-World Analogy

Imagine you are using a data processor to sort data:

**You can sort by:**
- Insertion Sorting Algorithm
- Quick Sorting Algorithm
- Merge Sorting Algorithm

All these are different strategies for the same task: sort data. 
Data processor can sort the data using user given sorting strategy or it can pick the correct sorting algorithm based on the input data size at runtime.


## ⚡ Where Strategy Pattern Is Used in Real Life?
- Sorting algorithms (Java uses this internally)
- Compression algorithms (Zip, RAR, Tar)
- Payment methods
- Routing algorithms in navigation apps
- Choosing different ad targeting algorithms in SDKs 😉 (fits your domain)