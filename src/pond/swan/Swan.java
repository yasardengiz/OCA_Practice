package pond.swan;

import pond.shore.Bird; // in different package than Bird

public class Swan extends Bird { // but subclass of bird-->inherit
	public void swim() {
		floatInWater();           // package access to superclass
		System.out.println(text); // package access to superclass
	}

	public void helpOtherSwanSwim() {
		Swan other = new Swan();
		other.floatInWater(); 			// package access to superclass
		System.out.println(other.text); // package access to superclass
	}

	public void helpOtherBirdSwim() {
		//This time a Bird reference is used. 
		//It is created	on line 14.Bird is in a different package, 
		// and this code isn’t inheriting from Bird, so it
		//doesn’t get to use protected members. 
		Bird other = new Bird();
		//Swan other = new Swan(); //this will make it work!!
		other.floatInWater(); 			// DOES NOT COMPILE
		System.out.println(other.text); // DOES NOT COMPILE
	}
}