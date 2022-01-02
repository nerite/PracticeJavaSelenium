package string;

public class StringDuplicates {

	public static void main(String[] args) {
		
		// How to remove duplicates from string in java?
		// way 01
		String str = "How to remove duplicates from string in java?";
		String output = "";
		
		for(int i=0; i<str.length(); i++) {
			if(!output.contains("" + str.charAt(i))) {
				output += "" + str.charAt(i);
			}
		}
		System.out.println("Given string is: " + str);
		System.out.println("String with removed duplicates: " + output);
		System.out.println();
		
		//way 02
		String str2 = "How to remove duplicates from string in java?";
		String output2 = "";
				
		for(int i=0; i<str2.length(); i++) {
				if(!output2.contains(String.valueOf(str2.charAt(i)))) {
					output2 = output2 + String.valueOf(str2.charAt(i));
				}	
		}
		System.out.println("Given sting: " + str2);
		System.out.println("String with removed duplicates: " + output2);
		System.out.println();

	}

}
