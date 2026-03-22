# 🛒 E-Commerce Backend (Spring Boot)

A scalable and modular **E-commerce backend application** built using **Spring Boot**.
This project demonstrates real-world backend development practices including REST APIs, database integration, and layered architecture.

---

## 🚀 Overview

This project is designed to simulate the backend of an e-commerce platform where products can be managed through RESTful APIs. It follows clean architecture principles and is structured to be easily extendable for future features like authentication, cart, and payments.

---

## ✨ Features

* 📦 Product Management (Create, Read, Update, Delete)
* 🔄 RESTful API design
* 🗂️ Layered architecture (Controller → Service → Repository)
* 💾 Database integration using JPA & Hibernate
* ⚡ Fast development using Spring Boot
* 🧪 Easy API testing with Postman / Thunder Client

---

## 🛠️ Tech Stack

| Technology      | Description                     |
| --------------- | ------------------------------- |
| Java            | Core programming language       |
| Spring Boot     | Backend framework               |
| Spring Data JPA | Database abstraction layer      |
| Hibernate       | ORM (Object Relational Mapping) |
| H2 / MySQL      | Database                        |
| Maven           | Dependency management           |
| Lombok          | Reduces boilerplate code        |

---

## 📁 Project Structure

```
Ecom-proj/
│
├── src/main/java/com/arth/Ecom/proj
│   ├── controller     # Handles HTTP requests
│   ├── service        # Business logic layer
│   ├── repository     # Database interaction (JPA)
│   ├── model          # Entity classes
│
├── src/main/resources
│   ├── application.properties   # Configurations
│
├── pom.xml                     # Maven dependencies
```

---

## ⚙️ Installation & Setup

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/tusharth111/Ecom-proj.git
cd Ecom-proj
```

### 2️⃣ Open in IntelliJ IDEA

* File → Open → Select project folder

### 3️⃣ Run the Application

* Locate the main Spring Boot class
* Click ▶ Run

---

## 🌐 API Endpoints (Sample)

### 📌 Product APIs

| Method | Endpoint       | Description       |
| ------ | -------------- | ----------------- |
| GET    | /products      | Get all products  |
| GET    | /products/{id} | Get product by ID |
| POST   | /products      | Add new product   |
| PUT    | /products/{id} | Update product    |
| DELETE | /products/{id} | Delete product    |

---

## 🧪 Testing the API

You can test APIs using:

* Postman
* Thunder Client (VS Code)

Example request:

```bash
POST /products
```

```json
{
  "name": "Laptop",
  "price": 75000,
  "description": "Gaming laptop"
}
```

---

## 💾 Database Configuration

### 🔹 Default: H2 Database

* URL: http://localhost:8080/h2-console
* JDBC URL: `jdbc:h2:mem:testdb`

---

## 🧠 Key Concepts Learned

* REST API design principles
* Spring Boot project structure
* Dependency Injection
* JPA & Hibernate ORM
* Exception handling in backend
* Clean code & modular design

## 👨‍💻 Author

**Tushar Thakur**

* Aspiring Backend Developer
* Focused on Java & Spring Boot

---
> This is the backend part of the project.  
> You can find the frontend here:  
> 👉 https://github.com/tusharth111/<your-frontend-repo-link>




