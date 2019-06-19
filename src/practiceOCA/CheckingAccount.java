package practiceOCA;

public class CheckingAccount {
	public int amount;

	public CheckingAccount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void changeAmount(int x) {
		amount += x;
	}
	
	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount((int) (Math.random() * 100));
		//acct.changeAmount(-acct.getAmount());
		System.out.println(acct.getAmount());
		/*
	    A. this.amount= 0; //compiler error
		B. amount = 0; //compiler error
		C. acct(0);//compiler error
		D. acct.amount = 0; // 0
		E. acct.getAmount() = 0; //exception
		F. acct.getAmount(0); //exception
		G. acct.changeAmount(-acct.amount);
		H. acct.changeAmount(-acct.getAmount());
		*/
	}

}

//And given the following main method, located in another class:

//Which three lines, when inserted independently at line n1,
//cause the program to print a 0 balance?