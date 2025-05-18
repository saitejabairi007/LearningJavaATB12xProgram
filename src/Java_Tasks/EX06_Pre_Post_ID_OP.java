package Java_Tasks;

public class EX06_Pre_Post_ID_OP {
    public static void main(String[] args) {

     //task1
        int x = 11;

        x = x++ + ++x;  //11 + 13


        System.out.println("x=" +x);

       //Task2:
       int a = 11;
        int b = 22 ;

        int c = a + b + a++ + b++ + ++a + ++b; //c = 11 + 22 + 11 + 22 + 13 + 24 = 103
        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);

        //task3

        int i = 1;
        int j = 2;
        int k = 3;
        int m = i-- - j-- - k--;
//        i--  > 1, i=0;
        // j-- > 2, j=1;
        //k-- >3, k=2;


        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
    }
}
