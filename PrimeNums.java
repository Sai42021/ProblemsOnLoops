package ProblemsOnLoops;

import java.util.Scanner;

public class PrimeNums {
//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter positive integer: ");
		int PosInt = In.nextInt();
		In.close();
		boolean bool = true;
		if(PosInt > 0) {
			for(int i = 2; i<PosInt; i++) {
				if( PosInt % i == 0) {
					bool = false;
					break;
				}
			}
			if(bool && PosInt > 1) {
				System.out.println(PosInt + " is a prime number.");
			}else {
				System.out.println(PosInt + " is not a prime number");
			}
		}else {
			System.out.println(PosInt + " is not a positive integer.");
		}
	}

}
