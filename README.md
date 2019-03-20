[![Build Status](https://travis-ci.com/fullstackhackathon/ConnectZuehlke.svg)](https://travis-ci.com/fullstackhackathon/ConnectZuehlke)

# Fullstack Hackathon - Spring meets Angular

## Goal

Boilerplate application for the Fullstack Hackathon (20-22. March) with integration to Insight and an Angular / Spring Boot application. Ready to code!

## Developer guidelines

### Getting started

 
## Build options

### Full executable JAR Build
A fully runnable JAR file with the frontend can be build by running:

```
./gradlew bootJar
```
To run this jar you can then run 
```
java -jar backend/build/libs/backend-<YOUR VERSION>.jar --spring.profiles.active=ci
```
If you want to execute it against the Insight API (and not with the profile 'ci') you will need to provide your username and password:

```
INSIGHT_AUTHENTICATION_USERNAME=szil INSIGHT_AUTHENTICATION_PASSWORD=<YOUR PASSWORD GOES HERE> java -jar backend/build/libs/backend-<YOUR VERSION>.jar
```

Now, after the application started successfully you can navigate to `http://localhost:8080` and see the running angular app.

### Development setup
The development setup is intended for developers on a local machine to have full support of hot-reloading and debugging options.
You will execute a separate Backend and Frontend server.

A proxy configuration will ensure that the frontend can easily connect to the backend without any CORS problems.
 
#### Backend
```
# this will execute a regular run of the spring boot application, connecting to insight
./gradlew bootRun 
# or if you want to run the Mocked Insight API locally
./gradlew -Dspring.profiles.active=ci bootRun 
```
Alternatively you can use the provided Run Configurations in IntelliJ:

- ConnectZuehlkeApplication (mock)
- ConnectZuehlkeApplication (insight-test)
- ConnectZuehlkeApplication (insight-prod)



#### Frontend
```
cd frontend
ng serve
```

Alternatively you can use the provided Run Configurations in IntelliJ:

- Start Angular App

Go to [http://localhost:4200](http://localhost:4200) with your browser.


## Tests

### Unit Tests - Frontend

```
cd frontend
npm run test
```

### Unit Tests - Backend

```
./gradlew :backend:test
```

### E2E Tests - Full stack

```
# Start a backend server with CI profile active
./gradlew -Dspring.profiles.active=ci bootRun 
# Wait till the server is booted
# Run the E2E Tests in a seperate terminal
./gradlew :frontend:e2e

```
