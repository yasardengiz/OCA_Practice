package OCA_Practice;

import java.util.ArrayList;

public class RemoveArrayList {

	public static void main(String[] args) {
		//#1
		System.out.println("*******list.remove(index) return the number at index");
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		int a = 1;
		System.out.println("Will return the number at index of a :"+list1.remove(a));//return number in index 
		//list1.remove(a); //remove by index if parameter primitive type
				//list1.remove(1)----> will remove number at index 1

		System.out.println(list1);
		
		//#2
		System.out.println("*******list.remove(object) return the true if available, and false is not ");
		ArrayList<Integer> list11 = new ArrayList<>();
		list11.add(1);
		list11.add(2);
		list11.add(3);
		list11.add(1);

		Integer a1 = 1;
		System.out.println("Will return true or false: "+list11.remove(a1));//return true or false
		//list11.remove(a1); //remove the object by value if parameter Wrapper type
							//list11.remove(1)----> will remove number 1 (1st occurred number)

		System.out.println(list11);
		
		//#3
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Cybertek");
		list2.add("Batch 11");

		boolean b = list2.remove("Cybertek");
		System.out.println(b);
		
		//#4
		ArrayList<Integer> list3 = new ArrayList<>();
		Integer a3 = 1; //true false
		System.out.println(list3.remove(a3));

		//#5
		ArrayList<Integer> list5 = new ArrayList<>();
		int a5 = 1; //index
		System.out.println(list5.remove(a5));//IndexOutOfBoundsException
	}

}
