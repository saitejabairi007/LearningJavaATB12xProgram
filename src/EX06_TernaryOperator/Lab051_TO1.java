package EX06_TernaryOperator;

public class Lab051_TO1 {
    public static void main(String[] args) {
        //  ? :
        //- result = condition ? expression1 : expression2;
       // datatype of result must be equal to expression value
        int age = 27;
        String canIGoTOGoa =  age > 18 ? "Yes You can" : "You can't";
        System.out.println(canIGoTOGoa);
    }
}
