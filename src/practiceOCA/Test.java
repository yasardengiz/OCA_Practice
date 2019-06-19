package practiceOCA;
 //19 --Ask for help
/*any runtime exceptions are considered as unchecked exceptions therefore JVM cannot check it and no need to handle them immideitly,  and it won't cause compiler error .
any exceptions that are not runtime are considered as checked exceptions which JVM can check it and gives error and needs to be handled immideitly .
Exception contains two types:  checked(compile time)  and unchecked(runtime).
When you use throws Exception  means the method might throw both checked and unchecked exception. so which means checked exception can also be thrown. so therefore when u call the method it will give error at same time*/
//that's why you will get error at line n3
public class Test {
	void readCard(int cardNo) throws Exception {
		System.out.println("Reading card");
	}

	void checkCard(int cardNo) throws RunTimeException { // line n1
		System.out.println("Checking card");
	}

	public static void main(String[] args) {
		Test ex = new Test();
		int cardNo = 12344;
		ex.checkCard(cardNo); // line n2
		ex.readCard(cardNo); // line n3
	}
}
