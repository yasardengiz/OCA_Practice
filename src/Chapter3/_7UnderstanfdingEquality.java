package Chapter3;

public class _7UnderstanfdingEquality {
	public static void main(String[] args) {
		
		StringBuilder one = new StringBuilder();
		one.append("a");
		StringBuilder two = new StringBuilder();
		two.append("a");
		StringBuilder three = one;
		//NOTE:There is no difference between == and equals() for StringBuilders
		//will check whether they are pointing to the same object 
		//rather than looking at the values inside
		System.out.println(one == two); // false
		System.out.println(one == three); // true
		
		System.out.println(one.equals(two)); // false
		System.out.println(one.equals(three)); // true
		
		String x = "Hello World";
		String y = "Hello World";
		System.out.println("adasdasdasdasdasds");
		System.out.println(x == "Hello World"); // true
		
		String x1 = "Hello World";
		String z = " Hello World".trim();
		System.out.println(x1 == z); // false
		
		String x2 = new String("Hello World");
		String y2 = "Hello World";
		System.out.println(x2 == y2); // false
		
		String x3 = "Hello World";
		String z3 = " Hello World".trim();
		System.out.println(x3.equals(z3)); // true
		
		
	}
	 
}

