package OCA_Practice;

public class StringBuilderPract {

	public static void main(String[] args) {
		//Below is very inefficient
		 String alpha = "";//empty string instantiated
		 for(char current = 'a'; current <= 'z'; current++) //for loop
		 alpha += current;
		 System.out.println(alpha);
		 
		 //StringBuilder is NOT immutable
		 
		 StringBuilder alpha2 = new StringBuilder();
		 for(char current1 = 'a'; current1 <= 'z'; current1++) {
			 alpha2.append(current1); 
			 		 }
		 System.out.println(alpha2);
		 
		 //Check this example about StringBuilder
		 StringBuilder a = new StringBuilder("abc");
		 StringBuilder b = a.append("de");
		 b = b.append("f").append("g");
		 System.out.println("a=" + a);
		 System.out.println("b=" + b);
	}

}
