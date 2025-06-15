package EX16_Arrays;

import java.util.Scanner;

public class Lab144_Arrays_UserInput {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size fo an array, e.g: 5");
        int[] marks = new int[scanner.nextInt()];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the index "+ i);
            marks[i]= scanner.nextInt();

        }
        //print array elements
        for(int m:marks){
            System.out.print("elements in the array is:" + m);
        }

    }
}
