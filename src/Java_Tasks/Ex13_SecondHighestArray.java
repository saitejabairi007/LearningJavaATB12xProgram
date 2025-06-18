package Java_Tasks;

public class Ex13_SecondHighestArray {
    public static void main(String[] args) {

        int [] n={100,99,97,108};
        int highest=0;
        int secondhighest=0;

        for (int i:n) {
            if(i>highest){
                secondhighest=highest;
                highest=i;
            } else if ( i> secondhighest && i!=highest)
            {
                secondhighest=i;
            }


        }
        System.out.println(secondhighest);
    }
}
