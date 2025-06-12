package EX09_Switch;

import java.util.Scanner;

public class Lab074_Switch_Without_Break {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter input btw 1 to 7");
        int day = scanner.nextInt();
        switch (day){
            case 1 :
                System.out.println("Mon");

            case 2:
                System.out.println("Tues");

            case 3:
                System.out.println("wed");

            case 4:
                System.out.println("Thu");

            case 5:
                System.out.println("Fri");

            case 6:
                System.out.println("Sat");

            case 7:
                System.out.println("Sun");

            default:
                System.out.println("Enter input btw 1 to 7");

    }

    }
}
