package practiceOCA;

public class number7 {

}

class Vehicle {
	String type = "4W";
	int maxSpeed = 100;

	Vehicle(String type, int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}

class Car extends Vehicle {
	String trans;

	Car(String trans) { // Line n1 //(compilation error)
		//super() ==>is insert automatically but there is no match for it at super class
		this.trans = trans;
	}

	Car(String type, int maxSpeed, String trans) {
		super(type, maxSpeed);
		this(trans); // Line n2 //(compilation error) super() and this() can not be together
	}
}
/*
	And given the code fragment:
	7.Car c1 = new Car("Auto");
	8.car c2 = new Car("4W", 150,"Manual");
	9. System.out.println(c1.type+" "+c1.maxSpeed+" "+c1.trans);
	10. System.out.println(c2.type+" "+c2.maxSpeed+" "+c2.trans)
*/