package Chapter3;

import java.util.*;

public class _13ArrayAndList {

	public static void main(String[] args) {
		String[] array = { "hawk", "robin" }; // [hawk, robin]
		//List<String> list = Arrays.asList("hawk", "robin");
		List<String> list = Arrays.asList(array); // returns fixed size list
		System.out.println(list.size()); // 2
		list.set(1, "test"); // [hawk, test]
		array[0] = "new"; // [new, test]
		for (String b : array)
			System.out.print(b + " "); // new test
		
		//will throw exception because of fixed size of array
		//list.remove(1); // throws UnsupportedOperation Exception
		//list.add("test2");// throws UnsupportedOperation Exception
	}

}
