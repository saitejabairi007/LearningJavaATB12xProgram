package EX16_Arrays;

public class Lab142_Array_Print {
    public static void main(String[] args) {

        int[] marks = {1,2,3,4,5,6};

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]
            );
            System.out.print(" ");

        }
        System.out.println();
        //enhanced loop

        for( int m:marks){
            System.out.print(m+" ");
        }
    }
}
