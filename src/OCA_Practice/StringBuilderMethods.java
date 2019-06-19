package OCA_Practice;

public class StringBuilderMethods {

	public static void main(String[] args) {
		
		//charAt(), indexOf(), length(), and substring()
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		
		System.out.println(sub + " " + len + " " + ch);

		//append()
		StringBuilder sb1 = new StringBuilder().append(1).append('c');
		sb1.append("-").append(true);
		System.out.println("append example: "+sb1); // 1c-true
		
		//insert() method adds characters to the StringBuilder at the requested index 
		StringBuilder sb2 = new StringBuilder("animals");
		sb2.insert(7, "-"); // sb = animals-
			System.out.println("after 1st insert : "+sb2);
		sb2.insert(0, "-"); // sb = -animals-
			System.out.println("after 2nd insert : "+sb2);
		sb2.insert(4, "-"); // sb = -ani-mals
			System.out.println("after 3rd insert : "+sb2);
			
		//delete()--- removes characters from the sequence
		//deleteCharAt()---	delete only one character
		StringBuilder sb3 = new StringBuilder("abcdef");
		sb3.delete(1, 3); // sb = adef
		System.out.println("delete() :"+sb3);
		sb3.deleteCharAt(2);
		//sb3.deleteCharAt(5); // throws an exception	
		System.out.println("deleteCharAt() : "+sb3);
		
		//reverse() --it reverses the characters in the sequences 
				
		StringBuilder sb4 = new StringBuilder("ABC");
		sb4.reverse();
		System.out.println("reverse() : "+sb4);
		
	}

	
}
