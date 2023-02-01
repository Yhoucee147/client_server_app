/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildString;

/**
 *
 * @author uchenna
 */
public class BuildString {
    
     public static StringBuilder data(byte[] a) 
    { 
        if (a == null) 
            return null; 
        StringBuilder ret = new StringBuilder(); 
        int i = 0; 
        while (a[i] < a.length) 
        { 
            ret.append((char) a[i]); 
            i++; 
        } 
        return ret; 
    } 
    
}
