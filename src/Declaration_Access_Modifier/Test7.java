package Declaration_Access_Modifier;

class Test7 {
    // Method m1 that prints a message
    public void m1() {
        System.out.println("Method m1 is called.");
    }

    public static void main(String[] args) {
        Test7 test = new Test7(); // Create an instance of class Test7
        test.m1(); // Call the method m1
    }
}
