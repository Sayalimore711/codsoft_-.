import java.util.Random;
import java.util.Scanner;
public class Task1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random random = new Random();
        int lowerBound= 1;
        int upperBound= 100;
        int numberToGuess= random.nextInt(upperBound = lowerBound + 1);
        int attempts= 0;
        int maxAttempts= 10;
        System.out.println("Welcome to the number Guessing Game!");
        System.out.println("I have selected a number between  "+lowerBound+" and "+upperBound+"  Can you guess it");
        while(attempts < maxAttempts)
        {
            System.out.println("Enter your Guess Number:");
            int UserGuess = sc.nextInt();
            attempts++;

            if(UserGuess == numberToGuess)
            {
                System.out.println("Congratulations! You guessed the correct number in  "+ attempts +"  attempts");
                break;
            }
            else if(UserGuess < numberToGuess)
            {
                System.out.println("try a higher number.");
            }
            else
            {
                System.out.println("try a lower number.");
            }
        }
        if(attempts == maxAttempts)
        {
            System.out.println("Sorry.you reached the maximum number of attempts. The correct number:"+ numberToGuess);
        }
        System.out.println("Thanks for playing!");
    }
}