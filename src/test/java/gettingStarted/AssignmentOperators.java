package gettingStarted;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		int varInt1 = 10, varInt2 = 5;
		System.out.println("varInt1 = " + varInt1);
		System.out.println("varInt2 = " + varInt2);
		
		varInt1 += 1; // varInt1 = varInt1 + 1  and  ++varInt1  and  varInt1++
		System.out.println("\nvarInt1 after an increment: " + varInt1);
		
		varInt2 -= 1; // varInt2 = varInt2 - 1  and  --varInt2  and  varInt2--
		System.out.println("varInt2 after a decrement: " + varInt2);
		
		int a = 10, b = 5, c = 0, d = 0;
		System.out.println("\nInitial values: ");
		System.out.println("a = " + a + "\tb = " + b);
		System.out.println("c = " + c + "\td = " + d);
		
		c = a++;
		d = ++b;
		System.out.println("\nAfter increments: ");
		System.out.println("a = " + a + "\tb = " + b);
		System.out.println("c = " + c + "\td = " + d);
		
		float varFloat1 = 10.5f, varFloat2 = 5.5f;
		System.out.format("varFloat1 = %f \tvarFloat2 = %f", varFloat1, varFloat2);
		
		varFloat1 -= 3.5f;
		varFloat2 += 2.4f;
		System.out.println("\nAfter updates to the floats:");
		System.out.format("varFloat1 = %f \tvarFloat2 = %f", varFloat1, varFloat2);

		long varLong1 = 10l, varLong2 = 5l;
		System.out.format("\nvarLong1 = %d \tvarLong2 = %d", varLong1, varLong2);

		varLong1 *= varLong2;
		System.out.println("\nAfter Multiplication");
		System.out.format("varLong1 = %d \tvarLong2 = %d", varLong1, varLong2);

		double varDouble1 = 20.0, varDouble2 = 8.0;
		System.out.format("\n\nvarDouble1 = %f \tvarDouble2 = %f", varDouble1, varDouble2);

		varDouble1 /= varDouble2;

		System.out.println("\nAfter Division");
		System.out.format("varDouble1 = %.2f \tvarDouble2 = %.2f", varDouble1, varDouble2);

	}

}
