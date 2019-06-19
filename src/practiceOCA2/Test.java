package practiceOCA2;

public class Test {
	int a1;

	public static void doProduct(int a) {
		a = a * a; 
	}

	public static void doString(StringBuilder s) {
		s.append(" " + s);//Hello Hello
	}

	public static void main(String[] args) {
		Test item = new Test();
		item.a1 = 11;
		StringBuilder sb = new StringBuilder("Hello");
		Integer i = 10;
		doProduct(i);
		doString(sb);
		doProduct(item.a1);
		System.out.println(i + " " + sb + " " + item.a1);
		//i and item.a1 are local so it will get the same value
		//sb is stringBuilder and it is mutable
	}
}
