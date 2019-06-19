package Chapter3;

public class _2StringMethods {

	public static void main(String[] args) {
		//charAt()
		String string = "animals";
		System.out.println(string.charAt(0)); // a
		System.out.println(string.charAt(6)); // s
		//String ch=""+string.charAt(0);
		
		/*throws exception 
		System.out.println(string.charAt(10)); // throws exception
		System.out.println(string.charAt(-1)); // throws exception
		System.out.println(string.charAt('a')); // throws exception
		*/
		
		//indexOf():
		//indexOf() returns	–1 when no match is found
		String string1 = "animals5";
		//				  01234567
		System.out.println(string1.indexOf('a')); // 0
		System.out.println(string1.indexOf("al")); // 4
		System.out.println(string1.indexOf('a', 4)); // 4
		System.out.println(string1.indexOf("al", 5)); // -1
		System.out.println(string1.indexOf("az")); // -1
		System.out.println(string1.indexOf('5'));//7
		System.out.println(string1.indexOf(109));//m-->3 => indexOf(int ch) we use ASCII value of char we looking for
		System.out.println(string1.indexOf(5));//-1
		
		/*substring():
		int substring(int beginIndex)
		int substring(int beginIndex, int endIndex)
		*/
		String str3 = "animals";
				//	   0123456
		System.out.println(str3.substring(3)); // mals
		System.out.println(str3.substring(str3.indexOf('m'))); // mals
		System.out.println(str3.substring(3, 4)); // m
		System.out.println(str3.substring(3, 7)); // mals
		
		System.out.println("I am empty"+string.substring(3, 3)); // empty string
		//System.out.println(str3.substring(3, 9)); // exception
		//System.out.println(string.substring(3, 2)); // throws exception
		
		
		//toLowerCase() and toUpperCase()
		//equals() and equalsIgnoreCase()
			//boolean equals(String str)
			//boolean equalsIgnoreCase(String str)
		
		//startsWith() and endsWith()--->outcomes is true or false
			//boolean startsWith(String prefix)
			//boolean endsWith(String suffix)
		System.out.println("abc".startsWith("a")); // true
		System.out.println("abc".startsWith("A")); // false
		System.out.println("abc".endsWith("c")); // true
		System.out.println("abc".endsWith("a")); // false
		
		//contains()
			//boolean contains(String str)
		System.out.println("abc".contains("b")); // true
		System.out.println("abc".contains("B")); // false	
		
		
		//replace()
			//String replace(char oldChar, char newChar)
			//String replace(CharSequence oldChar, CharSequence newChar)
		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("abcabc".replace("a", "A")); // AbcAbc
		String st="Ali";
		st.replace('A', 'B');//will replace A with B but does  not change st string 
		System.out.println(st);//Ali
		
		//trim()
		//The trim() method removes whitespace from the beginning and end of a String
	}

}
