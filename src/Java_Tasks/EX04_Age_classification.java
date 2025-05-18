package Java_Tasks;

//import java.util.Scanner;

public class EX04_Age_classification {
    public static void main(String[] args) {

 //    int age = Integer.parseInt(args[0]);  //cml
//        System.out.println("Enter your age");
//        Scanner scanner = new Scanner(System.in); //scanner
//        int age = scanner.nextInt();
        int age = 12;



        String result = age<18?"Minor":(age<65)?"adult":"Senior" ;
        System.out.println(result);


    }
}
