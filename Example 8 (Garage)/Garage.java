public class Garage {
	
	public static void main(String args[]) {
		Car carA, carB, carC, carD, carE;

		carA = new Car();
		carB = new Car("red");
		carC = new Car(3);
		carD = new Car(5, "IOZ2334");

		carA.displayInfo();
		carB.displayInfo();
		carC.displayInfo();
		carD.displayInfo();

		carA.setColor("green");
		carC.setColor("yellow");
		carD.setId("ABC3456");

		carA.displayInfo();
		carB.displayInfo();
		carC.displayInfo();
		carD.displayInfo();

	}

}