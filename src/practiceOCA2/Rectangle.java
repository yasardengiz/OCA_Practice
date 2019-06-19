package practiceOCA2;

public class Rectangle {
	private double length;
	private double height;
	private double area;

	public void setLength(double length) {
		this.length = length;
		this.setArea();
	}

	public void setHeight(double height) {
		this.height = height;
		setArea();
	}

	public void setArea() {
		area = length * height;
	}
	
	public double getArea() {
		return area;
	}

	public static void main(String[] args) {
		Rectangle rec=new Rectangle();
		rec.setHeight(10);
		rec.setLength(5);
		System.out.println(rec.getArea());
	}
}
