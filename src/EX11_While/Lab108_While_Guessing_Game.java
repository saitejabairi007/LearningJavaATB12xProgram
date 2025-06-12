package EX11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab108_While_Guessing_Game {
    public static void main(String[] args) {
        Random random = new Random();
        int NumberToGuess= random.nextInt(100)+1;
        //System.out.println(NumberToGuess);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts=0;
        while(true){

            if (!scanner.hasNextInt()){
                System.out.println("Invalid input, please enter a integer");
                scanner.next();//consume invalid token
                continue;

            }

                guess = scanner.nextInt();

                attempts++;

                if(guess<1 || guess>100){
                    System.out.println("please enter the number between 1 - 100");
                    continue;
                }
                else {

                    if (guess > NumberToGuess) {
                        System.out.println("Too High, Try Again");
                    } else if (guess < NumberToGuess) {
                        System.out.println("Too Low, Try Again");

                    } else {
                        System.out.println("You guessed it right number in " + attempts + " atempts, Congrats!!");
                        break;
                    }
                }





        }
    }
}
