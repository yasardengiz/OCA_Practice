package OCA_Practice;

class MyString {

	String msg;

	public MyString(String str) {

		msg = str;

	}

}

public class Test {

	public static void main(String[] args) {

		System.out.println(new String("Java SE 8"));

		System.out.println(new MyString("Java SE 8"));

	}

}