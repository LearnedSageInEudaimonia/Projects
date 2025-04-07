# Java CLI Projects Repository

This repository is a curated collection of Java projects runnable via the command line (CLI). Projects are structured by levels of difficulty. Some use JDBC (MySQL) for database interaction.

---
## 🛠️ Technologies / Tools Used

- **Java 8+**
- **MySQL** (Only for JDBC projects in Level 4)
- **JDBC (Java Database Connectivity)**
- **MySQL Connector/J** (JDBC Driver)
- **IDE (ex: IntelliJ IDEA, Eclipse)** or terminal for compilation
- **Basic Java Concepts:** OOP, Collections, Exception Handling, File I/O

---

## 📁 Project Structure with Descriptions

```plaintext
src/
├── Level_1/
│   ├── BankAccount
│   │   └── Simulates basic banking operations: deposit, withdraw, check balance.
│   └── StudentGrade
│       └── Calculates grade based on marks using simple logic.
│
├── Level_2/
│   ├── LibraryManagementSystem
│   │   └── Manage books and student records.
│   ├── NumberGuessingGame
│   │   └── User guesses a random number with CLI hints.
│   └── TodoApplication
│       └── Basic task manager with add/view/delete .
│
├── Level_3/
│   ├── EmployeesManagementSystem      
│   │   └── Manage employee records using in-memory storage.
│   └── InventoryManagementSystem     
│       └── Track and update inventory details.
│
├── Level_4/
│   ├── ATM                                         ← JDBC
│   │   └── Simulates ATM features: login, withdraw, deposit (MySQL-backed).
│   └── StudentManagementSystemUsingJDBC            ← JDBC
│       └── Manage student data with full DB support.
