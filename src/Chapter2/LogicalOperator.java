package Chapter2;

public class LogicalOperator {

	public static void main(String[] args) {
	//Logical Operators	
		//AND (&)
		//INCLUSIVE OR (|)
		//EXCLUSIVE OR (^)
		
	//Conditional Operators	
		//AND (&$)
		//OR (||)
	int x=6;
	boolean y= (x>=6)||(++x<=7);//it will NOT check right-side because of left-side True
	System.out.println("x : "+ x);
	System.out.println("y: "+y);

	}

}
