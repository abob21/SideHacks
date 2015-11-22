import java.math.*;
import java.util.*;

public class FindPitotheNthDigit {

	public static void main(String[] args) {
		/* Enter a number and have the program generate PI up to that many 
		 * decimal places. Keep a limit to how far the program will go*/

		/*With big decimal, we get PI to aa precicion that includes all the 
		 * digits 0-9*/
		BigDecimal pi0 = new BigDecimal(Math.PI);
		Scanner in = new Scanner(System.in);

		System.out.println("Enter number of decimal places (0-48) needed for PI: ");
		int n = in.nextInt();

		if (n >= 0 & n < 49 ){
			BigDecimal pi1 = pi0.setScale(n, RoundingMode.FLOOR);
			System.out.println("PI to "+n+" decimal places: "+pi1);
		} 
		else {
			System.out.println("Please enter a number less than 48");
		}; 

	}

}



