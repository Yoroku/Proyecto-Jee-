#!/bin/bash
LABEL=$(date +'%Y%m%d-%H%M%S')
mvn clean package && docker build -t cl.ulagos/gestion.ferreteria:$LABEL .
docker rm -f gestion.ferreteria || true && docker run -it -p 8080:8080 -p 4848:4848 --name gestion.ferreteria cl.ulagos/gestion.ferreteria:$LABEL

