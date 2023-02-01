/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package severapp;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author uchenna
 */
public class SeverApp {

    /**
     * @param args the command line arguments
     * @throws java.net.SocketException
     */
    public static void main(String[] args) throws SocketException {
        // TODO code application logic here
        
        DatagramSocket ds = new DatagramSocket(1234);
        Thread sample = new ClientHandler(ds);
        sample.start();
        System.out.println("Server Started");
    }
    
}
