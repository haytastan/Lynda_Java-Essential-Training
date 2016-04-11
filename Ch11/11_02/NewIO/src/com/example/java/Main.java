package com.example.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String[] args) {
    	
    	// Path object points to loremipsum.txt file
        // to get the reference to the file we use another class named Paths, 
        // which has static methods
        Path sourceFile = Paths.get("files", "loremipsum.txt");
        // We create Path object and
        // call static get method of Paths class (polymorphism gibi)
        Path targetFile = Paths.get("files", "target.txt");
        // files: subdirectory
        // target.txt: name of the destination file

        try {
        	// Files class has static methods
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            // StandardCopyOption.REPLACE_EXISTING: if the target file alreadys exists
            // we want to delete it and create a new version
            System.out.println("File copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
/*
File copied! 
 */
