/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.book.ch1.wcrawling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author y.reyes
 */
public class YhoMain {
    
    public static void main(String[] args) {
        System.out.println("where everyting start!!");
        
        try{
            URL url = new URL("http://seri.siv.gob.do/consulta/Participantes_Tipos.php");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            
            System.out.println("Response code : " + 
                    connection.getResponseCode());
            
            System.out.println("Content Type : " + connection.getContentType());
            System.out.println("Content Length : " + connection.getContentLength());
            
            InputStreamReader isr = new InputStreamReader( 
                    (InputStream) connection.getContent()  );
            
            BufferedReader br = new BufferedReader(isr);
            StringBuilder buffer = new StringBuilder();
            
            String line;
            
            do{
                line = br.readLine();
                buffer.append(line + "\n");
            } while (line != null);
            
            System.out.println(buffer.toString());          
            
            
            
        }//end of try 
        catch( IOException ex){
                System.out.println("Error : " + ex.getMessage());
        }//end of MalformedURLException 
        
    }//end of main method
    
}//end of class
