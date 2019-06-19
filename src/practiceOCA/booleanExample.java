package practiceOCA;

public class booleanExample {
	public static void main(String[] args) 
    { 
        // parsing different Strings 
        boolean b1 = Boolean.parseBoolean("True"); 
        boolean b2 = Boolean.parseBoolean("TruE"); 
        boolean b3 = Boolean.parseBoolean("False"); 
        boolean b4 = Boolean.parseBoolean("FALSE"); 
        boolean b5 = Boolean.parseBoolean("GeeksForGeeks"); 
          
        System.out.println(b1); //true
        System.out.println(b2); //true
        System.out.println(b3); //false
        System.out.println(b4); //false
        System.out.println(b5); //false
          
    } 
}
