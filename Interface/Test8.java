package Interface;

public class Test8 {

    // Non-static inner class Parent
    class Parent {
        int x;

        Parent() {
            x = 10;
            System.out.println("Parent constructor: x = " + x);
        }
    }

    // Non-static inner class Child extending Parent
    class Child extends Parent {
        int y;

        Child() {
            y = 20;
            System.out.println("Child constructor: y = " + y);
        }
    }

    // main method in the outer class
    public static void main(String[] args) {
        // Create an instance of the outer class
        Test8 outer = new Test8();

        // Create an instance of the inner class Child
        Child c = outer.new Child();  // Constructor chaining will happen here
    }
}
