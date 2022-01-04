package array;

import java.util.Scanner;

public class ArrayFindInt {

	public static void main(String[] args) {
		// Write a program to find out whether a given integer is present in an array or not?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter intiger to find out if it's in array: ");
		int num = sc.nextInt();
		int[] myNum = {1, 5, 6, 8, 12, 23, 38};
		for(int i=0; i<myNum.length; i++) {
			if(myNum[i]==num) {
				System.out.println("Integer "+num+" is in array");
			}else {
				System.out.println("This integer is not in array");
			}
		}
		
		sc.close();

	}

}
