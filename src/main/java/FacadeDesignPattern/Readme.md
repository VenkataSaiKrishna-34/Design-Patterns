
# Facade Pattern

The Facade Design Pattern is a structural design pattern that provides a simple, unified interface to a complex system of classes, libraries, or frameworks.

---

### **🎯 Purpose**
A Facade hides complexity and provides a clean, easy-to-use interface for the outside world.

---

### **🧠 Why Use It?**
- To simplify interactions with complex subsystems
- To reduce dependencies between client and internal systems
- To provide a single entry point for commonly used features
- To improve readability and maintainability

---

### **📦 Real-World Analogy**
Think of a hotel reception:
- You don’t go to housekeeping, room service, billing, and concierge separately.
- You just talk to one receptionist, and they coordinate everything behind the scenes.

The receptionist = Facade
Hotel services = Subsystems

---

### **🔧 Example in Code (Simple)**
**Without Facade (complex for client)**
```java
AudioSystem audio = new AudioSystem();
VideoSystem video = new VideoSystem();
LightSystem lights = new LightSystem();

audio.turnOn();
video.turnOn();
```

**With Facade**
```java
HomeTheaterFacade theater = new HomeTheaterFacade();
theater.startMovie();
```
**Implementation**
```java
class AudioSystem {
    void turnOn() { System.out.println("Audio ON"); }
}

class VideoSystem {
    void turnOn() { System.out.println("Video ON"); }
}

class LightSystem {
    void dim() { System.out.println("Lights dimmed"); }
}

// Facade
class HomeTheaterFacade {
    private AudioSystem audio = new AudioSystem();
    private VideoSystem video = new VideoSystem();
    private LightSystem lights = new LightSystem();

    void startMovie() {
        audio.turnOn();
        video.turnOn();
        lights.dim();
        System.out.println("Movie started!");
    }
}
```


### **⭐ When to Use the Decorator Pattern**

- You have a complex system with many classes
- You want to decouple clients from the system
- You want to create a simple API over an existing system