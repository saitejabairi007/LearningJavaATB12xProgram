package EX16_Arrays;

public class Lab149_2DArrays {
    public static void main(String[] args) {
        // 1 2 3
        // 4 5 6
        // 7 8 9

        int [] [] array_2d={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };//3*3

        int[] [] array_2dd= new int [][]{{1,3},{4,6},{7,9}};

        //1,3
        //4,6
        //7,9  3*2
        int[][] array_2ddd = new int[3][3];
        array_2d[0][0] = 1;
        array_2d[0][1] = 2;
        array_2d[0][2] = 3;
//        array_2d[0][3] = 92;

        array_2d[1][0] = 1;
        array_2d[1][1] = 3;
        array_2d[1][2] = 5;

        array_2d[2][0] = 2;
        array_2d[2][1] = 4;
        array_2d[2][2] = 6;

    }
}
