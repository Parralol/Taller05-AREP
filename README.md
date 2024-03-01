# Taller05-AREP

## Resumen

En este proyecto se trabajo con SPARK para realizar una pagina web que responde a llamados http y retorna segun las casillas especificadas la respuesta que se espera

para usar la calculadora de senos y cosenos basta con escribir:

> cos(<double .a>)
> sin(<double .a>)

siendo .a un valor cualquiera

para la calculadora de palindromos la entrada corresponde a:

> <String .a>

siendo .a un valor cualquiera

para la calculadora de vectores la entrada corresponde a:

> <int .a>, <int .b>

siendo .a y .b valores cualquiera

## Arquitectura

por medio de microservicios y un servidor web se logro establecer una comunicacion servidor-cliente y cliente-servidor

## Diseño de clases

Se busco la mayor modularidad posible usando clases simples, ademas de esto gracias a las funciones lambda con las cuales funciona SPARK es posible hacer de la pagina algo mucho mas interactivo.

## Generar imagenes

### Primer paso

Copiar el repo de git



## Docker

https://hub.docker.com/repository/docker/parralol/firstprkwebapprepo/general

> docker pull parralol/firstprkwebapprepo:latest

luego ejecutar

> docker run --name app1 -p 80:8080 -d parralol/firstprkwebapprepo:latest


## prueba funcional

![image](https://github.com/Parralol/Taller05-AREP/assets/110953563/493963d2-69dc-443a-a4b1-6ae2d7dc2068)

## REQUERIMIENTOS

*  docker
*  maven
*  java
