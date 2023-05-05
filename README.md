# POC-Consul-Feign-Client
Requisitos para corre app:
- Java 17
- Docker
- IDE preferenci IntelliJ Idea

Primero levantar consult en un contenedor docker sgt comandos

 docker pull consul
 `línea de código`
 
 docker run \
    -d \
    -p 8500:8500 \
    -p 8600:8600/udp \
    --name=badger \
    consul agent -server -ui -node=server-1 -bootstrap-expect=1 -client=0.0.0.0

