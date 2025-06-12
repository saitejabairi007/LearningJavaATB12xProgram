package Java_Tasks;

import java.util.Scanner;

public class EX08_Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact =1;

        if(n==0){
            fact=1;
        }

//        if(n>Integer.MAX_VALUE){
//            System.out.println("can not handle the number>max of int");
//        }

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
