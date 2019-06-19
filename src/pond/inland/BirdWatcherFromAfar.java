package pond.inland;

import pond.shore.Bird; 	// different package than Bird--> we import to work with package classes

public class BirdWatcherFromAfar { //it is not extended
	public void watchBird() {
		Bird bird = new Bird();
		bird.floatInWater(); // DOES NOT COMPILE-->(different package and it does not inherit from Bird package (no subclass)
		System.out.println(bird.text); // DOES NOT COMPILE-->
	}
}