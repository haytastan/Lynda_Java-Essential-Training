package com.example.java;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Main {

	private static final String FLOWERS_FEED =
            "http://services.hanselandpetal.com/feeds/flowers.xml";
    // we are trying to request that file and download it 
    // and display its content from the application

    public static void main(String[] args) throws IOException {
    	
    	// we create InputStream object and initialize it
        InputStream stream = null;
        BufferedInputStream buf = null;
        
        try {
            URL url = new URL(FLOWERS_FEED);
            stream = url.openStream();
            // We call openStream method of URL object
            // and assign InputStream object to it (polymorphism gibi)
            
            buf = new BufferedInputStream(stream);
            
            // stringbuilder object lets us collect the data from the request
            StringBuilder sb = new StringBuilder();

            while (true) {
                int data = buf.read();
                // read method goes and gets single character from the stream
                // if it is unsuccessful it returns -1
                
                if (data == -1) {
                    break;
                } else {
                    sb.append((char)data);
                 // if data value isn't -1 we take that data value 
                 // and interpret as a single character
                }
            }

            System.out.println(sb);
            // once we are out of the loop we will have successfully 
            // downloaded everything from the website
        } catch (IOException e) {
            e.printStackTrace();
        } finally { // we guarantee to close streams with finally block
            stream.close();
            buf.close();
        }

    }

}
