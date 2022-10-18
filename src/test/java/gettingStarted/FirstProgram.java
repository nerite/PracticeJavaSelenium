package gettingStarted;

public class FirstProgram {
	
	public static int staticVar = 20;
	public static String name = "Smith";

	public static void main(String[] args) {
		
		int varInt = 100;
		String message = "Good morning!";
		int localVar = 10;
		int salary = 5000;
		
		System.out.format(" The message %s has been received", message);
		System.out.format("\n The Integer %d has been received", varInt);
		
		int x = 5, y = 6, z = 50;
		
		System.out.println();
		System.out.println("X value is : " + x);
		System.out.println("Y value is : " + y);
		System.out.println("Z value is : " + z);
		
		System.out.println();
		System.out.println("Static variable value is : " + staticVar);
		System.out.println("Local variable value is : " + localVar);
		
		System.out.println();
		System.out.println(name + " Salary is : " + salary);
		
	}

}
