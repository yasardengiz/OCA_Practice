package practiceOCA2;

import practiceOCA.Acc;

public class AccTest extends Acc {
	
	//protected int r=7;
	//public int s=15;
	public static void main(String[] args) {
		Acc obj=new AccTest(); //public
		System.out.println(obj.s);
		
		AccTest obj1=new AccTest();//public -protected
		System.out.println(obj1.r);
	}
}