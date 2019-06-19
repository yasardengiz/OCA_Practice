package practiceOCA2;

public class num17 {
	public static void main(String[] args) {
		String str = " ";

		// trim will remove spaces but because of
		// string is immutable it will not change
		// until we assign it to new reference
		str.trim();
		System.out.println(str.equals(""));
	}
}
