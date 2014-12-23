/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Praveen
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String clientsentence,capital;
        ServerSocket welcomesocket;
        welcomesocket = new ServerSocket(444);
        while(true)
        {
            Socket server;
            server = welcomesocket.accept();
            BufferedReader InFromClient;
            InFromClient = new BufferedReader(new InputStreamReader(server.getInputStream()));
            DataOutputStream OutToClient;
            OutToClient = new DataOutputStream(server.getOutputStream());
            clientsentence = InFromClient.readLine();
            System.out.println(clientsentence);
            capital = clientsentence.toUpperCase();
            OutToClient.writeBytes(capital);
            server.close();
            
        }
        // TODO code application logic here
    }
    
}
