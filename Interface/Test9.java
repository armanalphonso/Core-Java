package Interface;

public class Test9 {

    // Interface: defines a contract
    interface Calculator {
        double calculate(double a, double b);
    }

    // Abstract class: provides common structure
    static abstract class Operation implements Calculator {
        public void printResult(double a, double b) {
            double result = calculate(a, b);
            System.out.println("Result: " + result);
        }
    }

    // Concrete class: Addition
    static class Addition extends Operation {
        public double calculate(double a, double b) {
            return a + b;
        }
    }

    // Concrete class: Subtraction
    static class Subtraction extends Operation {
        public double calculate(double a, double b) {
            return a - b;
        }
    }

    // Concrete class: Multiplication
    static class Multiplication extends Operation {
        public double calculate(double a, double b) {
            return a * b;
        }
    }

    // Concrete class: Division
    static class Division extends Operation {
        public double calculate(double a, double b) {
            if (b == 0) {
                System.out.println("Error: Division by zero!");
                return 0;
            }
            return a / b;
        }
    }

    // Main method
    public static void main(String[] args) {
        double num1 = 12;
        double num2 = 4;

        Operation add = new Addition();
        Operation sub = new Subtraction();
        Operation mul = new Multiplication();
        Operation div = new Division();

        System.out.println("Addition:");
        add.printResult(num1, num2);

        System.out.println("Subtraction:");
        sub.printResult(num1, num2);

        System.out.println("Multiplication:");
        mul.printResult(num1, num2);

        System.out.println("Division:");
        div.printResult(num1, num2);
    }
}