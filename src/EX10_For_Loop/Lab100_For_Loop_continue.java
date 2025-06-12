package EX10_For_Loop;

public class Lab100_For_Loop_continue {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            if(i==5){
                continue;//skips
            }
            System.out.println(i);

        }
    }
}
