package com.example.mammam.htn2016;

/**
 * Created by sophianguyen on 16-09-17.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVParser {
    {
        //Get scanner instance
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("SampleCSVFile.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Set the delimiter used in file
        scanner.useDelimiter(",");

        //Get all tokens and store them in some data structure
        //I am just printing them
        while (scanner.hasNext()) {
            System.out.print(scanner.next() + "|");
        }

        //Do not forget to close the scanner
        scanner.close();
    }
}


