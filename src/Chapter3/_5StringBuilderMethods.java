package Chapter3;

public class _5StringBuilderMethods {

	public static void main(String[] args) {
		/*
		String str=new String("ali");
		String str1="ali";
		StringBuilder a1=new StringBuilder();
		StringBuilder a2=new StringBuilder(str);
		System.out.println(str.equals(a1));
		System.out.println(str.equals(a2));
		*/
		
		//append()
		//it adds the parameter to the StringBuilder and returns a reference to the current StringBuilder
			//StringBuilder append(String str)
		StringBuilder sb = new StringBuilder().append(1).append('c');
		sb.append("-").append(true);
		System.out.println(sb); // 1c-true
				
		//insert()
		// adds characters to the StringBuilder at the requested index and 
		// returns a reference to the current StringBuilder
			//StringBuilder insert(int offset, String str)
		StringBuilder sb1 = new StringBuilder("animals");
		sb1.insert(7, "-"); // sb = animals-
		sb1.insert(0, "-"); // sb = -animals-
		sb1.insert(4, "-"); // sb = -ani-mals
		//sb1.insert(11, "-"); // sb = animals- //Exception
		System.out.println(sb1);
		
		//delete() and deleteCharAt()
			//StringBuilder delete(int start, int end)
			//StringBuilder deleteCharAt(int index)
		StringBuilder sb2 = new StringBuilder("abcdef");
		sb2.delete(1, 3); // sb = adef
		//sb.deleteCharAt(5); // throws an exception
		System.out.println(sb2);
		//sb2.deleteCharAt(5); // throws an exception
	
		
		//reverse()
		//it reverses the characters in the sequences and 
		//returns a reference to the current StringBuilder
			//StringBuilder reverse()
		StringBuilder sb3 = new StringBuilder("ABC");
		sb3.reverse();	
		System.out.println(sb3);
		
		//toString()
		//The last method converts a StringBuilder into a String
		String s = sb.toString();
		System.out.println(s);
	
	}

}
