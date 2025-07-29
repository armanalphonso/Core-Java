package Flow_control;

class Test5 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        switch (x) {
            case 10:
                System.out.println(10);
                break;
            case 20: // Use the constant value instead of the variable
                System.out.println(20);
                break;
            default:
                System.out.println("No match found");
                break;
        }
    }
}