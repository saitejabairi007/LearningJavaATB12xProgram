package EX09_Switch;

public class Lab083_JDK13 {
    public static void main(String[] args) {
        int a=10;
        switch (a){
            case 2,4,6,10-> System.out.println("All are even numbers");
            case 5,7,11->System.out.println("Odd numbers ");
            default -> System.out.println("no match found");


        }
    }
}
