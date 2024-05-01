/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Abdulrehman
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;


public class Record {
 // Name of the associated file
 private String filename;

 private static Record r = new Record("record.txt");
 
 public Record(String n) {
    filename = n;
 }

 // Effects: Reads and prints the contents of the associated
 // file to the standard output.
 public void read() {
    try {
        // Write the code here
        Scanner scan = new Scanner(new File(filename));
        while (scan.hasNextLine())
            System.out.println(scan.nextLine());
    }
    
    catch (IOException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
    }
 }
 
 
 // Effects: Appends the specified message, msg, to the
 // associated file.
 public void write(String msg) {
    try {
        // Write the code here
        FileWriter fwriter = new FileWriter(filename, true);
        fwriter.write(msg);
        fwriter.close();
      
    }
    
    catch (IOException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
    }
 }
 
 public static void main(String[] args) {
 // Fill the blank below that obtains the sole instance
 // of the Record class.
 // (You should not invoke the Record constructor here.)
 //______________________________________ ;


 // Do not modify the code below
 r.write("Hello-1\n");
 r.write("Hello-2\n");

 System.out.println("Currently the file record.txt " + "contains the following lines:");
 r.read();
    }
}
