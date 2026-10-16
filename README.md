# Java 25 Features 🚀

A hands-on learning repository exploring **Java 25 features**, modern Java syntax, and practical code examples. This repository is designed to help Java developers understand new language enhancements through simple, runnable programs.

## 📌 About the Project

Java 25 is a Long-Term Support (LTS) release, officially released on September 16, 2025. It introduces improvements to the Java language, APIs, runtime performance, and developer experience.

This repository contains examples and notes to understand Java 25 features step by step.

## 🛠️ Technologies Used

- **Java 25 (JDK 25)**
- IntelliJ IDEA
- Git and GitHub

## 📚 Topics Covered

### 1. Compact Source Files and Instance Main Methods

Learn how to write simple Java programs without explicitly declaring a class or using the traditional `public static void main(String[] args)` method.

```java
void main() {
    System.out.println("Hello World!");
}
```

### 2. Flexible Constructor Bodies

Understand how Java 25 allows statements before an explicit `super()` or `this()` constructor invocation, subject to Java's constructor safety rules.

```java
class Parent {
    Parent(int age) {
        System.out.println("Age: " + age);
    }
}

class Child extends Parent {
    Child(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid age");
        }

        super(age);
        System.out.println("Child constructor");
    }
}
```

### 3. Simplified Input and Output

Explore the simplified I/O API used in Java's beginner-friendly programming experience.

```java
import static java.lang.IO.*;

void main() {
    println("Hello World!");
}
```

*Note: The `java.lang.IO` API is a preview feature in JDK 25 and requires preview features to be enabled.*

### 4. Module Import Declarations

Learn how to import the exported packages of an entire module using the `import module` declaration.

```java
import module java.base;

void main() {
    System.out.println("Learning Java 25");
}
```

### 5. More Java 25 Features

Additional topics to explore as the repository grows:

- Scoped Values
- Key Derivation Function API
- Compact Object Headers
- Ahead-of-Time (AOT) enhancements
- Pattern matching enhancements (preview)
- Structured Concurrency (preview)
- Vector API (incubator)
- Stable Values (preview)

## ⚙️ Prerequisites

Before running the examples, install:

1. JDK 25
2. IntelliJ IDEA or another Java-compatible IDE
3. Git

Verify your Java installation:

```bash
java -version
javac -version
```

Both commands should report version 25.

## ▶️ How to Run

Clone the repository:

```bash
git clone https://github.com/abhishekkargeti1/Java-25-Features.git
```

Navigate to the project directory:

```bash
cd Java-25-Features
```

Run a compact source file, replacing `Main.java` with the actual filename:

```bash
java Main.java
```

For examples using preview APIs, such as `java.lang.IO`, use:

```bash
java --enable-preview --source 25 Main.java
```

## 🎯 Learning Goals

- Understand the latest Java language enhancements.
- Write concise and readable Java code.
- Compare modern Java syntax with traditional Java programming.
- Practice new features through hands-on examples.
- Build a strong foundation in Core Java.

## 🤝 Contributions

Suggestions, improvements, and additional Java 25 examples are welcome. Feel free to open an issue or submit a pull request.

## 👨‍💻 Author

**Abhishek Kargeti**

GitHub: [@abhishekkargeti1](https://github.com/abhishekkargeti1)

---

⭐ If you find this repository useful, consider giving it a star!

**Happy Coding with Java 25! ☕**
