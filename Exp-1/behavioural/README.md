# Observer Pattern – Stock Ticker System

## Overview  
The **Observer Pattern** is a **behavioral design pattern** that defines a **one-to-many dependency** between objects.  
When one object (the **Subject**) changes state, all its dependent objects (**Observers**) are automatically notified and updated.  

This ensures **loose coupling** between subjects and observers, making the system flexible and extensible.

## Use Case  
This project demonstrates a **Stock Ticker System** where:  

- Multiple **stocks (subjects)** can be tracked  
- **Investors (observers)** subscribe to stocks of interest  
- Whenever a stock price changes, all subscribed investors are **instantly notified**  
- New stocks or investors can be easily added **without modifying existing logic**
  <img width="1000" height="1000" alt="Untitled diagram _ Mermaid Chart-2025-09-27-182701 (1)" src="https://github.com/user-attachments/assets/8d7b1dd8-d056-46be-92ff-c0308ed0750e" />
  
# Strategy Pattern – Route Navigation System 🚗  

## Overview  
The **Strategy Pattern** is a **behavioral design pattern** that allows selecting an algorithm’s behavior **at runtime**.  
It defines a family of algorithms, encapsulates each one, and makes them interchangeable without altering the context (the main logic).  
 

## Use Case  
This project demonstrates a **Route Navigation System** where:  

- A **Navigator (context)** helps users travel from **Start → Destination**  
- Different **route strategies (algorithms)** can be chosen dynamically:  
  - 🚀 **Fastest Route** – Prioritizes time  
  - 📏 **Shortest Route** – Prioritizes distance  
  - 🌳 **Scenic Route** – Prioritizes scenic beauty  
  - ⚙️ **Default Route** – Fallback option  
- The strategy can be switched **at runtime** without modifying the Navigator logic  
- New route strategies can be added easily without disturbing existing code
  
- <img width="1000" height="1000" alt="Untitled diagram _ Mermaid Chart-2025-09-28-075734" src="https://github.com/user-attachments/assets/cee91fc8-2ec2-41c8-9a76-81fda4489973" />



