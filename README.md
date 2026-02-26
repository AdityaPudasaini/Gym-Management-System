# 🏋️ Gym Management System

A Java-based Gym Management System developed using Object-Oriented Programming (OOP) concepts and Graphical User Interface (GUI).

This project was developed as part of the CS4001NI Programming coursework (2025 Spring).

---

## 📌 Project Overview

This system simulates a real-world gym management environment. It allows gym administrators to:

- Register new members
- Categorize members as Regular or Premium
- Track attendance
- Manage membership plans
- Award loyalty points
- Upgrade or reset membership plans

The system uses Java OOP principles including inheritance, encapsulation, abstraction, and polymorphism.

---

## 🧠 OOP Implementation

The system is structured using the following classes:

- `GymMember` (Super Class)
- `RegularMember` (Subclass)
- `PremiumMember` (Subclass)
- `GymGUI` (GUI Class with main method)

### 🔹 Inheritance
RegularMember and PremiumMember extend GymMember.

### 🔹 Encapsulation
Private instance variables with appropriate getters and setters.

### 🔹 Polymorphism
Method overriding where necessary for membership-specific behaviors.

### 🔹 Abstraction
Clear separation between data handling and GUI logic.

---

## 🖥 GUI Features

The graphical interface allows users to:

- Enter personal details (Name, DOB, Email, Phone, Gender, Location)
- Register members
- Mark attendance
- Track loyalty points
- Upgrade plans
- Reset plans

The GUI is implemented using Java Swing.

---

## 📂 Project Structure
