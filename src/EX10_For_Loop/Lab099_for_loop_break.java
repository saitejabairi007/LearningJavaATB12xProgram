package EX10_For_Loop;

public class Lab099_for_loop_break {
    public static void main(String[] args) {
        for (int i = 0; i <50 ; i++) {
            System.out.println(i);//012345
            if(i==5){
                System.out.println(i);//5
                break;
            }
            System.out.println(i);//01234


        }
    }
}
