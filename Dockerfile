FROM maven:3
MAINTAINER Carol Guival <guillen.carolina@gmail.com>

EXPOSE 8080

RUN git clone https://github.com/krol3/relogio-RestSpring.git && cd relogio-RestSpring && git checkout develop

WORKDIR /relogio-RestSpring/relogio/

RUN mvn clean package

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","target/relogio-spring-rest-0.1.0.jar"]