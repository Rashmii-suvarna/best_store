# 🌟 BestStore – Product Management Web App

**BestStore** is a lightweight Spring Boot web application that offers role-based product management.  
It allows **Admins** to add, edit, and delete products, while **Users** can view them in a clean, responsive UI.

---

## 🚀 Features

- 🔐 Login with **Admin** and **User** roles
- 📋 View all products
- ➕ Add new products (Admin only)
- ✏️ Edit existing products (Admin only)
- ❌ Delete products with confirmation prompt (Admin only)
- 👤 Role-based dashboard (separate views for Admin & User)
- 🔓 Secure logout functionality

---

## ⚙️ Spring Initializr Setup

### 🎯 Project Metadata
- **Project**: Maven
- **Language**: Java
- **Spring Boot Version**: `3.4.5`
- **Group**: `com.example`
- **Artifact**: `beststore_new`
- **Packaging**: Jar
- **Java Version**: `17`

### 📦 Dependencies Added

- **Spring Web**  
- **Spring Boot DevTools**  
- **Thymeleaf**  
- **Spring Security**  
- **Spring Data JPA**  
- **MySQL Driver**

---

## 🧑‍💻 Technologies Used

| Technology       | Purpose                                |
|------------------|----------------------------------------|
| Spring Boot      | Backend Framework                      |
| Thymeleaf        | Template Engine (HTML rendering)       |
| Spring Security  | Role-based Authentication              |
| MySQL            | Database for storing product data      |
| Spring Data JPA  | ORM for entity & repository handling   |
| Maven            | Build and dependency management        |

---

## 📸 **Screenshots**

<p><strong> Login Screen</strong><br/>
<img src="screenshots/Screenshot_2025-07-02-12-15-21-227_com.example.event_planner_app - Copy - Copy.jpg" width="400"/>
</p>


<p><strong> Home Screen</strong><br/>
<img src="screenshots/Screenshot_2025-07-02-12-15-39-294_com.example.event_planner_app.jpg" width="400"/>
</p>

<p><strong> Create Event Screen</strong><br/>
<img src="screenshots/Screenshot_2025-07-02-12-18-18-374_com.example.event_planner_app.jpg" width="400"/>
</p>

<p><strong> Event Info screen </strong><br/>
<img src="screenshots/Screenshot_2025-07-02-12-20-04-137_com.example.event_planner_app - Copy.jpg" width="400"/>
</p>
<p><strong>Add Product</strong><br/>
<img src="screenshots/add_product.png" width="400"/>
</p>

<p><strong>Edit Product</strong><br/>
<img src="screenshots/edit_product.png" width="400"/>
</p>

<p><strong>Delete Confirmation</strong><br/>
<img src="screenshots/delete_confirm.png" width="400"/>
</p>

---

## 📂 Project Structure

```bash
src/
├── main/
│   ├── java/
│   │   └── com.example.beststore_new/
│   │       ├── controller/
│   │       │   └── ProductController.java
│   │       ├── model/
│   │       │   └── Product.java
│   │       ├── repository/
│   │       │   └── ProductRepository.java
│   │       └── config/
│   │           └── SecurityConfig.java
│   └── resources/
│       ├── templates/
│       │   ├── login.html
│       │   ├── admin_home.html
│       │   ├── user_home.html
│       │   ├── addProduct.html
│       │   ├── editProduct.html
│       │   └── confirmDelete.html
│       ├── static/
│       │   └── (css / js if any)
│       └── application.properties
└── test/

```


# ⚙️ How to Run the Project Locally
✅ Prerequisites
Java 17 installed

Maven installed
MySQL installed and running

# 🧪 Steps to Run

# Clone the repo
git clone https://github.com/your-username/best_store.git
cd best_store

Configure your MySQL DB in src/main/resources/application.properties

# Run the app
./mvnw spring-boot:run

| Role  | Username | Password |
| ----- | -------- | -------- |
| Admin | admin    | admin123 |
| User  | user     | user123  |

You can change these inside SecurityConfig.java.

# About the Developer
Rashmi Suvarna
🧑‍🎓 MCA Student | 🌐 Java & Spring Boot Developer

🔗 LinkedIn Profile(https://www.linkedin.com/in/rashmi2003/)
