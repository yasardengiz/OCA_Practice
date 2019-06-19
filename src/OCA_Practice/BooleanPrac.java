package OCA_Practice;

public class BooleanPrac {

	public static void main(String[] args) {
		System.out.println("1************");
		Boolean[] bool = new Boolean[2];

		bool[0] = Boolean.valueOf(Boolean.parseBoolean("true"));

		bool[1] = Boolean.valueOf(null); //false
		//bool[1] = null; //-------> null !!!Be careful about it

		System.out.println(bool[0] + "   " + bool[1]);
		
		System.out.println("2************");
		Boolean[] bool1 = new Boolean[2];

		bool1[0] = new Boolean(Boolean.parseBoolean("true"));

		bool1[1] = Boolean.valueOf(null);

		System.out.println(bool1[0] + "   " + bool1[1]);

	}

}
