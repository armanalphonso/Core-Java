package Flow_control;

class Test2 {
    public static void main(String[] args) {
        boolean b = true; // Declare a boolean variable b and initialize it to true
        if (b = false) { // This is an assignment, not a comparison
            System.out.println("Hello"); // This line will execute if the condition is true
        } else {
            System.out.println("hi"); // This line will execute if the condition is false
        }
    }
}