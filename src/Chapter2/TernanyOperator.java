package Chapter2;

public class TernanyOperator {

	public static void main(String[] args) {
		// booleanExpression ? expression1 : expression2
//*************************************************************		
		int y = 10;
		final int x;
		if(y > 5) {
			x = 2 * y;
		} else {
			x = 3 * y;
		}
		System.out.println("x value: "+x);
		
		/*Compare the previous code snippet with the following equivalent ternary operator code
		snippet:*/
		int y1 = 10;
		int x1 = (y1 > 5) ? (2 * y1) : (3 * y1);
		System.out.println("x1 value: "+x1);
		
		System.out.println((y > 11) ? 21 : "Zebra");
		
		//int animal = (y < 9) ? 9 : "Horse"; // DOES NOT COMPILE
//*****************************************************************
		int y11 = 1;
		int z = 1;
		final int x11 = y11<10 ? y11++ : z++;
		System.out.println(y11+","+z); // Outputs 2,1
		
		/*Notice that since the left-hand boolean expression was true, only y was incremented.
		Contrast the preceding example with the following modification:*/
		
		int y111 = 1;
		int z1 = 1;
		final int x111 = y111>=10 ? y111++ : z1++;
		System.out.println(y111+","+z1); // Outputs 1,2
//*******************************************************************		
	}

}
