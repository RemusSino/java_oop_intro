package ro.rs.c7;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Remus Sinorchian; created on 4/18/2017
 */
public class TcpServer {

    public static final int PORT = 8889;

    public static void main(String argv[]) throws Exception {
        String clientSentence;
        String capitalizedSentence;
        try (ServerSocket welcomeSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket connectionSocket = welcomeSocket.accept();
                BufferedReader inFromClient =
                        new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
                clientSentence = inFromClient.readLine();
                System.out.println("Received: " + clientSentence);
                capitalizedSentence = clientSentence.toUpperCase() + '\n';
                outToClient.writeBytes(capitalizedSentence);
            }
        }
    }
}

