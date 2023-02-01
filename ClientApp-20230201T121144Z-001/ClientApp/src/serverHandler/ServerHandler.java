/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverHandler;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author uchenna
 */
public class ServerHandler {
    
    public String callServer(String studTest) throws SocketException, UnknownHostException, IOException{
           DatagramSocket ds = new DatagramSocket();
            InetAddress ip = InetAddress.getLocalHost(); 
       
        byte[] buf = null;
        buf = studTest.getBytes();
        
        DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 1234); 
        
        ds.send(DpSend);
        
        System.out.println("ID Sent by Client");
        
        byte [] respByte = new byte [63500];
        DatagramPacket dpRecieve = new DatagramPacket(respByte, respByte.length);
        DatagramSocket ds2 = new DatagramSocket(1235);
        ds2.receive(dpRecieve);
        respByte = dpRecieve.getData();
        
        String msg = new String(respByte);
        System.out.println("Details Recieved by Client " + msg) ;
        
        ds2.close();
        
        return msg;
        
    }
    
}
