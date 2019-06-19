package Chapter3;

public class _3StringMethodChaining {
	public static void main(String[] args) {
		String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);
		
		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C', '3');
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		
	}	
}
