/*
@authour Nokuthula Thokozani Mbuyisa
@version JavaDevelopment Task 2
*/

import java.util.Scanner;
import java.util.Random;


public class Number_Guessing_Game
{
	public static void main(String[] args)
	{
		
		int attempts = 10;
		int points = 10;
		boolean play = true;
		int round = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("\t~ Welcome to the number guessing Game ~\n");
		System.out.println("Your challenge is to guess the correct number within " +attempts+ " attempts. Each round, I'll tell you if your guess is too high, too low, or just right. Each time you guess the wrong number 2 points will be deducted from your points. Think you have what it takes to find the right number? Let the game begin!\n");
		
		try{
			while(play)
			{
				// Generate random numbers from 1-100
				int range =100;
				Random rand = new Random();
				int randomNumber = rand.nextInt(range);
				
				System.out.println("Round "+round);
				
				for(int i=1; i<=attempts; i++)
				{
					
					
					//Ask user for input
					
					System.out.print("Enter a number between 1 and 100: ");
				
					int guessedNumber = input.nextInt();//Read user input
					
					if (guessedNumber == randomNumber )
					{
						System.out.println("You Guessed the right number!!");
						System.out.println("You got "+points+" points for this round");
						break;
					}
					else
					{
						if(randomNumber > guessedNumber)
						{
							System.out.println("Your guess is too low! Try a higher number.");
						}
						else if(randomNumber < guessedNumber)
						{
							System.out.println("Your guess is too high! Try a lower number.");
						}
						System.out.println("Incorrect Guess,Try again\n");
						if(i==attempts)
						{
							System.out.println("Sorry you were unable to guess the number\n");
						}
						points --;
						
					}
				}
			
				
				System.out.println("Would you like to play again (y/n): ");
				
				char choice = input.next().charAt(0);
				if(choice == 'y' || choice == 'Y')
				{
					round++;
				}
				else if(choice =='n'|| choice =='N')
				{
					System.out.println("Thank you for playing, have a great day!!");
					play =false;
				}
				else
				{
					throw new Exception("Invalid input");
				}
			
			}	
		}
			catch(Exception e)
			{
				System.out.println("Invalid Input!!");
			}
		
		
		
	}
		
	
}

