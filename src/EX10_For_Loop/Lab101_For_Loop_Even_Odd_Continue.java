package EX10_For_Loop;

public class Lab101_For_Loop_Even_Odd_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if(i%2==0){
                continue;
            }
            System.out.println("odd-->"+i);

        }
    }
}
