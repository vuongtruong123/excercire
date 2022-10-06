package com.example;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;

public class Text {
  public static void create() {
    try {
      File myObj = new File("D:\\Java\\demo3\\src\\test\\java\\com\\example\\ReadTXT.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  public static void write() {
    try {
      FileWriter myWriter = new FileWriter("D:\\Java\\demo3\\src\\test\\java\\com\\example\\ReadTXT.txt");
      myWriter.write("Phú Đĩ!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

