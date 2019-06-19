package practiceOCA;

public class number8 {

}

class X {
	public void printFileContent() { // line 2
		/* code goes here */
		throw new IOException(); // line 4
	}
}

public class test {
	public static void main(String[] args) { // line 8
		X xobj = new X();
		xobj.printFileContent();
	}
//line 11
}