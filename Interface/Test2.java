package Interface;

abstract class Student {
    String name;
    int age;
    int rollno;

    Student(String name, int... args) {
        this.name = name;
        if (args.length >= 2) {
            this.age = args[0];
            this.rollno = args[1];
        } else {
            throw new IllegalArgumentException("Please provide both age and rollno.");
        }
    }

    // Abstract method
    abstract void displayDetails();
}

public class Test2 extends Student {
    Test2(String name, int... args) {
        super(name, args);
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollno);
    }

    public static void main(String[] args) {
        Test2 t = new Test2("Arman", 20, 1001);
        t.displayDetails();
    }
}
