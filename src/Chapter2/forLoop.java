package Chapter2;

public class forLoop {
	public static void main(String[] args) {
		
		//1.infinite loop
		//Although this for loop may look like it will throw a compiler error, 
		//it will in fact compile and run without issue. 
		
		/*for (;;) {
			System.out.println("dadada");
		}*/
		
		//2. Adding Multiple Terms to the for Statement
		int x = 0;
		for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
			//System.out.print(y*z + " ");
		}
		System.out.println("-->x last value:"+x);
		
		//3. Redeclaring a Variable in the Initialization Block
		//below code not compile
		/*int x1 = 0;
		for(long y = 0, x1 = 4; x1 < 5 && y < 10; x1++, y++) { // DOES NOT COMPILE
			System.out.print(x1 + " ");
		}*/
		
		int x1;
		long y;
		for(y = 0, x1 = 4; x1 < 5 && y < 10; x1++, y++) { 
		   System.out.print(x1 + " ");
		}
		
		//4. Using Incompatible Data Types in the Initialization Block
		//below code not compile because we can not initialize long and int together
		/*for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
			System.out.print(x + " ");
		}*/
		for(long y1 = 0,x3 = 4; x3 < 5 && y1<10; x3++, y1++) {
			System.out.print(x3 + " ");
		}
		
		//5. Using Loop Variables Outside the Loop
		//below code not compile
		for (long y2 = 0, x3 = 4; x3 < 5 && y2 < 10; x3++, y2++) {
			System.out.print(y2 + " ");
		}
		//System.out.print(x3); // DOES NOT COMPILE
		
		
	}

}
