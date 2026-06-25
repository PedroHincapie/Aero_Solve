# ✈️ Aero_Solve — Flight Reservation System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![React](https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)

> Full-stack flight reservation system developed as a technical test for **TechAndSolve**.

---

## 🎯 Overview

Aero_Solve is a full-stack web application for managing flight reservations. It demonstrates integration between a React frontend and a Spring Boot REST API backend with Hibernate ORM and MySQL.

---

## 🏗️ Architecture

```
Aero_Solve/
├── frontend/          # React.js application
│   ├── src/
│   │   ├── components/  # UI components
│   │   └── services/    # API calls
└── backend/           # Spring Boot REST API
    └── src/main/java/
        ├── controller/  # REST endpoints
        ├── service/     # Business logic
        ├── model/       # JPA entities
        └── repository/  # Data access layer
```

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Frontend | React.js |
| Backend | Java + Spring Boot |
| ORM | Hibernate / Spring Data JPA |
| Database | MySQL |
| Build Tool | Maven |

---

## 🚀 Getting Started

### Prerequisites

* Java 11+
* Node.js 14+
* MySQL running locally

### Backend Setup

```bash
# Configure MySQL in application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/aero_solve
spring.datasource.username=root
spring.datasource.password=your_password

# Build and run
mvn spring-boot:run
```

API available at: `http://localhost:8080`

### Frontend Setup

```bash
cd frontend
npm install
npm start
```

App available at: `http://localhost:3000`

---

## 📋 Features

* ✅ Search available flights
* ✅ Create flight reservations
* ✅ View reservation details
* ✅ REST API with full CRUD operations
* ✅ Database initialization with `ScriptCreacionTablas.sql`

---

## 👤 Author

**Pedro Jesus Hincapié Garcia** — Technical Lead @ Imagemaker
* LinkedIn: [pedro-jesus-hincapié-garcia](https://www.linkedin.com/in/pedro-jesus-hincapi%C3%A9-garcia/)
* GitHub: [@PedroHincapie](https://github.com/PedroHincapie)# Aero_Solve
Prueba tecnica TechAndSolve Reservacion Vuelos. Reactjs + SpringBoot+Hibernate+Mysql
