public class Walker {

	private int distance;
	private int defaultDuration = 10;

	//Constructor
	public Walker() {
		distance = 0;
	}

	//methods to interact
	public void changeDefault(int newDefault) {
		defaultDuration = newDefault;
	}

	public void walk(int velocity, int duration) {
		distance = distance + velocity*duration;
	}

	public void walk(int velocity) {
		distance = distance + velocity*defaultDuration;  
	}

	public int getDistanceCovered() {
		return distance;
	}

}