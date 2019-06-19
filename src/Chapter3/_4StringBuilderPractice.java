package Chapter3;

public class _4StringBuilderPractice {

	public static void main(String[] args) {
		StringBuilder alpha = new StringBuilder();
		for (char current = 'a'; current <= 'z'; current++)
			alpha.append("" + current);
		System.out.println(alpha);
		
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println(a.equals(b));//true
		System.out.println(a==b);//true

		//Creating a StringBuilder
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("animal");
		StringBuilder sb3 = new StringBuilder(10);
		System.out.println(sb3.length());
		
	}

}
