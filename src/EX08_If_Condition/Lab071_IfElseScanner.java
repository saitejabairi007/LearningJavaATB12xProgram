package EX08_If_Condition;

import java.util.Scanner;

public class Lab071_IfElseScanner {
    public static void main(String[] args) {
        System.out.println("Enter your age");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age>18){
            System.out.println("You are adult");
        }
        else{
            System.out.println("you are an adult");
        }


    }
}
