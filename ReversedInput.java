package ProblemsOnLoops;

import java.util.Scanner;

public class ReversedInput {
//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
	
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		String integer = In.next();
		In.close();
		char[] IntArray = integer.toCharArray();
		int LastPos = integer.length() -1;
		int index;
		for(int i = 0; i<integer.length(); i++) {
			index = LastPos -i;
			System.out.print(IntArray[index]);
		}
		
	}

}
