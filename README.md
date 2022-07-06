[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com) 

# Mediscreen
> Mediscreen specializes in detecting risk factors for disease. Our screenings using predictive analysis of patient populations at an affordable cost.
***
:warning: ***4 modules are required in order for the Mediscreen application to function :***
- Front-end app
- [Patients Micro-Service](https://github.com/gwnll/Mediscreen_Patients)
- Notes Micro-Service
- [Reports Micro-Service](https://github.com/gwnll/Mediscreen_Reports)
***
## Mediscreen_Notes
Mediscreen_Notes is a REST micro-service connected to a MongoDB database. The user is able to read, write, edit and delete notes about patients. Those notes, alongside with the patient's informations, can be used to generate reports in the reports micro-service

### Technologies
- Java 1.8 JDK (Java 8)
- Maven
- Spring 2.1.6
- Docker
- MySQL

### Deployment with Docker
1) Build the 3 different jar
2) Create the 3 different images with docker ``build -t (image_name)``
3) 

### API Documentation
- Swagger 3 : http://localhost:8082/swagger-ui/index.html#/

### API REST Endpoints
![API REST Endpoints](https://github.com/gwnll/Mediscreen_Notes/blob/main/note-controller.jpg)