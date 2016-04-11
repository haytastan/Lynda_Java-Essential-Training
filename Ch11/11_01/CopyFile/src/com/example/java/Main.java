package com.example.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

        String sourceFile = "files/loremipsum.txt";
        String targetFile = "files/target.txt";
        
        // try with resources syntax style doesn't require closing the objects
        try (
        		// we create 3 closable objects: filereader, bufferedreader and filewriter
                FileReader fReader = new FileReader(sourceFile);
                BufferedReader bReader = new BufferedReader(fReader);
        		// bufferedreader class makes it easy to read one line at a time
                FileWriter writer = new FileWriter(targetFile) 
                // filewriter class is used to create target file
                // no need to put semicolon 
        ) {
        	// we create an infinite loop which we need to explicitly break out of the loop
            while (true) {
                String line = bReader.readLine();
                // read one line using bufferedreader object
                if (line == null) {
                    break;
                } else {
                	System.out.println(line); // prints on the screen
                    writer.write(line + "\n"); // writes on a new file
                    // we take the string we read and write to the target file
                    // we also passed the line feed because separation of lines were ignored
                }
            }
            System.out.println("\nFile copied!");
            // Alternative Way 
//        	String line = bReader.readLine();
//
//			while (line != null) {
//				System.out.println(line);
//				writer.write(line + "\n");
//				line = bReader.readLine();
//			}
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

/*
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas imperdiet venenatis sodales. Nunc elementum scelerisque nibh, nec pellentesque lacus hendrerit sit amet. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras luctus euismod augue, vitae pulvinar est feugiat vitae. Nunc ultricies facilisis mi sed commodo. Aliquam erat volutpat. Etiam id libero nunc. Morbi porttitor porta urna at facilisis.
 
Quisque at mauris quam, in tempor odio. Aenean tempus enim quis velit consequat ac molestie sapien malesuada. Fusce mauris tellus, bibendum in scelerisque sit amet, tristique at lectus. Morbi posuere magna sed turpis lacinia ut consequat leo pellentesque. Sed sem orci, dictum non mattis quis, lobortis in diam. Vivamus sed erat ac eros euismod adipiscing eu et dolor. Nulla fringilla erat eu quam fringilla et dapibus quam imperdiet. Nullam a tempus leo. Suspendisse in justo turpis, nec convallis nisl. Donec vulputate, odio viverra euismod placerat, massa risus bibendum mauris, vestibulum fermentum justo metus quis nisl.

File copied!
 
 */
