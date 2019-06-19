package OCA_Practice;

import java.util.Arrays;

public class ConcatNull {
	public static void main(String[] args) {

		String[] strs = new String[3];

		int idx = 0;

		for (String s : strs) {

			strs[idx].concat(" element " + idx);//will compile but because of ---> null.concat --runtime error

			idx++;

		}

		System.out.println(Arrays.toString(strs));

	}

}
