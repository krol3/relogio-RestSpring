# relogio-RestSpring

# Docker
docker build -t krol/relogio-restspring:latest .
docker run -p 8080:8080 krol/relogio-restspring:latest  

# Docker Hub
docker pull krol/relogio-restspring:latest

# Docker Cloud
http://relogio-restspring-cloud-1.9141a180.cont.dockerapp.io:8080/

# teste da Application
curl http://localhost:8080/rest/clock/6/0
curl http://relogio-restspring-cloud-1.9141a180.cont.dockerapp.io:8080/rest/clock/6/0
{"angle":180}

curl http://localhost:8080/rest/clock/3
curl http://relogio-restspring-cloud-1.9141a180.cont.dockerapp.io:8080/rest/clock/3
{"angle":90}

curl http://localhost:8080/rest/clock/9
curl http://relogio-restspring-cloud-1.9141a180.cont.dockerapp.io:8080/rest/clock/9
{"angle":90}