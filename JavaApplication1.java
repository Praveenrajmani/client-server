/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;
import java.net.*;

/**
 *
 * @author Praveen
 */
public class JavaApplication1 {
    private static Object system;

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws Exception {
        String sentence,modifiedsentence;
        try (Socket client = new Socket("localhost",444)) {
            BufferedReader InFromUser = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream OutToServer = new DataOutputStream(client.getOutputStream());
            BufferedReader InFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            sentence = InFromUser.readLine();
            OutToServer.writeBytes(sentence);
            modifiedsentence = InFromServer.readLine();
            System.out.println("Server: "+modifiedsentence);
            client.close();
        }
;
        
        
        // TODO code application logic here
    }
    
}
