package practiceOCA;

class A {
	String name="A string";
	public void test() {
		System.out.println("A");
	}
}

class B extends A {
	String name="B string";
	public void test() {
		System.out.println("B");
	}
}

public class C extends B { // if class C extends B then answer is C C
	String name="C string";
	public void test() {
		System.out.println("C");
	}

	public static void main(String[] args) {
		A b1 = new A();
		A b2 = new C();
		b1 = (A) b2;
	
		B b3 = (B) b2; // line n1
		A b4 =(B) b2; // line n2
		b1.test();
		System.out.println(b1.name);
		b3.test();
		System.out.println(b3.name);
	}
}