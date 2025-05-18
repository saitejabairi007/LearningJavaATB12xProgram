package Java_Tasks;

public class EX02_Even_odd {
    public static void main(String[] args) {
        // Step 1 ->  Input, Output - data type
        int num = 10;
        // input -> int
        // output -> String -> even or odd

        // Step 2 -> write the logic and dry run
        // num%2 == 0 >  even else 1 odd.
        String result = (num%2==0) ? "even" : "odd";
        System.out.println(result);
//optimize
        // Edge Cases
        //  -negative, float.,0
    }
}
