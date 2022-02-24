package assignment4;

//int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

// get the length of the array

// declare an int variable named count

// iterate from 0 to the array length-1 (outer loop starts here)

// assign 0 to count 

// iterate from i to the length of the array by adding 1 to it (inner loop starts here)

// compare both the loop variables & check they're equal

// increase the count if both the arrays are equal

// Out of the inner loop, check and print the first array variable if count is more than 0

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] givenArray = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		int lengthOfTheGivenArray = givenArray.length;
		
		System.out.println("length Of The GivenArray:" + lengthOfTheGivenArray);

		for (int count = 0; count < givenArray.length - 1; count++) {

			for (int i = count + 1; i < givenArray.length; i++) {

				if (givenArray[count] == givenArray[i])

				{

					System.out.println("Duplicate Elements in the  Given Array:" + givenArray[count]);
					break;

				}

			}

		}

	}

}
