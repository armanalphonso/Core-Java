package Interface;

public class Test4 {
    class P {
        P() {
            System.out.println(this.hashCode());
        }
    }

    class C extends P {
        C() {
            System.out.println(this.hashCode());
        }
    }

    public static void main(String[] args) {
        Test4 outer = new Test4();   // Create instance of outer class
        C c = outer.new C();         // Create instance of inner class C
        System.out.println(c.hashCode());
    }
}