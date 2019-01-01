package codes;

import java.util.Scanner;

public class RandomNumberGame {

	public static void main(String[] args) throws Exception {
			
//****************************************Basic Number Guessing Game****************************************//
		
	/*
		Scanner input = new Scanner(System.in);
		int max = 10, min = 1, data, tries = 3, success = 0;
		
		int number = (int)(Math.random()*(max-min+1) +min);
		
		do
		{	
			System.out.println("Try and guess the number! (You have " + tries + " tries remaining)");
			System.out.print("Please input a number (1-10): ");
			data = input.nextInt();
			
			System.out.println("You entered: " + data);
			
			if (data == number)
			{
				tries = 0;
				success = 1;
			}
			else
			{
				System.out.println("That is incorrect.");
				tries--;
			}
			
		} while (tries > 0);
		
		
		if (success == 1)	// Game is won
			System.out.println("You won!");
		else	// Game is lost
			System.out.println("You lost");
		
		System.out.println("The number is: " + number);
		
	*/
		
//**************************************Advanced Number Guessing Game***************************************//

		
		Scanner input = new Scanner(System.in);
		int max = 1, min = 0, data = 0, response = 0, tries = 3, success = 0, check = 0;
		
		do
		{	//Start game
			
		// Reset Variables
			tries = 3;
			
			do
			{	// Determine range
				try
				{
					System.out.println("Please choose your difficulty:");
					System.out.println("1=easy  2=medium  3=hard  4=custom");
						response = input.nextInt();
				}
				catch (Exception e)
				{
					input.next();
				}
			} while (response < 1 || response > 4);
			
			if (response == 1)	// Default range
			{
				min = 1;
				max = 10;
			}
			
			if (response == 2)	// Medium range
			{
				min = 1;
				max = 30;
			}
			if (response == 3)	// Hard range
			{
				min = 1;
				max = 70;
			}
			if (response == 4)	// Pick a range for the game
			{
				do
				{
					do
					{
						check = 1;
						
						try
						{
							System.out.println("Choose a range");
							System.out.print("Please enter a min: ");
								min = input.nextInt();
							
						}
						catch (Exception e)
						{
							input.next();
							check = 0;
						}
						
					} while (check == 0);
					
					do
					{
						check = 1;
						
						try
						{
							System.out.print("Please enter a max: ");
								max = input.nextInt();
						}
						catch (Exception e)
						{
							input.next();
							check = 0;
						}
					} while (check == 0);
				} while (max < min);
			}
					
			System.out.println("Your range is: " + min + "-" + max);
			
		// Make number
			int number = (int)(Math.random()*(max-min+1) + min);
			
		// Guess number
			do
			{
				do
				{
					System.out.println("Guess the number!");
					System.out.println("Please enter a number between " + min + " and " + max + " (You have " + tries + " tries remaining)");
					
					do
					{
						check = 1;
						
						try
						{
							data = input.nextInt();
						}
						catch (Exception e)
						{
							input.next();
							System.out.println("Invalid input. Try again");
							check = 0;
						}
///TODO: doesn't accept error trap (if char input, it errors)
					} while(check == 0);
						
					if (data < min || data > max)
					{
						System.out.println("Number out of range. Please try again");
					}
					
				} while (data < min || data > max);
					
				if (data == number)
				{
					success = 1;
					tries = 0;
				}
				else
				{
					System.out.println("That is incorrect");
					tries--;
				}
					
			} while (tries > 0);
			
		// Reveal number
			if (success == 1)
				System.out.println("You won!");
			else
				System.out.println("You lost");
			
			System.out.println("The number is: " + number);
			
		// Play again
			System.out.println("Do you wish to play again? (1=yes  0=no)");
				do
				{
					check = 1;
					
					try
					{
						response = input.nextInt();
					}
					catch (Exception e)
					{
						input.next();
						System.out.println("Invalid input. Try again");
						check = 0;
					}
					
				}while (response < 0 || response > 1 || check == 0);
				
				
			if (response == 0)
				System.out.println("Thank you for playing!");
				
				
		} while(response == 1); // End game
		
		
		
	} // End Main

}
