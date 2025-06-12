package EX09_Switch;

import java.util.Scanner;

public class Lab076_Switch_Real_Automation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        browser=browser.toLowerCase();//CHROMe CHROME, CHrome,CHROme==chrome

            switch (browser){
                case "chrome" :
                 //   Webdriver driver = new firefox();
                    System.out.println("Opening chrome");
                    System.out.println(".....");
                    System.out.println("Starting Tc1");
                    System.out.println("Starting Tc2");

                    break;

            case "firefox":
                System.out.println("Opening the chrome");
                System.out.println(".....");
                System.out.println("Starting Tc1");
                System.out.println("Starting Tc2");
                    break;
                    default:
                    System.out.println("Enter the correct browser");

            }
        }


}
