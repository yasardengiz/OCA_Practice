package practiceOCA;

public class number20 {
	public static void main(String[] args) {
		int x = 5;
		while (isAvailable(x)) {
			System.out.println(x); 
			x--;//need to be inserted
		}
	}

	public static boolean isAvailable(int x) {
		return x-- > 0 ? true : false; //   x-- greater than 0 ?true : false; 
	}
}
