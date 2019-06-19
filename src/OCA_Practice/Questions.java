package OCA_Practice;

import java.util.ArrayList;

public class Questions {
	public static void main(String[] args) {
		//1
//		 float  flt = 100f;
//
//         float  flt  = 100; 

//         double  y1 =  200;
//              float  flt =  y1;
//
//        int  y2  =  100;
//             float  flt =  y2;
		
		//2
//		ArrayList<int> list=new ArrayList<>(); //compile error because we can not use"int"
//        list.add(10);
//
//        System.out.println(list);
		
		//3
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		int a = 1;
		list1.remove(a);

		System.out.println(list1);
		
		//4
		ArrayList<Integer> list11 = new ArrayList<>();
		list11.add(1);
		list11.add(2);
		list11.add(3);

		Integer a1 = 1;
		list11.remove(a1);

		System.out.println(list11);
		
		//5
		int x = 7;
		if (available(x)) { // Line 1
			System.out.println("Java SE");
		} else {
			System.out.println("Java EE");
		}
		
		//6
		String[][] chs = new String[2][];
		chs[0] = new String[2];
		chs[1] = new String[5];
		int i = 97;

		for (int a2 = 0; a2 < chs.length; a2++) {
			for (int b = 0; b < chs.length; b++) {
				chs[a2][b] = "" + i;
				i++;
			}
		}

		for (int a11 = 0; a11 < chs.length; a11++) {
			for (int b = 0; b < chs[a11].length; b++) {
				System.out.print(chs[a11][b] + " ");
			}
    }
		//7

		int var1 = 200;
		System.out.print(doCalc(var1));
		System.out.print("      " + var1);

		}

	static int doCalc(int var1) {
		var1 = var1 * 2;
		return var1;
	}

	public static boolean available(int x) {
		return x > 1 ? true : false;
		
	}
}
