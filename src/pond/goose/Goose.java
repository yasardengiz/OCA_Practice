package pond.goose;

import pond.shore.Bird; //import Bird class

public class Goose extends Bird { //inherit Bird class --subclass
	public void helpGooseSwim() {
		//Bird other1 =new Bird ();
		//other1.floatInWater();// not compile
		
		Goose other = new Goose(); //create Goose object
		other.floatInWater();
		
		System.out.println(other.text);
	}

	public void helpOtherGooseSwim() {
		//Although the object happens to be a Goose, it is stored in a Bird reference. 
		//We are not allowed to refer to members of the Bird
		//class since we are not in the same package and 
		//Bird is not a subclass of Bird.
		Bird other = new Goose();// it stored in a Bird reference = Goose object
		other.floatInWater(); 			// DOES NOT COMPILE
		System.out.println(other.text); // DOES NOT COMPILE
	}
}