package EX09_Switch;

public class Lab082_JdkAbove13 {
    public static void main(String[] args) {
        int a=10;
        switch (a){
            case 12-> System.out.println("a");
            case 11-> System.out.println("b");//no break required
            default -> System.out.println("c");
        }
    }
}
