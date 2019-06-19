package Chapter3;

import java.util.*;

public class PracticeQuestions {

	public static void main(String[] args) {
		List<String> bottles=Arrays.asList("glass","plastic");
		for (int i = 0; i < bottles.size();) {
			System.out.println(bottles.get(i)+",");
			break;
		}
		System.out.println("end");
	}
}
