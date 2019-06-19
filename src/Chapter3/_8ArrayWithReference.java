package Chapter3;

public class _8ArrayWithReference {

	public static void main(String[] args) {
		String[] bugs = { "cricket", "beetle", "ladybug" };
		String[] alias = bugs;
		String[] array = { "cricket", "beetle", "ladybug" };
		
		//equals() check the reference equality
		//references should be same for true 
		//even the content same if they are different object it will be false
		System.out.println(bugs.equals(alias)); // true
		System.out.println(bugs.equals(array)); // false		
		
		System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0

		StringBuilder names = new StringBuilder(5);
		System.out.println(names.length());//0
		
		String names1[] = new String[5];
		System.out.println(names1.length);//5
		
		
	}

}
