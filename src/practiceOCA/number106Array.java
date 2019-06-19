package practiceOCA;

public class number106Array {

	public static void main(String[] args) {
		int numbers[];
		numbers = new int[2];
		numbers[0] = 10;
		numbers[1] = 20;
		//numbers[10,20]
		numbers = new int[4]; // we create new array with size 4
		numbers[2] = 30;
		numbers[3] = 40;
		//numbers[0,0,30,40]
		for (int x : numbers) {
			System.out.print(" " + x);
		}
	}

}
