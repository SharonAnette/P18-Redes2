# Práctica 18 — Ejemplo FTP en Python

## Objetivo
Implementar un cliente y servidor FTP en Python utilizando la biblioteca `socket` para comprender el funcionamiento del protocolo FTP, permitiendo la transferencia de archivos entre un cliente y un servidor local.

## Funcionamiento
El programa implementa dos componentes:

1. **Servidor FTP:**  
   - Escucha conexiones entrantes y espera comandos FTP básicos como `LIST`, `GET`, y `PUT`.  
   - Envía listados de archivos disponibles o recibe/envía archivos solicitados por el cliente.

2. **Cliente FTP:**  
   - Se conecta al servidor y envía comandos FTP.  
   - Permite descargar, subir o listar archivos en el servidor.

Esta práctica muestra cómo se establece una comunicación cliente-servidor orientada a la transferencia de archivos, aplicando el modelo de comunicación TCP/IP y los principios del protocolo FTP.
