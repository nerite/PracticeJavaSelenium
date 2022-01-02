package string;

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

	}

}
