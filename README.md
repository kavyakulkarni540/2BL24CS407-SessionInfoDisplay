# 2BL24CS407-SessionInfoDisplay
This project is a Java Servlet web application that displays session information using HttpSession. It shows session ID, whether the session is new, creation time, last accessed time, and maximum inactive interval. It also provides an option to invalidate the session.

# Session Info Display Page

## Description
This project is a Java Servlet web application that displays session information using HttpSession. It shows session ID, whether the session is new, creation time, last accessed time, and maximum inactive interval. It also provides an option to invalidate the session.

## Technologies Used
- Java
- Servlet (Jakarta Servlet API)
- HTML
- Apache Tomcat v10.1
- Eclipse IDE

## Folder Structure
SessionInfoDisplay/
├── src/main/java/com/tara/SessionInfoServlet.java
├── src/main/webapp/index.html
├── src/main/webapp/WEB-INF/web.xml
├── screenshots/
│   ├── screenshot1.png
│   └── screenshot2.png
└── README.md

## Requirements
- JDK 17 or above
- Eclipse IDE
- Apache Tomcat v10.1
- Web Browser

## How to Run
1. Open Eclipse IDE
2. Create Dynamic Web Project named SessionInfoDisplay
3. Create package com.tara
4. Add SessionInfoServlet.java
5. Add index.html
6. Run project on Apache Tomcat
7. Open:
   http://localhost:8081/SessionInfoDisplay/index.html

## Output
The application displays:
- Session ID
- New session status
- Creation time
- Last accessed time
- Maximum inactive interval
- Invalidate session option
