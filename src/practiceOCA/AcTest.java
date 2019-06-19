package practiceOCA;

public class AcTest extends Acc{
 public static void main(String[] args) {
	Acc a=new Acc();
	System.out.println(a.s);
	
	Acc b=new AcTest();
	System.out.println(b.s);
	
	AcTest c=new AcTest();
	System.out.println(c.r);
	
}
}
