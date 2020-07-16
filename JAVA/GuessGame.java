package codewith.com;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		Scanner KeyboardInput = new Scanner(System.in);
	     
		System.out.println("Write once Run anywhere"
				+ "\n HINT : I am a language"
				+ "\n Guess my name!!");
		String secretword = "java";
		String guess = "";
		int guesscount = 0;
		int limit = 2;
		boolean outofguesses = false;
		
		 while (!guess.equals(secretword) && !outofguesses) {
				
