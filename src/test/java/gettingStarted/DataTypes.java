package gettingStarted;

import java.util.Arrays;

public class DataTypes {

	public static void main(String[] args) {
		
		// Primitive data types
		
		boolean isJavaFun = true;
		byte numCredits = 3;			// 8 bits 
		char myGrade = 'A';
		short numCourses = 4;
		int age = 19;
		long tuitionPaid = 23983L;
		float gpa = 3.21f;
		double incomeEarned = 8283.98d;
		
		System.out.println("Is Java Fun to Learn? : " + isJavaFun);
		System.out.println("Number of credits for the course: " + numCredits);
		System.out.println("The student's grade in the course: " + myGrade);
		System.out.println("The number of courses the student has enrolled in: " + numCourses);
		System.out.println("The age of the student: " + age);
		System.out.println("Cumulative tuition paid by the student: " + tuitionPaid);
		System.out.println("The student's GPA: " + gpa);
		System.out.println("Earned income: " + incomeEarned);
		System.out.println();
		
		System.out.println("****************Integers***************\n");
		
		int varInt = 2147483647;
		System.out.println("The int value is: " + varInt);
		
		int newVarInt = 214_748_3647;
		System.out.println("The new int value is: " + newVarInt);
		
		int a = 1_555, b = 1;
		
		System.out.println();
		System.out.format("%d + %d = %d", a, b, a+b);
		System.out.println();
		
		// The int value is: 2147483647
		// The new int value is: 2147483647
		// 1555 + 1 = 1556
		
		System.out.println("****************Floats and Double***************\n");
		
		float varFloat = 10e3f;
		System.out.println("The float value is: " + varFloat);
		
		double varDouble = 10e-4d;
		System.out.println("The double value is: " + varDouble);
		
		// The float value is: 10000.0
		// The double value is: 0.001
		
		System.out.println();
		
		System.out.println("****************Char***************\n");
		
		char letter = 'A';
		System.out.println("Letter is: " + letter);
		
		char unicodeVal = '\u0052';
		System.out.println("The unicode letter is: " + unicodeVal);
		
		// Letter is: A
		// The unicode letter is: R
		
		// Non primitive data
		
		System.out.println();
		
		System.out.println("****************Non primitive data type - String and arrays***************\n");
		
		String name = new String("Fiona");
		System.out.println("The name is: " + name);
		
		String message = "Fiona says \"Hello\" ";
		System.out.println(message);
		
		String newLineMessage = "Fiona says \n Hello ";
		System.out.println(newLineMessage);
		
		String tabMessage = "Fiona \t\t says \nHello";
		System.out.println(tabMessage);
		
		String backspaceMessage = "Fiona\b says Hello";
		System.out.println(backspaceMessage);
		
		String[] carBrands = {"Volvo", "BMV", "Ford", "Mazda", "Opel"};
		System.out.println("Car brands: " + Arrays.toString(carBrands));
		System.out.println("Number of car brands: " + carBrands.length);
		System.out.println(carBrands[0]);
		System.out.println(carBrands[1]);
		System.out.println(carBrands[2]);
		System.out.println(carBrands[3]);
		System.out.println(carBrands[4]);
		carBrands[0] = "Kia";
		System.out.println("Car brands: " + Arrays.toString(carBrands));

	}

}
