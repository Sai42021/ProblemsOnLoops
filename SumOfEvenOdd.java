package ProblemsOnLoops;

import java.util.Scanner;

public class SumOfEvenOdd {
//Write a program that reads a set of integers, and then prints the sum of the even and odd numbers
	
	public static void main(String[] args) {
		try (Scanner In = new Scanner(System.in)) {
			System.out.println("Enter number of digits you would like to input: ");
			int integers = In.nextInt();
			int numberInput;
			int sumOfEven = 0;
			int sumOfOdd = 0;
			for(int i = 0; i<integers; i++) {
				System.out.println("Enter number: ");
				numberInput = In.nextInt();
				if(numberInput % 2 == 0) {
					sumOfEven += numberInput;
				}else {
					sumOfOdd += numberInput;
				}
			}
			System.out.println("Sum of even numbers: " + sumOfEven);
			System.out.println("Sum of odd numbers: " + sumOfOdd);
		}

	}

}
