package Java_Tasks;

import java.util.Scanner;


public class EX09_DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year (YYYY): ");
        int year = scanner.nextInt();

        int days;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> {
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
            }
            default -> {
                System.out.println("Invalid month: " + month);
                return;
            }
        }

        System.out.println("Month " + month + " in year " + year + " has " + days + " days.");
    }

    // Leap year logic extracted to a method for clarity
     static boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
