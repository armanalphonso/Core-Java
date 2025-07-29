package Flow_control;

class Test9 {
    public static void main(String[] args) {
        int x = 1; // Example value for x, you can change this to test other cases

        switch (x) { // Removed the semicolon here
            default:
                System.out.println("def");
                break; // Added break to exit after default case
            case 0:
                System.out.println(0);
                break; // Added break to prevent fall-through
            case 1:
                System.out.println(1);
                break; // Added break to prevent fall-through
            case 2:
                System.out.println(2);
                break; // Added break to prevent fall-through
        }
    }
}