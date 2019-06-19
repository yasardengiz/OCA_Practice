package practiceOCA;

import java.util.ArrayList;

public class removeListNumber105 {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<>();
		int a=1;
		Integer b=1;
		points.add(1);
		
		points.add(2);
		points.add(3);
		points.add(4);
		points.add(null);
		System.out.println(points);
		points.remove(b);
		System.out.println(points);
		points.remove(null);
		System.out.print(points);
	}
}
