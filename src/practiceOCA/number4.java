package practiceOCA;

public class number4 {
	public static void main(String[] args) {
		Short s1 = 200;
		Integer s2 = 400;
		Long s3 = (long) s1 + s2; // Line n1
		String s4 = (String) (s3 * s2); // Line n2
		System.out.println("Sum is " + s4);
		}
	
}
