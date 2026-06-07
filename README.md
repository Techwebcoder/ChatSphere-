# ChatSphere - Real-Time Chat Application

## Overview

ChatSphere is a real-time chat application built using Spring Boot, WebSocket, STOMP, SockJS, Thymeleaf, Bootstrap, and JavaScript. The application enables multiple users to communicate instantly through a shared chat room without refreshing the page.

The project demonstrates real-time bidirectional communication between clients and the server using WebSocket technology and message broadcasting through STOMP messaging.

---

## Features

* Real-time messaging using WebSocket
* STOMP-based message communication
* Multiple users can participate simultaneously
* Instant message broadcasting
* Responsive and modern user interface
* Dark and Light mode support
* Automatic message timestamps
* Auto-scrolling chat window
* Enter key support for sending messages
* WebSocket connection status handling
* Mobile-friendly design

---

## Technology Stack

### Backend

* Java
* Spring Boot
* Spring WebSocket
* STOMP Messaging
* SockJS

### Frontend

* Thymeleaf
* HTML5
* CSS3
* Bootstrap 5
* JavaScript

### Build Tool

* Maven

---

## Architecture

### WebSocket Flow

1. Client establishes a WebSocket connection using SockJS.
2. STOMP protocol is used for message communication.
3. Messages are sent to the application endpoint.
4. Spring Boot processes the message.
5. The message is broadcast to all subscribed clients.
6. Connected users receive the message instantly.

---

## Project Structure

```text
src
├── main
│   ├── java
│   │   └── com.chat.app
│   │       ├── config
│   │       │   └── WebSocketConfig.java
│   │       ├── controller
│   │       │   └── ChatController.java
│   │       ├── model
│   │       │   └── ChatMessage.java
│   │       └── AppApplication.java
│   │
│   └── resources
│       ├── templates
│       │   └── chat.html
│       └── application.properties
```

---

## WebSocket Configuration

The application exposes a WebSocket endpoint that allows clients to establish real-time communication with the server.

### Endpoint

```text
/chat
```

### Message Broker

```text
/topic
```

### Application Prefix

```text
/app
```

### Publish Destination

```text
/app/sendMessage
```

### Subscribe Destination

```text
/ topic/messages
```

---

## Chat Message Model

The application uses a simple message model containing:

* Sender Name
* Message Content

```java
public class ChatMessage {
    private Long id;
    private String sender;
    private String content;
}
```

---

## User Interface

The application provides:

* Chat room interface
* User name input
* Message input field
* Send button
* Message display area
* Timestamp display
* Theme switching support

---

## Running the Application

### Clone the Repository

```bash
git clone <repository-url>
```

### Navigate to Project Directory

```bash
cd ChatSphere
```

### Run the Application

```bash
mvn spring-boot:run
```

### Access the Application

```text
http://localhost:8080
```

---

## Future Enhancements

* User authentication and authorization
* Private messaging
* User presence tracking
* Chat history persistence
* Message delivery status
* Read receipts
* File sharing support
* Emoji integration
* User profile management
* Group chat functionality
* Notification system
* Database integration

---

## Learning Outcomes

This project demonstrates:

* Spring Boot fundamentals
* WebSocket communication
* STOMP messaging protocol
* Real-time application development
* Frontend and backend integration
* Event-driven communication
* Responsive UI development

---

## Author

Rajakumar B

B.Tech Information Technology

Velammal Engineering College
