package Interface;

public class Test6 {

    // Abstract inner class
    abstract class Animal {
        Animal() {
            System.out.println("Animal constructor called");
        }
    }

    // Concrete inner class that extends the abstract class
    class Dog extends Animal {
        Dog() {
            System.out.println("Dog constructor called");
        }
    }

    // Static main method (entry point of the program)
    public static void main(String[] args) {
        // Step 1: Create an instance of the outer class (Test6)
        Test6 outer = new Test6();

        // Step 2: Use the outer class instance to create Dog object
        Dog dog = outer.new Dog();  // This will also invoke Animal's constructor
    }
}