package EX16_Arrays;

import java.util.Scanner;

public class Lab153_LeftTriangle {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int n =scanner.nextInt();

        for (int i = n; i >=1; i--) {

            for (int j = 1; j <= i ; j++) {
                System.out.print(" * ");


            }
            System.out.println();

        }
    }
}
