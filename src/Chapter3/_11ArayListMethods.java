package Chapter3;
import java.util.*;
public class _11ArayListMethods {

	public static void main(String[] args) {
		//add()
		//boolean add(E element)
		//void add(int index, E element)
		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add(0, "robin"); // [hawk, robin]
		
		//remove()
		//boolean remove(Object object)
		//E remove(int index)
		List<String> birds1 = new ArrayList<>();
		birds1.add("hawk"); // [hawk]
		birds1.add("hawk"); // [hawk, hawk]
		birds1.add("eagle");
		birds1.add("wolf");
		
		System.out.println(birds1.remove("cardinal")); // prints false
		System.out.println(birds1.remove("hawk")); // prints true
		System.out.println(birds1.remove(2)); // print wolf
				
		//removeAll(list) will remove all same elements
		//we need a list to able to use removeAll
		List<String> rem = new ArrayList<>(Arrays.asList("hawk"));
		birds1.removeAll(rem);
		System.out.println(birds1);

		// set()
		// E set(int index, E newElement)
		// set will update the element
		List<String> birds2 = new ArrayList<>();
		birds2.add("hawk"); // [hawk]
		System.out.println(birds2.size()); // 1
		birds2.set(0, "robin"); // [robin]
		System.out.println(birds2.size()); // 1
		//birds2.set(1, "robin"); // IndexOutOfBoundsException
		
		//isEmpty() and size()
		//boolean isEmpty()
		//int size()
		
		//clear()
		//discard all elements of the ArrayList
		//void clear()
		List<String> birds3 = new ArrayList<>();
		birds3.add("hawk"); // [hawk]
		birds3.add("hawk"); // [hawk, hawk]
		System.out.println(birds3.isEmpty()); // false
		System.out.println(birds3.size()); // 2
		birds3.clear(); // []
		System.out.println(birds3.isEmpty()); // true
		System.out.println(birds3.size()); // 0
		
		//contains()
		//boolean contains(Object object)
		List<String> birds4 = new ArrayList<>();
		birds4.add("hawk"); // [hawk]
		System.out.println(birds4.contains("hawk")); // true
		System.out.println(birds4.contains("robin")); // false
		
		//equals()
		//boolean equals(Object object)
		List<String> one = new ArrayList<>(Arrays.asList("a","b"));
		List<String> two = new ArrayList<>(Arrays.asList("a","b"));
		List<String> three = new ArrayList<>(Arrays.asList("a","c"));
		System.out.println(one.equals(two));//true
		System.out.println(one.equals(three));//false
	}

}
