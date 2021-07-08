package dayTwo.dayOne;

public class TestFactorial {

	public static void main(String[] args) {
		brokenFactorial(5);
		
		
		

	}
	// n! => 5 * 4 ? 5! = 5 * 4 * 3 * 2 * 1
	
	/*
	 * method accepts integer as input value
	 * factorial for n is n * factorial (n-1)
	 * if n in input argument factorial from 1 is 1
	 */
	
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}else {
			return n * factorial(n - 1);
			
		}
		
	}
	
	public static int brokenFactorial(int n) {
		return brokenFactorial(n);
		
	}

}
