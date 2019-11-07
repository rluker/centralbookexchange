# Get the latest ubuntu docker image.
FROM openjdk:8-jdk-alpine

RUN mkdir /opt/app
RUN mkdir /opt/app/lib
RUN mkdir /opt/app/src
RUN mkdir /opt/app/src/main
RUN mkdir /opt/app/src/main/resources

# Copy the webbutter artifact and set it as webbutter.jar
ADD ./target/original-webapp-0.0.1-SNAPSHOT.jar /opt/app/lib/centralbookexchange.jar
COPY src/main/resources/ /opt/app/src/main/resources/

WORKDIR /opt/app

# Open this port
EXPOSE 8080

# Run the jar
CMD java -Djava.security.egd=file:/dev/./urandom -jar /opt/app/lib/centralbookexchange.jar

