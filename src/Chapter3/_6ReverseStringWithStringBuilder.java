package Chapter3;

public class _6ReverseStringWithStringBuilder {

	public static void main(String[] args) {
		//reverse str
		String str="abcdefgh";
		StringBuilder reverseString=new StringBuilder(str);
		
		//we can use append() 
		//StringBuilder reverseString=new StringBuilder();
		//reverseString.append(str);
		
		System.out.println(reverseString.reverse());

	}

}
