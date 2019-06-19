package pond.shore;

public class BirdWatcher {
	public void watchBird() {
		Bird bird = new Bird();// this mean---> stored in Bird reference = create a Bird object
		bird.floatInWater(); 		// calling protected member
		System.out.println(bird.text); // calling protected member
	}

}
