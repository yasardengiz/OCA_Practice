package OCA_Practice;

public class SwirtchStatement {
	public static void main(String[] args) {
		//we CANNOT  use :FLOAT,DOUBLE,LONG,BOOLEAN in switch
		long z = 10;//will not work because we can not use long in switch
		//double z= 10 ;//will not work because we can not use double in switch
		//float z= 10 ;//will not work because we can not use float in switch
		//boolean z = true ;will not work because we can not use boolean in switch
		switch (z) {

		case 10:
			System.out.println("Monday");
		case 11:
			System.out.println("Tuesday");
		case 12:
			System.out.println("Wednesday");

		default:
			System.out.println("Friday");
		}
	}
}
