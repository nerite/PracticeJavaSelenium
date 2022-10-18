package in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike volvo = new MotorBike();
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(volvo.getSpeed());
		
		ducati.start();
		honda.start();
		
		ducati.setSpeed(100);
		
		ducati.increaseSpeed(150);
		honda.increaseSpeed(110);
		
		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(120);
		
//		int ducatiSpeed = ducati.getSpeed(); // get ducati speed
//		ducatiSpeed += 100;					// increase it by 100
//		ducati.setSpeed(ducatiSpeed);		// set it to ducati
//		
//		int hondaSpeed = honda.getSpeed();
//		hondaSpeed += 100;
//		honda.setSpeed(hondaSpeed);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		
	}

}
