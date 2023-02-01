/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package severapp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import querrier.Querrier;

/**
 *
 * @author uchenna
 */
public class ClientHandler extends Thread{
    
    DatagramSocket ds;
    
    public ClientHandler(DatagramSocket ds){
        this.ds = ds;
    }

    @Override
    public void run() {
         byte[] receive = new byte[63500];
         byte[] send;
         
         DatagramPacket dpReceive;
         DatagramPacket dpSend;
         
         while(true){
             try {
                 dpReceive = new DatagramPacket(receive, receive.length);
                 ds.receive(dpReceive);
                 byte [] querryString = dpReceive.getData();
                 System.out.println("Details Recieved by Server");
                 Querrier querry = new Querrier();
                 String feedback = querry.checkEntities(data(querryString).toString());
                 send = feedback.getBytes();
                 DatagramSocket ds2 = new DatagramSocket();
                 InetAddress ip = InetAddress.getLocalHost();
                 dpSend = new DatagramPacket(send, send.length, ip, 1235);
                 ds2.send(dpSend);
                 System.out.println("Details sent by Server " + feedback);
             } catch (IOException ex) {
                 Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }
    
     public static StringBuilder data(byte[] a) 
    { 
        if (a == null) 
            return null; 
        StringBuilder ret = new StringBuilder(); 
        int i = 0; 
        while (a[i] != 0) 
        { 
            ret.append((char) a[i]); 
            i++; 
        } 
        return ret; 
    } 
    
}
