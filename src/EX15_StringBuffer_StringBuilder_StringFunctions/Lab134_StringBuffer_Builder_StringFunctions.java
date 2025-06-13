package EX15_StringBuffer_StringBuilder_StringFunctions;

public class Lab134_StringBuffer_Builder_StringFunctions {
    public static void main(String[] args) {

        // String - 90%
        String s0 = "sai";
        String s1 = new String("sai");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("sai");
        StringBuilder stringBuilder = new StringBuilder("sai");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());


    }
}
