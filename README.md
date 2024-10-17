# springboot-application-profile-poc

### Using Command Line Arguments
java -jar MySpringApp.jar --spring.profiles.active=prod

### External: Using Command Line Arguments
java -jar MySpringApp.jar --spring.config.location=file:/path/to/external/application.yaml


### External: Multiple External Configuration Files
java -jar MySpringApp.jar --spring.config.location=file:/path/to/external/application-dev.yaml,file:/path/to/external/application-prod.yaml


### External: External Configuration Folder (Optional)
java -jar MySpringApp.jar --spring.config.location=file:/path/to/external/

