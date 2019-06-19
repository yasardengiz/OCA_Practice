package practiceOCA;

//10  --Match 2
public class number10 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		//capacity=5 -----
		//length=0;
		//string="";
		String s = "";
		if (sb.equals(s)) {  
			System.out.println("Match 1");
		} else if (sb.toString().equals(s.toString())) {
			System.out.println("Match 2"); // right answer
		} else {
			System.out.println("No Match");
		}
	
	}
}

//11  --C  D
/*interface Readable { // interface ---2 abstract method
	public void readBook();
	public void setBookMark();
	}

abstract class book implements Readable { // line n1 ---abstract class--do nor need implement
	public void readBook() {
	}
	//line n2
	}

class EBook extends book{ // line n3
	public void readBook() {
		// line n4
		}
	}*/

//12  Ans--C
/*
public class StringBuild {
	public static void main(String[] args) {
		String ta = "A "; 
		ta = ta.concat("B "); //A_B_
		String tb = "C ";
		ta = ta.concat(tb);//A_B_C_
		ta.replace('C', 'D');//no affect on string --skip 
		ta = ta.concat(tb);//A_B_C_C_
		System.out.println(ta);//A_B_C_C_
	}
}*/

//15 Ans-- A
/*
Which statement best describes ENCAPSULATION?
		A. Encapsulation ensures that classes can be designed so
		that only certain fields and methods of an object
		are accessible from other objects.
		
		B. Encapsulation ensures that classes can be designed so
		that their methods are inheritable.
		
		C. Encapsulation ensures that classes can be designed with
		some fields and methods declared as abstract.
		
		D. Encapsulation ensures that classes can be designed so that
		if a method has an argument Mytype x, any subclass of
		Mytype can be passed to that method.
*/