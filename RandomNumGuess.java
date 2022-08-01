package ProblemsOnLoops;

import java.util.Scanner;

public class RandomNumGuess {
//Write a program that generates a random number and asks the user to guess what the number is. If the user's guess is higher than the random number, than the program should display "Too high, try again." If the user's guess is lower than the random number, the program should display "Too low, try again." The program should use a loop that repeats until the user correctly guesses the random number.
	
	public static void main(String[] args) {
		int min = 0;
		int max = 100;
		//Next we generate a random number between min (0) and max (100)
		int randomNum = (int)Math.floor(Math.random() * (max-min+1) +min);
		
		try (Scanner In = new Scanner(System.in)) {
			int guess = 0;
			while(guess != randomNum) {
				System.out.println("Enter guess: ");
				guess = In.nextInt();
				if(guess > randomNum) {
					System.out.println("Too high, try again");
				}else if(guess < randomNum) {
					System.out.println("Too low, try again");
				}
			}System.out.println(guess + " is correct!");
		}

	}

}
