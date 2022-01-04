package string;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		
	// How to count number of vowels in a string in java?
		
		String str = "How to count number of vowels in a string in java?";
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='i' || str.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("Given string is: " + str);
		System.out.println("The number of vowels in a string is: " + count);
		System.out.println();
		
		// How to count words in a string in java?
		// way 01
		String str1 = "How to count words in a string in java?";
		String[] words = str1.split("\\s+"); // (\\s+) separates the whitespace from the string or in other words it splits the given string around whitespace
		System.out.println(str1);
		System.out.println("Word Count is: " + words.length);
		
		//way 02
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String word = sc.nextLine();
		int cou = 1;
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)==' ' && word.charAt(i+1)!=' ') {
				cou++;
			}
		}
		System.out.println("Number of words in string is: " + cou);
		
		
		sc.close();

	}

}
