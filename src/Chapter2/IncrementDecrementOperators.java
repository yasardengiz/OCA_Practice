package Chapter2;

class IncrementDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;		
		int y=10;
		
// ++x --->operator is applied first and value return the new value of the expression
// x++ --->original value of the expression is returned,with operator applied after the value is returned		
		int a=++x; //"x" increased then will equal to "a"
		int b=y++; //"y" equals to "b" then y increased
		int c=++x *5 /x-- + --x;
		System.out.println("a value: "+a);
		System.out.println("new x value:"+x);
		System.out.println("b value: "+b);		
		System.out.println("new y value:"+y);
		System.out.println("c value: "+ c);
		
		System.out.println("-------------------------------");

		int xx=20;		
		int yy=30;
		
		int aa=--xx ; // aa=19 xx=19
		int bb=yy--;  // bb=30 yy=29
		System.out.println("aa value: "+aa);
		System.out.println("new xx value:"+xx);
		System.out.println("bb value: "+bb);		
		System.out.println("new yy value:"+yy);
		

		}

}
