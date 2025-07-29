// Declares that this class belongs to the 'Declaration_Access_Modifier' package
package Declaration_Access_Modifier;

// Class Test2 demonstrates the usage of ArrayList
class Test2 {
    
    // Main method - the entry point of the Java application
    public static void main(String[] args) {
        
        // Create a new ArrayList instance from the java.util package
        // This ArrayList can hold objects of any type (raw type)
        java.util.ArrayList i = new java.util.ArrayList();
        
        // At this point, the ArrayList 'i' is empty
        // You can add elements to it using the add() method
        // For example: i.add("Hello");
        
        // Print the current state of the ArrayList (will be empty)
        System.out.println("Current ArrayList: " + i);
        
        // Example of adding elements to the ArrayList
        i.add("Hello"); // Adding a string element
        i.add("World"); // Adding another string element
        
        // Print the updated ArrayList after adding elements
        System.out.println("Updated ArrayList: " + i);
    }
}
