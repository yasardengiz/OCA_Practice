package Chapter4;

public class StaticFinal {
	//static variables are meant to never change during the program. 
	//This type of variable is known as a constant. 
	//It uses the final modifer to ensure the variable never changes.
	//static final constants use a different naming convention than other variables. 
	//They use all uppercase letters with underscores between “words.” 
	
	private static final int NUM_BUCKETS = 45;

	public static void main(String[] args) {

		// NUM_BUCKETS = 5; // DOES NOT COMPILE
		System.out.println(NUM_BUCKETS);
	}

}
