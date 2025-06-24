# Todo Application

A full-stack Todo application with React frontend and Spring Boot backend.

![Todo App Screenshot](./screenshot.png) *(Add a screenshot later if available)*

## Features

- **Frontend (React)**:
  - Add new todos
  - Mark todos as complete/incomplete
  - Delete todos
  - Filter todos (All/Active/Completed)
  - Responsive design
  - Real-time updates

- **Backend (Spring Boot)**:
  - REST API endpoints
  - In-memory data storage (no database)
  - CORS configured for frontend access
  - CRUD operations support

## Technologies Used

- **Frontend**:
  - React.js
  - Axios (for API calls)
  - CSS (no external UI libraries)

- **Backend**:
  - Spring Boot
  - Spring Web
  - Lombok (optional)

## Project Structure
todo-app/
├── frontend/ # React application
│ ├── public/
│ ├── src/
│ │ ├── components/ # React components
│ │ ├── App.js # Main component
│ │ └── App.css # Styles
│ └── package.json
│
└── backend/ # Spring Boot application
├── src/
│ ├── main/java/com/todoapi/demo/
│ │ ├── controller/ # REST controllers
│ │ ├── model/ # Data models
│ │ └── service/ # Business logic
│ └── resources/
│ └── application.properties
└── pom.xml


## Setup Instructions

### Frontend Setup
1. Navigate to frontend directory:
   ```bash
   cd taskui
npm install
npm start
Access at: http://localhost:3000
### Backend Setup
2. Navigate to backend directory
   ```bash
   cd demo
mvn spring-boot:run

![image](https://github.com/user-attachments/assets/cbbf6418-1024-4345-9177-206499d8144e)

Author
Ayush Bundela


 
