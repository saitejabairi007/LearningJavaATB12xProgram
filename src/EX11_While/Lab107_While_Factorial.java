package EX11_While;

import java.util.Scanner;

public class Lab107_While_Factorial {
    public static void main(String[] args) {

        //Logic building formula
        //data type and inpu
        //rough logic
        //proper logic
        //optimize
        //edge cases
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to factorial program");
        System.out.println("Enter the number, who's factorial u want");

      if(!scanner.hasNextInt()){
            System.out.println("Enter the int, rerun the program ");
        }
      int n = scanner.nextInt();
      int factorial =1;
      if(n<=0){
          System.out.println("Factorial is--> "+ factorial);
      }
      if(n>Integer.MAX_VALUE){
          System.out.println("Int is out of bound");
      }
      int i=1;
      while(i<=n){
          factorial=factorial*i;
          i++;
      }
        System.out.println("factorial is "+ factorial);


    }
}
