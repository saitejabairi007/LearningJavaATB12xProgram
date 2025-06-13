package EX15_StringBuffer_StringBuilder_StringFunctions;

public class Lab132_ReverseWithoutUsingInbuilt {
    public static void main(String[] args) {

        String name="saiteja";

        //using for loop

        for (int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
        System.out.println();

        //using inbuilt functions

        StringBuffer sb = new StringBuffer("saiteja");

        System.out.println(sb.reverse());
    }
}
