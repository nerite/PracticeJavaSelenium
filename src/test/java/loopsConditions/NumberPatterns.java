package loopsConditions;

public class NumberPatterns {

	public static void main(String[] args) {
		
		/**
		 *  1
		 *  1 2
		 *  1 2 3
		 *  1 2 3 4
		 *  1 2 3 4 5
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		/**
		 *          1
		 *        1 2
		 *      1 2 3 
		 *    1 2 3 4
		 *  1 2 3 4 5        
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		/**
		 *  5
		 *  4 5
		 *  3 4 5
		 *  2 3 4 5
		 *  1 2 3 4 5
		 */
		
		for(int i=5; i>=1; i--) {
			for(int j=i; j<=5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
				
		
		/**
		 *          5
		 *        4 5
		 *      3 4 5
		 *    2 3 4 5
		 *  1 2 3 4 5        
		 */
		
		for(int i=5; i>=1; i--) {
			for(int j=i-1; j>=1; j--) {
				System.out.print("  ");
			}
			for(int k=i; k<=5; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		/**
		 *  1
		 *  2 2
		 *  3 3 3
		 *  4 4 4 4
		 *  5 5 5 5 5
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		/**
		 *      1
		 *     1 2
		 *    1 2 3
		 *   1 2 3 4
		 *  1 2 3 4 5    
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		/**
		 *  1 2 3 4 5
		 *  1 2 3 4
		 *  1 2 3
		 *  1 2
		 *  1
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();

	}

}
