# JAVA

# 📘 What is a Method in Java ?

A **method** in Java is a block of code that performs a specific task. It is used to operate on data (variables) and promote code reuse and organization.

---

## 📖 Definition

A method is:

- A **group of Java statements** used to perform operations on data.
- Always declared **inside a class**.
- Designed for **code reuse**, better organization, and maintainability.

---
Components:
access-modifier: public, private, protected, or default (package-private).

returnType: The data type of the value the method returns (e.g., int, String, void).

methodName: The name of the method.

parameterList: A list of parameters passed to the method.

✅ Advantages of Using Methods :

Code Reusability: Write once, use multiple times.

Modular Code: Easier to read and maintain.

Debugging: Simplifies finding and fixing bugs.

Testing: Each method can be tested individually.

##  Syntax

```java
<access-modifier> returnType methodName(parameterList) {
    // Method body
    return value;
}
