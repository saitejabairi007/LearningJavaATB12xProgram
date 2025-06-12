package EX12_Do_While;

public class Lab109_Do_While {
    public static void main(String[] args) {
        int a=1;
        do{
            System.out.println("Body");
            System.out.println(a);
            a++;
        }
       // while(a>10);//executes only 1 time
        while(a<10);//executes only 9 times
    }
}
