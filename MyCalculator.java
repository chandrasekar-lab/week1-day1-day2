package assignment2;

public class MyCalculator {

	public static void main(String[] args) {

		Calculator calcualtor = new Calculator();

		int addtion = calcualtor.additionOfThreeNumbers(1, 2, 3);
		int subtraction = calcualtor.subtractionOfTwoNumbes(5, 4);
		double multiplication = calcualtor.multipilcationOfTwoNumbersNum(6, 7);
		float division = calcualtor.divisionMethod(8, 2);

		System.out.println("AdditionOfThreeNUmbers:" + addtion);
		System.out.println("SubtracitonOfTwoNUmbers:" + subtraction);
		System.out.println("MulitiplicationOfTwoNumbers:" + multiplication);
		System.out.println("DivisionMethod:" + division);

	}

}
