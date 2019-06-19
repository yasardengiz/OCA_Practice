package OCA_Practice;

public class StringMethods {

	public static void main(String[] args) {
		String firstString="animals";
		String secondString="COMPUTER";
		
		//length()----> To find number of characters in the String
		System.out.println("The number of char in String is: "+firstString.length());
		System.out.println("The number of char in String is: "+secondString.length());
		
		//charAt() lets you query the string to find out what character is at a specific index
		System.out.println("The char at certain index of String is: "+firstString.charAt(6));
		System.out.println("The char at certain index of String is: "+secondString.charAt(6));
		
		//indexOf()looks at the characters in the string and finds the first index that matches the desired value.
		System.out.println("The index  of String is: "+firstString.indexOf("ma"));
		System.out.println("The index  of String is: "+firstString.indexOf('m'));
		System.out.println("The index of String is: "+secondString.indexOf('p', 7));
		
		//substring() also looks for characters in a string. It returns parts of the string.
		System.out.println("The substring  of String is: "+firstString.substring(3));
		System.out.println("The substring of String is: "+secondString.substring(2, 8));
		//System.out.println("The substring of String is: "+secondString.substring(2, 9));//StringIndexOutOfBoundsException
		
		//toLowerCase() and toUpperCase()
		System.out.println("The to uppercase  of String is: "+firstString.toUpperCase());
		System.out.println("The to lowercase of String is: "+secondString.toLowerCase());
		
		//equals() and equalsIgnoreCase()
		System.out.println("abc".equals("ABC")); // false
		System.out.println("ABC".equals("ABC")); // true
		System.out.println("abc".equalsIgnoreCase("ABC")); // true
		
		//startsWith() and endsWith()
		System.out.println("abc".startsWith("a")); // true
		System.out.println("abc".startsWith("A")); // false
		System.out.println("abc".endsWith("c")); // true
		System.out.println("abc".endsWith("a")); // false
		
		//The contains() method also looks for matches in the String. 
		System.out.println("abc".contains("b")); // true
		System.out.println("abc".contains("B")); // false
		
		//The replace() method does a simple search and replace on the string. 
		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("abcabc".replace("ab", "AB")); // ABcABc
		
		//The trim() method removes whitespace from the beginning and end of a String.
		System.out.println("abc".trim()); // abc
		System.out.println("\t a b c\n".trim()); // a b c
	}

}
