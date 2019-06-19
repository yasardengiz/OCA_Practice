package practiceOCA;

public class number30 {

	public static void main(String[] args) {
		String[] arr = { "A", "B", "C", "D" };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (arr[i].equals("C")) {
				//System.out.print(arr[i] + " ");
				continue;
				//break;
			}
			System.out.println("Work done");
		}
		//System.out.println("Work done");
	}
}
