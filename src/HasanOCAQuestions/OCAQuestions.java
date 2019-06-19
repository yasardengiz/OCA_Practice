package HasanOCAQuestions;

public class OCAQuestions {
	/*
	 * 
	 * OCA study Guide 
	 * Whizlabs 
	 * Enthuware-  
	 * Practice questions of each chapter from OCA study guide- 
	 * Quizzes on Canvas posted by Muhtar
	 * 
	 * 
		 1)
		 		Consider the following code

				public class Test {
				
				static int x;
				int y;
				
				public static void main(String[] args) 
				{
					Test t1 = new Test();
					Test t2 = new Test();
					t1.x=3;
					t1.y=4;
					t2.x=5;
					t2.y=6;
					System.out.println(t1.x+":"+t1.y+":"+t2.x+":"+t2.y);		
				} 
			}
			What is the result?
			
			
			
			
		2) Consider the code 

			int i = 10;
			float f = 10.100f;
			double d = 123;
			Which of the following assignments won't compile?

			 d = i , d = f, f = i, i = d, i = f, f = d
			 
			 
			 
		3) Consider the code

					class MyString {
					String msg;
					MyString(String msg){
					this.msg=msg;
					}
					}
					
					
					public class Test{
					public static void main(String [] args){
					
					System.out.println("hello"+new String("java se 8"));
					System.out.println("hello"+new MyString ("java se 8").msg);





			4) Consider the code

			public class Test 
			{
				static int count=0;
				int i =0;
				public void modify()
				{
					while(i<5)
					{
						i++;
						count++;
					}
				}
				public static void main(String[] args) 
				{
					Test t1 = new Test();
					Test t2 = new Test();
					t1.modify();
					t2.modify();
					System.out.println(t1.count+".."+t2.count);
				}
				
			}
			What is the result?
			
			
			
			
			5) Consider the following code

			public class Test  
			{
				int i,j;
				public Test(int i,int j)
				{
					initialize(i,j);
				}
				public void initialize(int i,int j)
				{
					this.i = i*i;
					this.j=j*j;
				}		
				public static void main(String[] args) 
				{
					int i =10, j= 20;
					Test t = new Test(i,j);
					System.out.println(i+"..."+j);
				}
			}
			What is the result?
			
			6) Consider the code

			class Student
			{
				String name;
				public Student(String name)
				{
					this.name=name;
				}
			}
			public class Test 
			{
				public static void main(String[] args) 
				{
					Student[] students = new Student[3];
					students[1]= new Student("Spartan1");
					students[2]= new Student("Spartan2");
					for(Student s : students)
					{
						System.out.println(s.name);
					}
				}
			}
			What is the result?
			
			7) There was a question regarding Java ByteCode
			
			a) It runs every Platform
			b) It runs only on the platform it was compiled
			c) It runs on any Platform that has Compiler
			d) It runs on any Platform that has JRE
			
			8)  Line-- > insert code here 
					x[0]=10;
						x[1]=20;
							System.out.println(x[0]+":"+x[1]);
							
				a) int[] x = new int[2];
				b) int x = new int[2];
				c) int[] x;
					x = {10,20};
			
			9) Which is true about switch?
			
				a) its case label literals can be changed at RunTime
				b) its expression can be evaluated to multiple values 
				c) break statement is not mandatory
				d) It must contain default section
				
			10) 
			
			Given the code fragment:
				String shirts[][] = new String[2][2];
					shirts[0][0] = "red";
					shirts[0][1] = "blue";
					shirts[1][0] = "small";
					shirts[1][1] = "medium";
					Which code fragment prints red: blue: small: medium?
		
		
		12)
				public static void main(String[] args) {
					boolean opt = true; // 5
						switch (opt){
							case true: //7
							System.out.print("True ");
							break; //9
							default:
							System.out.print("*** ");
							}
							System.out.println("Done");
							}
					Which modification enables the code fragment to print True Done?
			
			A) Replace line 5 With String opt = "true"
			Replace line 7 with case "true"
			
			
			
			
			
		13) 	
		public static void main(String[] args) {
		// Given the code fragment
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		int d = (a < b) ? (a < c) ? a : (b < c) ? b : c;
			
			System.out.println(d);
		}
		
		What is the result?
			
			14) There was 5-8 questions about contructors-overloaded contructors-default constructors.They are all mixed up with polymorhism-inheritance
			
			15) 
			
			int[] array = {5,4,3,2,1}; was given and question was to pick the choice which will print all array elements in reverse
			int x = 5;
			
			while(x > 0){
			System.out.print(array[--x] + " ");
			
			}
			
			16) 	
			
			What you should add next line to print Ten to the console
			
			String x = "9", double x = 9, long x = 9, short x = 9, byte x = 9, Integer x = new Integer(9);
			
			switch(x)
			{
				case 9:
					System.out.println("Ten");
				        break;
				case 10:
					System.out.println("Twenty");
				        break;
			}
			
			17)
					public static void main(int [] args){
					System.out.println("int main"+ args[0]);
					}
					public static void main(object [] args){
					System.out.println("object main"+ args[0]);
					}
					public static void main(String [] args){
					System.out.println("String main"+ args[0]);
					}
					
					and commands
					javac.MainTest.java
					java MainTest 1 2 3
					what is the result?
			18)
			
			int n[];
			n= new int[2];
			n[0]=1;
			n[1]=2;
	 
			n = new int[4];
			n[2]=3;
			n[3]=4;
	 
			for(int x : n)
			{
				System.out.print(" "+x);
			}
			
			19)
			
		 ArrayList<Integer> x = new ArrayList();
			
			x.add(1);
			x.add(2);
			x.add(3);
			x.add(null);
			x.remove(2);
			x.remove(null);
			x.add(2,5);
			
			System.out.println(x);
			
			20)
				public static void doSum(Integer x, Integer y) {
						System.out.println("Integer sum is " + (x + y));
					}
				
					public static void doSum(double x, double y) {
						System.out.println("double sum is " + (x + y));
					}
				
					public static void doSum(float x, float y) {
						System.out.println("float sum is " + (x + y));
					}
				
					
				
					public static void main(String[] args) {
						doSum(10, 20);
						doSum(10.0, 20.0);
					}
									What is the result?
			
			21) ......
				THERE WAS A QUESTION ASKING THE DEFAULT VALUES OF THE FOLLOWING;
				
				Character ch;
				double d;
				boolean b;
				
									
									
			
			22)  
					public class App{
						int count;
						
						public static void displayMsg(){
						count++;                 										//line n1
						System.out.println("Welcome " + "Visit Count : " + count); 		// line n2
						}
						
						public static void main(String [] args){
						App.displayMsg ();												//line n3
						App.displayMsg ();												//line n4
						
						}
						
						}
						
						What is the result?
						A) Compilation fails at line n3 and line n4
						
						B) Compilation fails at line n1 and line n2
						
						C) Welcome visit Count:1
						Welcome Visit Count:2
						
						D) Welcome visit Count:1
						Welcome Visit Count:2
			
			21) There were about 5 questions from Exception handling
			22) for - while -array questions in total 10-15 questions
			23) Also Abstraction-Interface-inheritance-polymorphism questions were there 
			
	*/
}
