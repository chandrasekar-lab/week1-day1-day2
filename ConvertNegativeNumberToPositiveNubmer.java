package assignment3;

/*---------------------------------------------------------------
Pseudocode:
-----------
1. Initialize an integer with a negative number
   like, int number = -40;
2. Check if the number is a negative number 
   Hint : any number that is lesser than zero is a negative number
3. If so, convert the number to a positive numer

4. Print as below
        "The number -40 is converted to 40"
 */

public class ConvertNegativeNumberToPositiveNubmer {

	public static void main(String[] args) {

		int givenNegativeNumber = -40;
		int i = -1;
		int convertedPositiveNumber = 0;
		if (givenNegativeNumber < 0) {
			convertedPositiveNumber = givenNegativeNumber * i;

			System.out.println("ConvertedPositiveNumber is:" + convertedPositiveNumber);
		}
	}

}
