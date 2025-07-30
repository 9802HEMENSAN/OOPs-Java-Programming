 ### 🧠 Concepts Behind the Problem

Java supports **multithreading**, which allows concurrent execution of two or more threads (smaller units of a process). Here are the key concepts:

---

### 💡 Key Concepts

1. **Thread Class**:
   In Java, a thread can be created by:

   * Extending the `Thread` class.
   * Implementing the `Runnable` interface.

2. **run() Method**:
   The `run()` method contains the code that the thread will execute.

3. **start() Method**:
   This method starts the thread by calling the `run()` method in a separate call stack.

4. **Thread Priority**:

   * Java threads have priority levels from 1 (lowest) to 10 (highest).
   * Default priority is 5.
   * You can set priority using `setPriority(int)` method.

5. **Thread Scheduler**:
   Thread execution order is **not guaranteed** and is handled by the **JVM thread scheduler** based on priority and other factors.

---

### ✅ Step-by-Step Solution

---

## 🔹 Part (i): Using Default Thread Priorities

### ✅ Step 1: Create Threads

We’ll create two classes `MyThread` and `YourThread` that extend the `Thread` class.

```java
// MyThread.java
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("MyThread: " + i);
        }
    }
}

// YourThread.java
class YourThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("YourThread: " + i);
        }
    }
}

// Main class to start the threads
public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // default priority 5
        YourThread t2 = new YourThread(); // default priority 5

        // Start both threads
        t1.start();
        t2.start();
    }
}
```

---

### 🔸 Explanation

* Both threads run concurrently.
* You may get mixed output like:

  ```
  MyThread: 1
  YourThread: 1
  MyThread: 2
  ...
  ```

---

## 🔹 Part (ii): Set Custom Thread Priorities

We now set the priorities:

```java
public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        YourThread t2 = new YourThread();

        // Set priorities
        t1.setPriority(6);  // Slightly higher than default
        t2.setPriority(7);  // Higher than t1

        // Start threads
        t1.start();
        t2.start();
    }
}
```

---

### 🔸 Explanation

* `t2` (priority 7) may get slightly more CPU time than `t1` (priority 6).
* **Note:** Java thread priority is a **hint**, not a guarantee. The JVM and OS may still run threads in any order depending on their own scheduler.

---

### 📝 Final Notes

* To **compile and run** this:

  ```bash
  javac ThreadExample.java
  java ThreadExample
  ```

* Thread scheduling behavior can vary across OSes (Windows/Linux/macOS).

---

Would you like to see a combined version of the code with both parts included for better testing?
