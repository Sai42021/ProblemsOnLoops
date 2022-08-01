package ProblemsOnLoops;

import java.util.Scanner;

public class HCFofTwoNums {
//Write a program to calculate HCF of two given number.
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNum = In.nextInt();
		System.out.println("Enter second number: ");
		int secondNum = In.nextInt();
		In.close();
		int HCF = 0;
		for(int i =1; i<=firstNum; i++) {
			if(firstNum % i == 0)
			for(int j = 1; j<=secondNum; j++) {
				if(secondNum % j == 0) {
				}if(i == j) {
					if(firstNum % i == 0 && secondNum % j ==0 )
						if(i == j) {
							HCF = i;
						}

				}
				
			}
	
		}
		System.out.println("Highest common factor: " + HCF);
		
	}

}
