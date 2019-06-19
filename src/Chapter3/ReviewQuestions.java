package Chapter3;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ReviewQuestions {

	public static void main(String[] args) {
		/*String letters = "abcdef";
		System.out.println(letters.length());
		System.out.println(letters.charAt(3));
		//System.out.println(letters.charAt(6));
*/		
		/*String s="2";
		s+='c';
		s+=false;
		System.out.println(s);*/
		
		/*String a = "";
		a += 2;
		a += 'c';
		a += false;
		if (a == "2cfalse")
			System.out.println("==");
		if (a.equals("2cfalse"))
			System.out.println("equals");*/
		
		/*#19
		int[] java = {2,3,4};
		int[] java1 = {2,3,4};
		System.out.println(java.equals(java1));//false
		
		ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(2,3,4));
		ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(2,3,4));		
		System.out.println(list1.equals(list2));//true
		*/
		
		/*#23
		List<Integer> list = Arrays.asList(10, 4, -1, 5);
		Collections.sort(list);
		Integer array[] = list.toArray(new Integer[4]);
		System.out.println(array[0]);
		*/
		
		/*#24
		String[] names = { "Tom", "Dick", "Harry" };
		List<String> list = names.asList();
		list.set(0, "Sue");
		System.out.println(names[0]);
		*/
		
		/*#26
		List<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5"));
		ages.add(Integer.valueOf("6"));
		ages.add(7);
		ages.add(null);
		for (int age : ages) System.out.print(age);*/
		
		
		/*#29
		LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		date.plusDays(2);
		date.plusHours(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());*/
		
		LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
		System.out.println(date.getYear() + " " + date.getMonth() + " "
		+ date.getDayOfMonth());
		
	}

}
