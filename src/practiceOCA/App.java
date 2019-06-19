package practiceOCA;

public class App {
	int count;

	public static void displayMsg() {
		count++;//we can initilize instance variable in static method or block
//line n1
		System.out.println("Welcome " + "Visit Count : " + count); // line n2
	}

	public static void main(String[] args) {
		App.displayMsg();
//line n3
		App.displayMsg();
//line n4
	}
}
