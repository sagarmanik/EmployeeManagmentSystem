

# 🌱 Spring Boot JSP Web Application

This is a **Spring Boot** web application using **JSP (Java Server Pages)** for the frontend. It is designed with a standard MVC architecture and integrates with a relational database such as MySQL or PostgreSQL.

---

## 🚀 Features

- Spring Boot (with embedded Tomcat)
- JSP frontend (inside `WEB-INF/views`)
- Spring MVC architecture
- Database connectivity (via Spring Data JPA)
- Configurable database credentials
- Maven build system

---

## 📁 Project Structure


---

## 🛠️ Getting Started

### ✅ Prerequisites

Make sure you have installed:

- [Java 17+](https://adoptopenjdk.net/) (or the version configured in the project)
- [Maven](https://maven.apache.org/download.cgi)
- [MySQL](https://dev.mysql.com/downloads/) or compatible DB
- IntelliJ IDEA (recommended)

---

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name


src/main/resources/application.properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/springboot_jsp_db
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password

# Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# JSP Configuration
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp


mvn spring-boot:run

http://localhost:8080/



![Screenshot 2025-05-19 224703](https://github.com/user-attachments/assets/bffa7a60-43c7-40a0-8744-72fcf79acab6)
![Screenshot 2025-05-19 224723](https://github.com/user-attachments/assets/646a3ddb-bed6-4214-bf4a-3e15563542c4)

![Screenshot 2025-05-19 224741](https://github.com/user-attachments/assets/bac39d9a-1d2a-4cc8-9b5d-20e7928afa05)
![Screenshot 2025-05-19 224757](https://github.com/user-attachments/assets/a8609b40-9637-41c0-8f2b-974b610bc682)

