package EX09_Switch;

import java.util.Scanner;

public class Lab073_Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input between 1 to 7");
        int day;
        if(scanner.hasNextInt()){
            day = scanner.nextInt();
            switch (day){
                case 1 :
                    System.out.println("Mon");
                    break;

            case 2:
                    System.out.println("Tues");
                    break;
                case 3:
                    System.out.println("wed");
                    break;
                case 4:
                    System.out.println("Thu");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Enter input btw 1 to 7");

            }
        }
        else{
            System.out.println("you enter wrong input");
        }


        System.out.println("end of program");
    }
}
