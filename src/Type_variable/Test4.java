package Type_variable;

class Test4 {
    static int x = 10;
    int y = 20;

public static void main(String[] arg) {
Test4 t1 = new Test4();
t1.x = 888; // This changes the static variable x
t1.y = 999; // This changes the instance variable y for t1
Test4 t2 = new Test4(); // Creates a new instance of Test4
System.out.println(t2.x + "--" + t2.y); // Corrected line
}
}