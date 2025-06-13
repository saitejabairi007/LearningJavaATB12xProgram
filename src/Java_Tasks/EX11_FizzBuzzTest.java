package Java_Tasks;

import java.util.Scanner;

public class EX11_FizzBuzzTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number between 1-100");
        int n = scanner.nextInt();

        if (n < 1 || n > 100) {
            System.out.println("Invalid input. Please enter a number between 1 and 100.");
        }
        if(n%3==0){
            System.out.println("Fizz");
        }
        else if(n%5==0){
            System.out.println("Buzz");

        }
        else if(n%5==0 && n%3==0){
            System.out.println("FizzBuzz");

        }
        else{
            System.out.println("Not a Fizz Buzz");
        }



    }
}
