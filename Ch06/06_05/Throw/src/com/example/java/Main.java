package com.example.java;

public class Main {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
        	// if we want to throw our own exceptions we can
        	// either use the core exception class (like now) or  
        	// create our own custom exception class
        	
        	// we can generate our own exceptions and give them 
        	// custom error messages
            if (chars.length < 10) {
            	
            	//Exception x = new Exception("My custom message");
                // throw (x);
                throw (new Exception("My custom message")); //  alt: throw new Exception("My custom message");
                // we are calling the throw method and passing an Exception object
                // with a constructor as an argument
                // neticede catch (Exception e) metodu çaðýrýldý.
                
                // throw (new StringIndexOutOfBoundsException("My custom message")); denseydi 
                // "String index problem!" print edilecekti
            }

            char lastChar = chars[chars.length];
            System.out.println(lastChar);

            String sub = welcome.substring(10);
            System.out.println("Substring: " + sub);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index problem!");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index problem!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // System.out.println("error"); denseydi error olarak output edilecekti
        }

    }

}
/*
 My custom message 
 */
