# relogio-RestSpring

# Docker
docker build -t krol/relogio-restspring:latest .
docker run -t krol/cadastro-rest-spring-app
docker run -p 8080:8080 -t krol/cadastro-rest-spring-app  

# teste da Application
curl http://localhost:8080/rest/clock/6/0
{"angle":180}

curl http://localhost:8080/rest/clock/3
{"angle":90}

curl http://localhost:8080/rest/clock/9
{"angle":90}