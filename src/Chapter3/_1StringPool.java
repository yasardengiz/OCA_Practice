package Chapter3;

public class _1StringPool {

	public static void main(String[] args) {
		String s1="OCA";
		String s2="OCA";
		
		String str=new String("OCA");
		str.toLowerCase();
		System.out.println(str);
		
		String str1=new String(s1);
		String str2=str;
	
		System.out.println(s1==s2); //true
		System.out.println(str==s1);//false
		System.out.println(str==str1);//false
		System.out.println(str==str2);//true
		System.out.println(str1==s1);//false
		
		System.out.println("equals()***************");
		System.out.println(s1.equals(s2));// true
		System.out.println(str.equals(s1));//
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println(str1.equals(s1));
		

	}

}
