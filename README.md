# News and Technology Aggregator

## Overview and Idea

This project aims to develop a microservice-based application that aggregates news and technology updates based on user preferences. The system fetches the latest news, identifies the most interesting news using AI based on user preferences (optionally generates concise summaries using AI), and sends this information to users via email, Telegram, or other communication channels.

## User Stories (Functional Requirements)

### User Registration and Preferences
- **As a user, I want to set my preferences for news categories and technology updates.**
- **As a user, I want to update my preferences at any time.**

### News Aggregation
- **As a user, I want the application to fetch the latest news based on my preferences and send me the most interesting news via my preferred communication channel (email, Telegram, etc.).**
- **(Optional) As a user, I want the application to fetch the latest news, pick the most interesting news, generate concise summaries using AI, and send via my preferred communication channel.**

## Non-Functional Requirements

### Must-Have
- Microservice architecture with at least two services.
- Each service must be containerized and run using Docker Compose.
- Resources like queues and databases should be added to Docker Compose.
- Services should communicate using Dapr for both direct calls and calls via message queues.
- The request to get the latest news should be asynchronous, returning an immediate accepted status and sending the result summary to the chosen communication channel once processing is complete.
- Clean code with proper error handling, logging, and separation of concerns.
- Testable using tools like Swagger, Postman, or Insomnia. Generate Swagger documentation or create a Postman collection.
- A README explaining the technologies used, how to run the application, and how to test it.
- Solution should be uploaded to a GitHub private repository.

### Nice-to-Have (Optional)
- Include integration tests to simulate client-side calls.
- Implement caching strategies.
- Define which services are external-facing and add an API gateway like Ocelot.
- Add authentication and authorization mechanisms.
- Use Semantic Kernel or Lang Chain.
- Add a UI using any framework.

## Assumptions and Constraints
- Use free APIs:
  - Gemini Free Tier API for AI or any other API such as those on Hugging Face.
  - NewsData.io for fetching news or any other free API.
  - Free communication channels like email, Slack, and Telegram for notifications.
- Docker Compose and WSL (if using Windows) must be installed for container orchestration.
- Any language can be used, provided it supports Dapr.

## Development Process

### System Diagram
The process starts by analyzing the requirements and creating the system architecture, listing components such as Backend Services, Client Applications, and Databases.

### Git Workflow
Use Git for version control, following the GitHub Flow. Each feature should be developed in a separate branch, and changes should be merged via pull requests.

### API Documentation and Testing
Create API documentation using Swagger or Postman. Use these tools to test the endpoints and ensure they meet the requirements.

### Optional Testing
Add integration tests to ensure the robustness of the application.

## Getting Started

### Prerequisites
- Docker and Docker Compose
- WSL (if using Windows)
- Git

### Running the Application Locally

1. **Clone the repository:**
    ```bash
    git clone [<repository_url>](https://github.com/omarzedan19/PersonalizedNewsUpdateAggregator-.git
)
   

2. **Build and start the services with Docker Compose:**
    ```bash
    docker-compose up --build
    ```

3. **Access the services:**
    - The services will be available on the following ports (example):
      - User Service: `http://localhost:8081`
      - News Service: `http://localhost:8082`
      - Notification Service: `http://localhost:8083`

### Testing the Application

1. **Swagger Documentation:**
   - Access the Swagger UI for each service at:
     - User Service: `http://localhost:8081/swagger-ui.html`
     - News Service: `http://localhost:8082/swagger-ui.html`
     - Notification Service: `http://localhost:8083/swagger-ui.html`

2. **Postman Collection:**
   - Import the provided Postman collection from the `postman` directory in the repository.

## Technologies Used
- **Spring Boot:** For building the microservices.
- **Docker and Docker Compose:** For containerization and orchestration.
- **Dapr:** For service communication.
- **MySQL:** As the relational database.
- **Swagger:** For API documentation.
- **Hugging Face / Gemini API:** For AI-based news summarization.
- **NewsData.io:** For fetching news articles.

## Repository Structure

.
├── user-service
│ ├── src
│ ├── Dockerfile
│ └── ...
├── news-service
│ ├── src
│ ├── Dockerfile
│ └── ...
├── notification-service
│ ├── src
│ ├── Dockerfile
│ └── ...
├── dapr
│ └── components
├── docker-compose.yml
├── README.md
└── postman
└── NewsAggregator.postman_collection.json




