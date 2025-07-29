package Interface;

// Outer class named Test5
public class Test5 {

    // Non-static inner class Parent
    class Parent {
        // Constructor of Parent class
        Parent() {
            System.out.println("Parent constructor");
        }
    }

    // Child class extending Parent, also a non-static inner class
    class Child extends Parent {
        // Constructor of Child class
        Child() {
            System.out.println("Child constructor");
        }
    }

    // main method — the entry point of the program
    public static void main(String[] args) {
        // Create an instance of the outer class Test5
        Test5 outer = new Test5();

        // Use the outer instance to create an instance of the inner class Child
        // This also implicitly calls the Parent class constructor first
        Child c = outer.new Child(); // Output: "Parent constructor" followed by "Child constructor"
    }
}
