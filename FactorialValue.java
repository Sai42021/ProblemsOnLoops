package ProblemsOnLoops;

import java.util.Scanner;

public class FactorialValue {
//Write a program to find the factorial value of any number entered through the keyboard
	
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = In.nextInt();
		In.close();
		int factorial = 1;
		for(int i = 1; i<=num; i++) {
			factorial *= i;
		}
		System.out.println("Factorial value of " + num + " = " + factorial);
	}

}
