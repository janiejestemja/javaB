import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        ArrayList<String> lines = new ArrayList<>();
            // Reading in a file and printing the lines
        try {
            // Setting up Scanner for reading lines
            File file = new File("notes.txt");
            Scanner sc = new Scanner(file);

            // Looping through the lines
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lines.add(line);
            }

            // Closing Scanner
            sc.close();


            // Catching file not found
        } catch (FileNotFoundException e) {
            System.err.println("Ojojoj: " + e.getMessage());
        } finally {
            
            // Setting up outputpath
            File file = new File("example.txt");
            FileWriter writer = null;

            // Try writing
            try {
                writer = new FileWriter(file);
                writer.write("Hello World");
                writer.append("\nOther...");
                
            // Brought exception handling
            } catch (IOException e) {
                e.printStackTrace();

            // Closing writer class after succesful write
            } finally {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
                
            // After writing file printing lines of read in file
            for (String line: lines) {
                System.out.println(line);
            }
        }

    }
}
