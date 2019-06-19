package practiceOCA;

class Product {
	double price;
}

public class number1 {
	public void updatePrice(Product product, double price) {
		price = price * 2;
		product.price = product.price + price;// 400
		//product.price = price + price;//400
		//price = product.price + price; //Will not change the product price
	}

	public static void main(String[] args) {
		Product prt = new Product();
		prt.price = 200;// this is product price if we do not use updatePrice()
		double newPrice = 100;
		number1 t = new number1();
		t.updatePrice(prt, newPrice);
		System.out.println(prt.price + " : " + newPrice);
	}
}
