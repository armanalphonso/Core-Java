package modifers_Access;

public class Test  {
    protected void m1() {
        System.out.println("The most misunderstood modifier");
    }
}
class B extends Test {
    public static void main(String[] args) {
        Test a = new Test();
        a.m1(); // ✅ Allowed: Same package

        B b = new B();
        b.m1(); // ✅ Allowed: Subclass object

        Test a1 = new Test();
        a1.m1(); // ✅ Allowed: Same package
    }
}