package string;

public class StringMethods {

	public static void main(String[] args) {
		// charAt()					char		Returns the character at the specified index (position)
		String myStr = "Hello";
		char result = myStr.charAt(0);
		System.out.println("Method charAt() char: "+result);
		
		System.out.println();
		
		// codePointAt()			int			Returns the Unicode of the character at the specified index
		String myStr2 = "Hello";
		int result2 = myStr2.codePointAt(0);
		System.out.println("Method codePointAt() int: "+result2);
		
		System.out.println();
		
		// codePointBefore()		int			Returns the Unicode of the character before the specified index
		String myStr3 = "Hello";
		int result3 = myStr3.codePointBefore(5);
		System.out.println("Method codePointBefore() int: "+result3);
		
		System.out.println();
		
		// codePointCount()			int			Returns the number of Unicode values found in a string
		String myStr4 = "Hello";
		int result4 = myStr4.codePointCount(0, 5); //endIndex, representing the index after the last character in the string
		System.out.println("Method codePointCount() int: "+result4);
		
		System.out.println();
		
		// compareTo()				int			Compares two strings lexicographically (leksine tvarka, abeseles tvarka)
		System.out.println("Method compareTo() int: "+ myStr3.compareTo(myStr4)); // Returns 0 because they are equal
		
		System.out.println();
		
		// compareToIgnoreCase() 	int			Compares two strings lexicographically, ignoring case differences
		String myStr5 = "hello";
		System.out.println("Method compareToIgnoreCase() int: "+myStr4.compareToIgnoreCase(myStr5));
		
		System.out.println();
		
		// concat()					String		Appends a string to the end of another string
		System.out.println(myStr4.concat(myStr5));
		
		System.out.println();
		
		// contains() 				boolean		Checks whether a string contains a sequence of characters
		System.out.println("Method contains() boolean: "+ myStr5.contains("el"));
		System.out.println("Method contains() boolean: "+ myStr5.contains("Hi"));
		
		System.out.println();
		
		// contentEquals()			boolean		Checks whether a string contains the exact same sequence of 
		//										characters of the specified CharSequence or StringBuffer
		System.out.println("Method contentEquals() boolean: "+ myStr5.contentEquals("hello"));
		System.out.println("Method contentEquals() boolean: "+ myStr5.contentEquals("Hello"));
		System.out.println("Method contentEquals() boolean: "+ myStr5.contentEquals("ell"));
		
		System.out.println();
		
		// copyValueOf()			String		Returns a String that represents the characters of the character array
		

	}

}
