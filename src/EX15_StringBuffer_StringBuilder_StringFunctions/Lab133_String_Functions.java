package EX15_StringBuffer_StringBuilder_StringFunctions;

public class Lab133_String_Functions {
    public static void main(String[] args) {
        String name ="saiteja";
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        //System.out.println(name.charAt(12));//exception out of bound

        //2.concat
        System.out.println(name.concat(" Bairi"));
        //3 contains
        System.out.println(name.contains("teja"));
        //4 Equals
        System.out.println(name.equals("saiteja"));
        //5 equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("SAITEJA"));
        //6 indexOf
        System.out.println(name.indexOf("a"));
        //7 length
        System.out.println(name.length());
        //8 replace
        System.out.println(name.replace("sai","Bairi"));
        //9 substring
        System.out.println(name.substring(3));//teja
        System.out.println(name.substring(3,7));
        //10 toLowerCase
        System.out.println(name.toLowerCase());
        //11 toUpperCase
        System.out.println(name.toUpperCase());
        //12 startsWith
        System.out.println(name.startsWith("sai"));
        //13 endsWith
        System.out.println(name.endsWith("teja"));
        //14 trim
        System.out.println(" sai teja bairi ".trim());
        //15 compareTo
        System.out.println(name.compareTo("sai"));//positive if lexicographically is greater

        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);

        String s1 = "Sai";
        String s2 = s1.concat("Teja");
        System.out.println(s2);

    }
}
