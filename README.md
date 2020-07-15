# entur-mock-kafka-producer
A mock kafka producer


## Build

To build Jar file:

```
    ./gradlew build
```

To deploy image to aws ecr: 

```bash
    #This is to get credentials for aws 
    ./gradlew docker-init #./gradlew.bat docker-init-win for windows

    #To create image and pushing to aws
    ./gradlew deploy 
```