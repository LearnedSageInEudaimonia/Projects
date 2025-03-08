package Day02.NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0 ;
        int guess = -1;

        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("Number is between 1 and 100. Try to guess it");

        while(guess != secretNumber){
            System.out.println("Enter your Guess : ");
            guess = read.nextInt();
            attempts++;

            if(guess < secretNumber){
                System.out.println("Too Low! Try Again");
            }
            else if(guess > secretNumber){
                System.out.println("Too High! Try Again");
            }
            else{
                System.out.println(STR."Congrats! you have guessed it in \{attempts}");
            }
        }
    }
}
