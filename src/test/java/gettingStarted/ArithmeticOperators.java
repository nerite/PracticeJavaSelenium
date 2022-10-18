package gettingStarted;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int num1 = 20, num2 = 10, result;
		result = num1 + num2;
		System.out.println("num1 + num2 = " + result);
		
		double num7 = 20d, num8 = 10D, resultd;
		resultd = num7 - num8;
		System.out.println("num7 - num8 = " + resultd);
		
		float num3 = 20f, num4 = 10f, resultf;
		resultf = num3 * num4;
		System.out.println("num3 * num4 = " + resultf);
		
		long num5 = 20l, num6 = 8l, resultl;
		resultl = num5 / num6;
		System.out.println("num5 / num6 = " + resultl);
		
		double num9 = 13f, num10 = 10f, results;
		results = num9 / num10;
		System.out.println("double num9 / num10 = " + results);
		
		int num11 = 20, num12 = 8, quotient, remainder; // 20%8=4 -> 20+4=24 -> 24%8=0
		quotient = num11 / num12;
		remainder = num11 % num12;
		System.out.println("\nQuotient = " + quotient);
		System.out.println("Remainder = " + remainder);

	}

}
