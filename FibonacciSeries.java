package assignment1;

public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */
	// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in
	// the series;

	// Print first number;

	// Iterate from 1 to the range

	// add first and second number assign to sum;

	// Assign second number to the first number;

	// Assign sum to the second number;

	// print sum;

	public static void main(String[] args) {

		int range = 10;
		int firstNumber = 0;
		int secondNumber = 1;
		int sumInTheSeries = 0;

		System.out.println(firstNumber);
		System.out.println(secondNumber);

		for (int i = 1; i <= range; i++) {

			sumInTheSeries = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sumInTheSeries;

			System.out.println(sumInTheSeries);

		}

	}

}
