package ProblemsOnLoops;

import java.util.Scanner;

//Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use java built in method)
public abstract class ToThePower {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int numToBeRaised = In.nextInt();
		System.out.println("Enter the power: ");
		int powerOf = In.nextInt();
		In.close();
		int ans = 1;
		for(int i = 0; i<powerOf; i++) {
			 ans = ans * numToBeRaised;
		}System.out.println("Answer = " + ans);
	}

}
