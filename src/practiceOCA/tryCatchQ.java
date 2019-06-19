package practiceOCA;

public class tryCatchQ {

	public static void main(String[] args) {
		String names[] = { "Thomas", "Peter", "Joseph" };
		String pws[] = new String[3];
		int idx = 0;
		try {
			for (String n : names) {
				pws[idx] = n.substring(2, 6);
				idx++;
			}
		} catch (Exception e) {
			System.out.println("Invalid Name");
		}
		for (String p : pws) {
			System.out.println(p);
		}
	}
}
