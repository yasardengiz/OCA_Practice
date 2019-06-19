package Chapter2;

public class CompoundAssignmentOperator {

	public static void main(String[] args) {
		
		
	//	Example of compound operator
		int x=2,z=5;
		x=x*z;// x=10
		x*=z; //x=50
		System.out.println("value of new x : "+x);
		System.out.println("value of z : "+z);
		
	//	Example of compound operator2
		
		long a=7;
		int b=5;
		//b=b*a;// DOES NOT COMPILE.
		b*=a;	//compile because compound operator will first cast x to a long
				//apply the multiplication of two long values
		System.out.println("value of new b : "+b);
		System.out.println("value of a : "+a);
	}

}
