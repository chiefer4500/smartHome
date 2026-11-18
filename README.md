# Smart Home Management System (Java)

An object-oriented Java application designed to model, control, and manage smart home IoT devices through a centralized hub. Built using core OOP principles including abstraction, inheritance, interfaces, and polymorphism.

## Features
- **Interface-Driven Control (`steuerbar`):** Defines a unified contract for switching and controlling compatible smart devices.
- **Abstract Device Architecture (`IoTDevice`):** Provides shared properties and base behavior inherited by all connected hardware.
- **Specialized Device Subclasses:**
  - **`SmartLight`:** Supports power state toggling and brightness/dimming adjustments.
  - **`SmartThermostat`:** Manages target temperature settings and climate control states.
- **Centralized Hub (`SmartHomeZentrale`):** Stores and manages a dynamic collection of `IoTDevice` objects, enabling list filtering and system-wide overviews.
- **Safe State Management (`SmartHomeVerwalter`):** Utility class ensuring safe, validated device state switching across different device types.

## Technologies Used
- **Language:** Java (OOP, Collections, Interfaces, Inheritance)
- **IDE:** IntelliJ IDEA
- **Version Control:** Git & GitHub

## Project Structure
```text
SmartHome/
├── src/
│   ├── steuerbar.java              # Control interface for switchable devices
│   ├── IoTDevice.java              # Abstract base class for all smart devices
│   ├── SmartLight.java             # Light subclass with dimming capabilities
│   ├── SmartThermostat.java        # Thermostat subclass with temperature control
│   ├── SmartHomeZentrale.java      # Central device registry and list management
│   ├── SmartHomeVerwalter.java     # Utility class for safe device state switching
│   └── Main.java                   # Driver/test class demonstrating system workflows
└── README.md
