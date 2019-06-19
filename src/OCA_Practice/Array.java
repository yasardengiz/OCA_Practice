package OCA_Practice;

import java.util.Arrays;

public class Array {
	

	public static void main(String[] args) {
		
		//1
		int numbers[];

		numbers = new int[2];
		numbers[0] = 10;
		numbers[1] = 20;

		numbers = new int[4];
		numbers[2] = 30;
		numbers[3] = 40;
		System.out.println(Arrays.toString(numbers));
		
		//2	
		String str = "Hello World";
		str.trim();
		int z = str.indexOf(" ");
		System.out.println(z);
		
		// 3
		String stuff = "TV";
		String res = "";

		if (stuff.equals("TV")) {
			res = "Walter";
		} else if (stuff.equals("Movie")) {
			res = "White";
		} else {
			res = "No result";
		}
		
		//#4
		
		int i = 10;
		int j = 20;
		int k = j += i / 5;
		System.out.println(i + " : " + j + " : " + k);
		
		//6
		int num = 5;
		do {
			System.out.print(--num + "  ");
		} while (num == 0);
		
		//7
		int num1 = 5;
		do {
			System.out.print(num1-- + "  ");
		} while (num1 == 0);
      
		//8
		float  f1  =  ( 1_560.00 > 12_60.00 )  ?  10  :  20 ;
        System.out.println(f1);

	}

}
