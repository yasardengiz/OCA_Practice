package practiceOCA;

public class number13 {
	public static void main(String[] args) {
		DVD dvd = new DVD(10, 20);
	}
}

class CD {
	int r;

	CD(int r) {
		this.r = r;
	}
}

class DVD extends CD {
	int c;

	DVD(int r, int c) {
		//line n1 //solution is below
		super(r);
		this.c=c;
	}
}
