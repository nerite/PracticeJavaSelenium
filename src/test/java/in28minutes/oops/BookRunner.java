package in28minutes.oops;

public class BookRunner {
	
	public static void main(String[] args) {
		
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(50);
		Book cleanCode = new Book(40);
		
		artOfComputerProgramming.setNoOFCopies(100);
		effectiveJava.setNoOFCopies(150);
		cleanCode.setNoOFCopies(45);
	}

}
