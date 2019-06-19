package Chapter2;

public class forEach {

	public static void main(String[] args) {
		final String[] names = new String[3];
		names[0] = "Lisa";
		names[1] = "Kevin";
		names[2] = "Roger";
		for(String name : names) {
		System.out.print(name + ", ");
		
		}
		//System.out.println(Arrays.toString(names));
		
		java.util.List<String> values = new java.util.ArrayList<String>();
		values.add("Lisa");
		values.add("Kevin");
		values.add("Roger");
		for(String value : values) {
		System.out.print(value + ", ");
		}
		
		/*String names1 = "Lisa";
		for (String name : names1) { // DOES NOT COMPILE
			System.out.print(name + " ");
		}*/
	
		/*String[] names2 = new String[3];
		for (int name : names2) { // DOES NOT COMPILE
			System.out.print(name + " ");
		}*/
		
		java.util.List<String> names1 = new java.util.ArrayList<String>();
		names1.add("Lisa");
		names1.add("Kevin");
		names1.add("Roger");
		for (int i = 0; i < names1.size(); i++) {
			String name = names1.get(i);
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(name);
		}
		
	}
}
