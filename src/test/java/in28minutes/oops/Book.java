package in28minutes.oops;

public class Book {
	
	Book(int noOfCopies){
		this.noOfCopies = noOfCopies;
	}
	
	private int noOfCopies;
	
	void setNoOFCopies(int noOfCopies) {
		if(noOfCopies > 0)
		this.noOfCopies = noOfCopies;
	}
	
	public void increaseNoOFCopies(int noOfCopies) {
		setNoOFCopies(this.noOfCopies + noOfCopies);
	}
	
	public void decreaseNoOFCopies(int noOfCopies) {
		setNoOFCopies(this.noOfCopies - noOfCopies);
	}

}
