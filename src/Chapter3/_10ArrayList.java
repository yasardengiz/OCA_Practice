package Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _10ArrayList {
	public static void main(String[] args) {
		//before java 5
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);
		
		//after java 5
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();
		List<String> list6 = new ArrayList<>();
		// ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE

		ArrayList<Integer> list11 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
		System.out.println(list11);
		list11.add(7);
		System.out.println(list11);
		
		list1.add(1);
		list1.add("Ali");
		System.out.println(list1);
	}
}
