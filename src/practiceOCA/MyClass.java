package practiceOCA;

public class MyClass {
	public static void main(String[] args) {
		String s = "Java Duke";
		String t = "   Java Duke";
		int len = s.trim().length();//will trim space at the END and BEGINNING
		int len1 = t.trim().length();
		System.out.println(len);
		System.out.println(len1);
		boolean a = new Boolean(Boolean.valueOf("TRUE"));
		System.out.println(a);
	}
}
