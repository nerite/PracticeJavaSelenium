package array;

public class CalcSum {

	public static void main(String[] args) {
		// Write an array of 5 floats and calculate their Sum?
		
		float[] flo = {2.5f, 3.6f, 6.5f, 12.3f, 5.8f};
		float sum = 0;
		for(int i=0; i<flo.length; i++) {
			sum += flo[i];
		}
		System.out.println("Arrays sum is: "+ sum);

	}

}
