package Declaration_Access_Modifier; // Declares the package for the class

import java.util.Date; // Imports the Date class from the java.util package
import java.sql.*; // Imports all classes from the java.sql package (not used in this example)

class Test3 { // Defines a public class named Test3
    public static void main(String[] args) { // Main method - entry point of the program
        Date d = new Date(); // Creates a new instance of the Date class representing the current date and time
        System.out.println(d.getClass().getName()); // Prints the name of the class of the Date object
    }
}
