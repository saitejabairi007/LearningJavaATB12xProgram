package EX13_Functions;

public class Lab115_UserDefined {
    public static void main(String[] args) {
        int r1 = sum_of_two_numbers(10,5);
        int r2 = sum_of_two_numbers(12,15);
        System.out.println(r1);
        System.out.println(r2);

    }

    static int sum_of_two_numbers(int first,int second){
        return first+second;
    }

}
