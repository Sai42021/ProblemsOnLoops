package ProblemsOnLoops;

import java.util.Scanner;

public class LargestSmallest {
//Write a program that enters numbers till the user wants and at the end it should display the largest and smallest entered.
	
	public static void main(String[] args) {
		try (Scanner In = new Scanner(System.in)) {
			String conti = null;
			int largestNum = 0;
			int smallestNum = Integer.MAX_VALUE;
			do {
				System.out.println("Enter number: ");
				int num = In.nextInt();
				int num2 = num;
				if(num2 > largestNum) {
					largestNum = num;
				}if(num < smallestNum) {
					smallestNum = num;
				}
				System.out.println("Continue Y/N?");
				conti = In.next();
			}while(conti.equalsIgnoreCase("y"));
			System.out.println("Largest number: " + largestNum);
			System.out.println("Smallest number: " + smallestNum);
		}
	}

}
