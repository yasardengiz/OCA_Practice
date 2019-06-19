package Chapter4;

public class StaticInitialization {
	//They add the static keyword to specify they
	//should be run when the class is frst used
	
	private static final int NUM_SECONDS_PER_HOUR;
	
	static {
	int numSecondsPerMinute = 60;
	int numMinutesPerHour = 60;
	NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
	}
	
	public static void main(String[] args) {
		//StaticInitialization a=new StaticInitialization();
		System.out.println(NUM_SECONDS_PER_HOUR);
	}

}
