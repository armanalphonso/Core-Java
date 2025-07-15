package main_method;

class Test6 {
public static void main(String[]arg) {
	System.out.println("parent main");
}
}           // it is method hiding but not overriding
class c extends Test6 {
	public static void main(String[]args) {
		System.out.println("child main");
	}
}