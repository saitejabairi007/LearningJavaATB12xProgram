package EX06_TernaryOperator;

public class Lab056_MaxOfthree {
    public static void main(String[] args) {
        int n1 = 5;
        int n2=6;
        int n3=17;



        //n1>n2 && n1>n3 -->n1
        //n2>n3 && n2>n1 -->n2
        //n3

        int max=(n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        System.out.println(max);
    }
}
