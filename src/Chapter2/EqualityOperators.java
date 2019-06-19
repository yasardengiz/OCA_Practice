package Chapter2;

import java.io.File;

public class EqualityOperators {
	public static void main(String[] args) {
		File x = new File("myFile.txt");
		File y = new File("myFile.txt");
		File z = x;
		System.out.println(x == y); // Outputs false
		System.out.println(x == z); // Outputs true
	}

}
