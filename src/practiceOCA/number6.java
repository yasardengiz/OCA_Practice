package practiceOCA;

public class number6 {

}

abstract class Planet {
	protected void resolve() { // Line n1
	}

	abstract void rotate(); // Line n2
}

class Earth extends Planet { // Line n3
	void resolve() {
	}

	protected void rotate() { // Line n4
	}
}