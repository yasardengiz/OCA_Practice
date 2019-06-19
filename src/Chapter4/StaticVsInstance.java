package Chapter4;

public class StaticVsInstance {
	String name="yasar";
	int height=170;
	static String city="Detroit";
	

	// static method
	public static void main(String[] args) {
System.out.println("Instance section***********************************");		
		//Calling instance method
		//can not call it directly
		//need to create an object to able to access the instance method
		StaticVsInstance s1 = new StaticVsInstance();//create an object
		int sumNum = s1.sum(20, 30);
		System.out.println(sumNum);
		
		//we can call the method in this way too
		int sumNum2=new StaticVsInstance().sum(20,30);
		System.out.println(sumNum2);
	
		//calling instance variable
		//System.out.println(name); //NOT working need object
		System.out.println(s1.name);
		
System.out.println("Static section***********************************");
		//Calling static method
		//we can call it directly in same class
		//no need to use classname
		System.out.println(sum1(10,34));
		
		//calling static/class variable
		System.out.println(city);
		
	}

	// instance method -NON-STATIC
	public int sum(int x, int y) {
		int sum = x + y;
		return sum;
		
	}
	
	// STATIC method
	public static int sum1(int x, int y) {
		int sum = x + y;
		return sum;
	}
	// instance method -NON-STATIC
		public int dif(int x, int y) {
			int dif = x - y;
			return dif;
		}
}
