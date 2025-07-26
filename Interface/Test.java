package Interface;

// Base class
class ServiceProvider {
    public void m1() {
        System.out.println("ServiceProvider m1");
    }
}

// Class containing main or test methods
public class Test {
    // Subclass of ServiceProvider
    class subServiceProvider extends ServiceProvider {
        public void m2() {
            System.out.println("subServiceProvider m2");
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        subServiceProvider obj = test.new subServiceProvider();
        obj.m1(); // From ServiceProvider
        obj.m2(); // From subServiceProvider
    }
}