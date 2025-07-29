package Interface;

public class Test7 {

    // Inner class Parent
    class Parent {
        Parent() {
            System.out.println("Parent constructor");
        }
    }

    // Inner class Child extends Parent
    class Child extends Parent {
        Child() {
            System.out.println("Child constructor");
        }
    }

    // main method moved to outer class
    public static void main(String[] args) {
        // Create an instance of the outer class
        Test7 outer = new Test7();

        // Create an instance of the inner class Child using the outer class reference
        Child c = outer.new Child();  // This will also call Parent's constructor
    }
}
