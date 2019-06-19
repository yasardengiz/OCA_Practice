package Chapter2;

public class ContinueStatement {

	public static void main(String[] args) {
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b')
					continue ; //if 2=2 or x=b it will skip
					//continue FIRST_CHAR_LOOP;
				System.out.print(" " + a + x);
			}
		} 

	}

}
