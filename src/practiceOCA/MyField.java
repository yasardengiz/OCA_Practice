package practiceOCA;

public class MyField {
	int x;
	int y;

	public void doStuff(int x, int y) {
		this.x = x;
		y = this.y;
	}

	public void display() {
		System.out.println(x + " " + y + " : ");
	}

	public static void main(String[] args) {
		MyField m1 = new MyField();
		m1.x = 100;
		m1.y = 200;
		MyField m2 = new MyField();
		
		m2.doStuff(m1.x, m1.y);
		m1.display(); //x and y values are at line 18 and 19
		m2.display();
	}
}