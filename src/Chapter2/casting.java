package Chapter2;

public class casting {

	public static void main(String[] args) {
		short x=10;
		short y=20;
		//short z=x+y;  //compile error because when we do addition x and y will convert int
		short z=(short) (x+y);//need to down cast to short
		
		double a=10;
		int  b=5;
		// b=b+a; //compile error
		b+=a;
		
		
	}

}
