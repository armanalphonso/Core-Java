package Interface;

abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student1 extends Person {
    int rollno;

    Student1(String name, int age, int rollno) {
        super(name, age);  // Call parent constructor
        this.rollno = rollno;
        System.out.println("Student created with 100 properties");
    }
}

public class test3 {
    public static void main(String[] args) {
        Student1 s = new Student1("Arman", 20, 101);
        System.out.println("Name: " + s.name + ", Age: " + s.age + ", Roll No: " + s.rollno);
    }
}
