# Adapter Pattern – Smart Home Devices

## **Overview**
The **Adapter Pattern** is a **structural design pattern** that allows incompatible interfaces to work together.  
It acts as a **bridge** between the client and existing legacy APIs (adaptees), enabling **seamless integration** without changing existing code.  

## **Use Case**
This project demonstrates a **Smart Home Device Control System**:

- Multiple **legacy devices (adaptees)** such as:
  - `PhilipsHue`  
  - `DysonFan`  
  - `NestThermostat`  
  These devices have different APIs and control mechanisms.

- **Adapters** provide a **common interface (`SmartDevice`)** for the client:
  - `LightAdapter`  
  - `FanAdapter`  
  - `ThermostatAdapter`  

- **Client (`AdapterDemo`)** can **turn on/off all devices uniformly** without worrying about the specific device APIs.

- **Adding new devices** is easy: just create a **new adapter** implementing `SmartDevice`.  
  No changes are needed in the client code.
  <img width="3840" height="3563" alt="Untitled diagram _ Mermaid Chart-2025-09-29-143559" src="https://github.com/user-attachments/assets/b60bc55d-5b5b-40ad-969b-bf7b711253b0" />

  # Composite Pattern – File System

## **Overview**
The **Composite Pattern** is a **structural design pattern** that allows you to **treat individual objects and compositions uniformly**.  
It enables clients to work with **single objects (files)** and **composite objects (folders)** in the same way, **without worrying about their internal structure**.  

## **Use Case**
This project demonstrates a **File System structure**:

- **Files (Leaf Objects)** – Represent individual objects with:
  - Name  
  - Size  

- **Folders (Composite Objects)** – Can contain:
  - Files  
  - Other folders  

- **Client Operations**:
  - Display folder contents  
  - Compute total size of any folder, **regardless of its internal structure**

- **Extensibility**: New files or folders can be added **without changing existing code**.

<img width="3840" height="2606" alt="Untitled diagram _ Mermaid Chart-2025-09-29-144845" src="https://github.com/user-attachments/assets/a3ae0cab-5b23-4a93-bab6-09cc2389e3c2" />


  

