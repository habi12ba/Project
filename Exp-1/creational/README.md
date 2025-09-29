# Factory Method Pattern – Beverage Machine

## Overview
The **Factory Method** is a **creational design pattern** that defines a standard interface for creating objects while allowing subclasses to decide which concrete object to instantiate.  
It separates **object creation** from **object usage**, making the system clean and easily extendable.

## Use Case
This project demonstrates a **Beverage Vending Machine** that serves multiple drinks:

- Coffee
- Tea
- Juice

Each beverage has its **own factory** responsible for creating and serving it.  
The system can accommodate new beverages by simply adding a **new product class** and a **corresponding factory**, without changing existing code.

<img width="3900" height="3840" alt="Image" src="https://github.com/user-attachments/assets/162f9be5-dcc9-48d3-b58b-69f4caff1761" />
 
## Singleton Design Pattern - Centralized Logger System 
## Overview
Ensures that only one instance of a class is created and provides a global point of access to it, maintaining consistency and preventing resource overhead.

## Use Case  
In large applications, multiple classes often need to log messages.  

If each class had its own logger instance:  
- Logs could become inconsistent.  
- Memory and I/O resources could be wasted.  
By using a Singleton, the entire application shares one Logger instance, ensuring consistent and efficient logging

<img width="300" height="450" alt="Image" src="https://github.com/user-attachments/assets/e1a5454b-4f07-4b0e-9d52-837cac511f1f" />

