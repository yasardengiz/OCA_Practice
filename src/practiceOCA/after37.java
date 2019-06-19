package practiceOCA;
//number 37

//class Tester {
//	static int count = 0;
//	int i = 0;
//
//	public void changeCount() {
//		while (i < 5) {
//			i++;
//			count++;
//		}
//	}

//	public static void main(String[] args) {
//		Test check1 = new Test();
//		Test check2 = new Test();
//		check1.changeCount();
//		check2.changeCount();
//		System.out.print(check1.count + " : " + check2.count); //count 10 count 10
//	}
//}


public class after37 {
	public static void main(String[] args) {
	// 38			
	double discount = 0;
	int qty =85;
	if(qty>80 && qty<90)
	{
		discount = 0.2;
	}else
	{
		discount = 0;
	}if(qty>=90)
	{
		discount = 0.5;
	}else
	{
		discount = 0;
	}
	
	System.out.println(discount);
}}

