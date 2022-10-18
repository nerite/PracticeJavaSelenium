package listArray;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ArrayListListOfObjects {
	public static void main(String[] args) {
		 
        // Declaring ArrayList
        List<Book> listOfBooks =new ArrayList<>();
 
        Book javaInAction = new Book("Java in action", "mary public",
                "Everest publishers", new BigDecimal("600"));
        Book introductionToJava =  new Book("Introduction to Java", "mary public",
                "Heavyweight publishers", new BigDecimal("100"));
        Book advancedDatabases =  new Book("Advanced databases", "charles darwin",
                 "Longhorn publishers", new BigDecimal("600"));
 
        // Adding objects to ArrayList
        listOfBooks.add(javaInAction);
        listOfBooks.add(introductionToJava);
        listOfBooks.add(advancedDatabases);
 
        // Printing the ArrayList
        System.out.println(listOfBooks);
    }

}
