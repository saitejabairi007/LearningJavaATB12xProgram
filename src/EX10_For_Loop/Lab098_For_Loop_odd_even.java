package EX10_For_Loop;

public class Lab098_For_Loop_odd_even {
    public static void main(String[] args) {
        for (int i = 0; i <=50; i++) {

            if(i%2==0){
                System.out.println("even:"+i);
            }
            else{
                System.out.println("odd:"+ i);
            }

        }
    }
}
