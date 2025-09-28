# Factory Method Pattern – Beverage Machine

## Overview
The **Factory Method** is a **creational design pattern** that defines a standard interface for creating objects while allowing subclasses to decide which concrete object to instantiate.  
It separates **object creation** from **object usage**, making the system clean and easily extendable.

## Application / Use Case
This project demonstrates a **Beverage Vending Machine** that serves multiple drinks:

- Coffee
- Tea
- Juice

Each beverage has its **own factory** responsible for creating and serving it.  
The system can accommodate new beverages by simply adding a **new product class** and a **corresponding factory**, without changing existing code.

<img width="3840" height="1083" alt="Image" src="https://github.com/user-attachments/assets/162f9be5-dcc9-48d3-b58b-69f4caff1761" />
Singleton Design Pattern – Centralized Logger
📌 Design Pattern Used

Singleton Design Pattern
Ensures only one instance of a class is created and provides a global point of access to it.

📌 Use Case

Centralized Logger System

In large applications, logs are written from multiple classes.

Multiple logger instances can lead to inconsistent logging and resource overhead.

The Singleton Logger ensures that all classes use the same logger instance, maintaining consistent logging across the application.

📌 How It Works

The Singleton Logger class creates a single instance on the first request.

Any subsequent calls return the same instance.

Verifies singleton behavior by comparing logger references to ensure only one instance exists.
<img width="1939" height="3840" alt="Untitled diagram _ Mermaid Chart-2025-09-28-150302" src="https://github.com/user-attachments/assets/a78a7c0e-7689-430c-8d19-090aa4155bb6" />

