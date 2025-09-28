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
