public class Car {
	private int seats;
	private String color;
	private String id;

	//constructors
	public Car() {
		seats = 4;
		color="white";
	}

	public Car(String c) {
		seats = 4;
		color = c;
	}

	public Car(int s) {
		seats = s;
		color = "white";
	}

//can we declare this one? --NO
	// public Car(String newId) {
	// 	this();
	// 	id = newId;
	// }

	public Car(int s, String i) {
		this(s); //also test without this
		id = i;
	}


	//getters-setters methods
	public int getSeats() {
		return seats;
	}

	public String getColor() {
		return color;
	}

	public String getId() {
		return id;
	}

	public void setColor(String newColor) {
		color = newColor;
	}

	public void setSeats(int newSeats) {
		seats = newSeats;
	}

	public void setId(String newId) {
		id = newId;
	}

	//other interaction methods
	public void displayInfo() {
		//System.out.println(this.toString());  //inherided method
		//System.out.print("Καθίσματα " + seats + "\t");
		//System.out.print("Χρώμα " + color + "\t");
		//System.out.println("Αριθμ. Κυκλοφορίας " + id);
		System.out.println(this.toString());  //overriden method
	}

	//override
	public String toString() {
		return "Καθίσματα " + this.seats + "\t" + 
		"Χρώμα " + this.color + "\t" + "Αριθμ. Κυκλοφορίας " + this.id;
	}
}