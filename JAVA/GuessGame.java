package codewith.com;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		Scanner KeyboardInput = new Scanner(System.in);
	     
		System.out.println("A language which works on the basis of 'Write once Run anywhere'"
				+ "\n Guess my name!!");
		String secretword = "java";
		String guess = "";
		int guesscount = 0;
		int limit = 2;
		boolean outofguesses = false;
		
		 while (!guess.equals(secretword) && !outofguesses) {
				if(guesscount<limit) {
					System.out.println("Enter your guess:");
					guess = KeyboardInput.nextLine();
					guesscount++;
				}else {
					outofguesses = true;
					
				}
		 }
				if(outofguesses) {
					System.out.println("You lose,no more guess available");
				}else {
					System.out.println("You won");
				}
					
				
	}

}

