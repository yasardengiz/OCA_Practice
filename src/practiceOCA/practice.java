package practiceOCA;

public class practice {

	public static void main(String[] args) {
		// int ans=0;
		try {
			int num = 10;
			int div = 0;
			int ans = num / div;
		} catch (ArithmeticException ae) {
			ans = 0; // line n1
			// System.out.println(ans);
		} catch (Exception e) {
			System.out.println("Invalid calculation");
		}
		System.out.println("Answer = " + ans); // line n2
	}

}
