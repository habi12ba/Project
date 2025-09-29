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
  <img width="298" height="384" alt="Untitled diagram _ Mermaid Chart-2025-09-27-182701 (1)" src="https://github.com/user-attachments/assets/8d7b1dd8-d056-46be-92ff-c0308ed0750e" />


