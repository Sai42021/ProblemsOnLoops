package ProblemsOnLoops;

import java.util.Scanner;

public class IntCount {
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
	
	public static void main(String[] args) {
		try (Scanner In = new Scanner(System.in)) {
			int sumOfPos = 0;
			int sumOfNeg = 0;
			int zeros = 0;
			String Conti;
			do {
				System.out.println("Enter number: ");
				int num = In.nextInt();
				System.out.println("Would you like to enter another number Y/N?");
				Conti = In.next();
				if(num > 0) {
					sumOfPos = sumOfPos +1;
				}else if(num == 0) {
					zeros = zeros + 1;
				}else if(num < 0) {
					sumOfNeg = sumOfNeg + 1;
				}
			}while(Conti.equalsIgnoreCase("y"));
			System.out.println("Number of positive numbers: " + sumOfPos);
			System.out.println("Number of zeros: " + zeros);
			System.out.println("Number of negative numbers: " + sumOfNeg);
		}
	}

}
