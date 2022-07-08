[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com) 

# Mediscreen
> Mediscreen specializes in detecting risk factors for disease. Our screenings using predictive analysis of patient populations at an affordable cost.
***
:warning: ***4 modules are required in order for the Mediscreen application to function :***
- [Front-end app](https://github.com/gwnll/Mediscreen_Front)
- [Patients Micro-Service](https://github.com/gwnll/Mediscreen_Patients)
- Notes Micro-Service
- [Reports Micro-Service](https://github.com/gwnll/Mediscreen_Reports)
***
## Mediscreen_Notes
Mediscreen_Notes is a REST micro-service connected to a MongoDB database. The user is able to read, write, edit and delete notes about patients. Those notes, alongside with the patient's informations, can be used to generate reports in the reports micro-service

### Technologies
- Java 11
- Maven 3.8.1
- Spring 2.6.7
- Docker
- Postgre
- MongoDB

### Deployment with Docker
1) Build the jar (you can use ``mvn install``)
2) Create the image of the notes micro-service with ``build -t mediscreen-notes``
3) Once the images of the other micro-services are created, you can use ``docker compose up`` in the front app.

### API Documentation
- Swagger 3 : http://localhost:8082/swagger-ui/index.html#/

### API REST Endpoints
![API REST Endpoints](https://github.com/gwnll/Mediscreen_Notes/blob/main/note-controller.jpg)

### Tests - JaCoCo
![Tests - JaCoCo](https://github.com/gwnll/Mediscreen_Notes/blob/main/jacoco-notes.jpg)
