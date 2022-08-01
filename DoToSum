package ProblemsOnLoops;

import java.util.Scanner;
//Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate.
public class DoToSum {

	public static void main(String[] args) {
		try (Scanner In = new Scanner(System.in)) {
			String retryPrompt = null;
			do {
				System.out.println("Enter first number to be summed: ");
				int firstNum = In.nextInt();
				System.out.println("Enter second number to be summed: ");
				int secondNum = In.nextInt(); 
				int sum = firstNum + secondNum;
				System.out.println( "Sum = " + sum);
				System.out.println("Do you wish to perform the operation agian Y/N?");
				retryPrompt = In.next(); 

			}while(retryPrompt.equalsIgnoreCase("y"));
		}

	}

}
