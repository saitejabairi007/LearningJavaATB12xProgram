package EX04_Java_Operators;

public class Lab032_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Sai";
        String last_name = "teja";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b); // saiteja1010
        System.out.println(a + b + first_name + last_name); //1010saiteja

        System.out.println(first_name + last_name + (a + b)); // saiteja20(bodmas)

        // BODMAS - Bracket of Div, mul, add, sub
    }
}
