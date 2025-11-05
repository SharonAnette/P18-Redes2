import java.io.*;
import java.net.*;

public class ServidorMultithread { 
        private static final int PORT = 8080; // Puerto en el que el servido>
        public static void main(String[] args) { 
                try (ServerSocket serverSocket = new ServerSocket(PORT)) { 
                        System.out.println("Servidor en espera de conexiones>
                        while (true) { 
                                // Aceptar la conexión del cliente 
                                Socket clienteSocket = serverSocket.accept()>
                                System.out.println("Cliente conectado: " + c>
                                // Crear un nuevo hilo para manejar al clien>
                                ClientHandler handler = new ClientHandler(cl>
                          new Thread(handler).start(); 
                        } 
                } catch (IOException e) { 
                        e.printStackTrace(); 
                }     }    } 
