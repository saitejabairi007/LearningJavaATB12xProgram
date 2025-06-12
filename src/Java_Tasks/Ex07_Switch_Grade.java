package Java_Tasks;

import java.util.Scanner;

public class Ex07_Switch_Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Grade");
        String grade = scanner.next();
        grade = grade.toUpperCase();
        switch (grade){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Very good");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Need improvement");
                break;
            case "F":
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid grade");
                break;
        }

    }
}
