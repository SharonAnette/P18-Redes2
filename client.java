import java.io.*;
import java.net.*;

public class ClientHandler implements Runnable {
    private Socket clientSocket;

    public ClientHandler(Socket socket) { this.clientSocket = socket; }

    @Override
    public void run() {
        try (
            BufferedReader in = new BufferedReader(new InputStreamReader(cli>
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream()>
        ) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Received: " + inputLine);
                out.println("Echo: " + inputLine);
            }
        } catch (IOException e) {
            System.err.println("Error in ClientHandler: " + e.getMessage());
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }   }   }


