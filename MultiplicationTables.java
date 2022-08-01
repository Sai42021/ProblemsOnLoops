package ProblemsOnLoops;

import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String[] args) {//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number
		try (Scanner In = new Scanner(System.in)) {
			System.out.println("Enter a positive integer: ");
			int Integer = In.nextInt();
			if(Integer > 0) {
				for(int i = 1; i <=10; i++) {
					int table = Integer * i;
					System.out.println(Integer + " x " + i + " = " + table);
				}
			}
		}
	}

}
