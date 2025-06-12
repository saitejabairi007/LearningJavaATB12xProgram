package Java_Tasks;

import java.awt.*;
import java.util.Scanner;

public class EX10_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the score in integer between 1-100");
        int score = scanner.nextInt();
        
        if(score<=0 || score>100){
            System.out.println("Enter a valid score between 1 to 100");

        }
        else if(score>=90){
            System.out.println("A");
        } else if (score>=80) {
            System.out.println("B");
        }
        else if (score>=70) {
            System.out.println("C");
        }
        else if (score>=60) {
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
