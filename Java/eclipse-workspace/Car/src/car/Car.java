package car;

public class Car {

	int maxSpeed = 100;
	int minSpeed = 0;
	double weight = 4079;
	boolean isTheCarOn = false;
	char condition = 'A';
	String nameOfCar = "Lucy";
	
	public void printVariables() {
		System.out.println("This is the maxSpeed " + maxSpeed);
		System.out.println(minSpeed);
		System.out.println(weight);
		System.out.println(isTheCarOn);
		System.out.println(condition);
		System.out.println(nameOfCar);
	}
	
//	public void wreckCar() {
//		condition = 'C';
//	}
	
	public void upgradeMinSpeed() {
		minSpeed = maxSpeed;
		maxSpeed = maxSpeed + 1;
	}
	
	public static void main(String[] args) {
//		Car carry = new Car();
		Car familyCar = new Car();
//		carry.printVariables();
		System.out.println("Family's Car");
		familyCar.printVariables();
		
		Car aliceCar = familyCar;
//		familyCar.wreckCar();
		familyCar.upgradeMinSpeed();
		
		System.out.println("Alice's Car");
		aliceCar.printVariables();
		
	}
	
}
