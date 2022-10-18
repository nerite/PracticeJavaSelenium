package in28minutes.oops;

public class MotorBike {
	
	// state
	private int speed; // member variable
	
	public MotorBike() {	//default constructor (no argument constructor)
		this(5);	// calling MotorBike(int speed) constructor
	}
	
	public MotorBike(int speed){    // constructor
		this.speed = speed;
	}
	
	// behavior
	// method
	// inputs - int speed
	// outputs - void
	// name - setSpeed
	void setSpeed(int speed) { // local variable
		if(speed > 0) {
			this.speed = speed;
		}
	}
	
	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}
	
	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
	
	int getSpeed() {
		return speed;
	}
	
	void start() {
		System.out.println("Bike Started");
	}

}
