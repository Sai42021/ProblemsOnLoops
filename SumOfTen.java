package ProblemsOnLoops;

public class SumOfTen {

	public static void main(String[] args) {//Write a program to calculate the sum of first 10 natural numbers
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum = sum + i;
		}
		System.out.println("Sum: " + sum);
	}

}
