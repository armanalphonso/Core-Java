package modifers_Access;

	class Test4 {
	    int x = 10;
	    static int y = 20;

	    public void m1() {
	        System.out.println(x); // ok
	        System.out.println(y); // ok
	    }

	    public static void m2() {
	        // System.out.println(x); // ❌ Cannot access non-static x directly
	        Test4 obj = new Test4(); // ✅ create object to access x
	        System.out.println(obj.x);
	        System.out.println(y);
	    }

	    public static void main(String[] args) {
	        Test4 t = new Test4();
	        t.m1();  // instance method
	        m2();    // static method
	    }
	}