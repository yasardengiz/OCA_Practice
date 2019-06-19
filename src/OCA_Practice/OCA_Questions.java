package OCA_Practice;

import java.util.*;

class OCA_Questions {

	public static void main(String[] args) {



		//about 30 questions from Strings, arrays, primitives, operators, etc
		//array questions were basic, some of them were time consuming
		//4-5 questions about exceptions
		//2 questions Date and time
		//1 question from lambda
		//5-10 questions about methods, class members and their properties (statics, non-statics)
		//15-20 questions about OOP concept such as inheritance, interface, abstract classes, constructors, overloading and overriding, polymorphism
		


		
		String[][] letters = {{"A", "B", "C"}, {"D", "E"}};
		for(int i=0; i<letters.length; i++) {
			for(int j = 0; j<letters[i].length; j++) {
				System.out.println(letters[i][j] + " ");
				if(letters[i][j].equals("B")) {
					break;
				}
			}
			continue;
		}
		
		
		
		System.out.println("********************************");

//		boolean key = true;
//
//		switch (key) {
//			case true:
//				System.out.println("True");
//				break;
//			default:
//				System.out.println("False");
//
//		}
//		System.out.println("Done");
		
		//what should be done to make this code compile?
		//boolean key = true; should be converted to String key = "true" and 
		//case true should be converted to case "true"
		//because boolean cannot be used in switch statements
		
		
		System.out.println("********************************");

		int[] array4 = {10, 20, 30, 40, 50};
		array4[1] = array4[3];
		array4[3] = 100;
		
		//what will the output of array4 be?
		
		System.out.println("********************************");
		
		int variable = 9;
		
		if(variable++<10) {
			System.out.println(variable + " hello!");
		} else {
			System.out.println(variable + " goodbye!");
		}
		
		System.out.println("********************************");
		
		String [] names = {"Ali", "Veli", "kirkdokuz", "elli"};
		System.out.println(names.length);
		System.out.println(names[1].length());
		
		
		System.out.println("********************************");
		
		int num1 = 1;
		int num2 = 0;
		
		if(num1++>++num2) {
			System.out.println("hello ");
		} else {
			System.out.println("welcome ");
		}
		
		System.out.println(num1 + ", " + num2);
		
		
		System.out.println("********************************");

		

		int numbers[];

		numbers = new int[2];

		numbers[0] = 10;
		numbers[1] = 20;

		numbers = new int[4];
		numbers[2] = 30;
		numbers[3] = 40;

		for (int x : numbers) {
			System.out.println(" " + x);
		}

		System.out.println("********************************");

		int array3[][] = { { 1, 2 }, { 3, 4 } };

		for (int i = array3.length - 1; i >= 0; i--) {
			for (int x : array3[i]) {
				System.out.println(x);
			}
		}

		System.out.println("********************************");
//
//		int array2[] = { 1, 2, 3, 4, 5 };
//
//		int var = 4;
//
//		int count = 0;
//
//		for (int i : array2) {
//			if (i != var) {
//				continue;
//				count++; // compile error because this is unreachable
//			}
//		}

//		System.out.println(count + "exists");

		System.out.println("********************************");

		String a = "String";

		String[] array = { "S", "t", "r", "i", "n", "g" };

		String str2 = "";

		for (String str1 : array) {
			str2 = str2 + str1;
		}

		boolean result1 = (a == str2);
		boolean result2 = (a.equals(str2));

		System.out.println(result1 + " " + result2);

		System.out.println("********************************");

		System.out.println("Output is " + 0 + 1); // 01
		System.out.println("Output is " + (0 + 1)); // 1
		System.out.println("Output is " + (0) + (1));// 01

		System.out.println("********************************");

		String str = " Erdem Denizli ";
		str.trim();

		System.out.println(str.indexOf(" "));

		System.out.println("********************************");

		/* insert code here */

		int arr[];
		arr = new int[2];

		arr[0] = 10;
		arr[1] = 20;

		System.out.println(arr[0] + ", " + arr[1]);

		System.out.println("********************************");

		getSum(5.0, 10.0);

	}

	public static void getSum(float x, float y) {
		System.out.println("float sum is " + (x + y));
	}

	public static void getSum(double x, double y) {
		System.out.println("double sum is " + (x + y));
	}

}