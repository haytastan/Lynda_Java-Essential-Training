package com.example.java;
// apache commons is recommended for older versions of Java or android
// to simplify tasks
// apache commons is a project that incorporates utilities for many common tasks
// the goal is to take solutions that developers have found and let them share them 
// easily with the rest of the community
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File sourceFile = new File("files/loremipsum.txt");
        File targetFile = new File("files/target.txt");

        try {
        	// fileutils class comes from the jar file that we added to our project
            FileUtils.copyFile(sourceFile, targetFile);
            System.out.println("File copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
/*
File copied! 
 */
