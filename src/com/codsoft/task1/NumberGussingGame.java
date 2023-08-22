package com.codsoft.task1;
/*
 	Created on :22-10-2023
 	@author :JanhaviBhambare
 */


import java.util.Random;
import java.util.Scanner;

public class NumberGussingGame {

	public static void main(String[] args) {
		
		System.out.println("~~~~~WELCOME~~~~~~\nGuess the right number to win\nALL THE BEST\n");
		
		
		char x;
		do {
		Random random = new Random();
		int randomNumber =random.nextInt(100)+1;
		
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("Guess your Number(0-100): ");
				
		while(count<5) {
				
			int guess = sc.nextInt();
			count++;
		
			if(guess == randomNumber) {
				System.out.println("YOU WIN");
				System.out.println("Total Guess:"+count);				
				break;
			}
			else if(guess > randomNumber && count<5) {
				System.out.println("Sorry !!! Try little lower\n"+ (5-count) +" guesses remain");
				System.out.println("\nGuess Again: ");							
			}
			else if(guess < randomNumber && count<5) {
				System.out.println("Sorry !!! Try little higher\n"+ (5-count) +" guesses remain");
				System.out.println("\nGuess Again: ");			
			}
			else {
				
					System.out.println("\nSorry you lose!!");
				
			}
		
		}
		System.out.println("\nTHANK YOU FOR PLAYING !!!\nDo you want to play again?(y/n)");
		x=sc.next().charAt(0);
		
		}while(x=='y');
		
		System.out.println("HOPE YOU ENJOYED!!");
	}
}
