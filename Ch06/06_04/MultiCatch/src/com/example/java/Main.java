package com.example.java;

public class Main {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
            char lastChar = chars[chars.length - 1];
            // if an exception was thrown from this statement 
            // StringIndexOutOfBoundsException wouldn't get caught
            System.out.println(lastChar);

            String sub = welcome.substring(10);

        } catch (ArrayIndexOutOfBoundsException e) { // e is a local variable
//            e.printStackTrace();
            System.out.println("Array index problem!");
        } catch (StringIndexOutOfBoundsException e) { // e is a local variable
            System.out.println("String index problem!");
        }
        
       // real multi-catch:
//        catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) { 
//        e.printStackTrace();
//      } 

    }

}
/*
 !
String index problem!
 */
