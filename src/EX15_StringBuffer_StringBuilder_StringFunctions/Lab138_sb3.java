package EX15_StringBuffer_StringBuilder_StringFunctions;

public class Lab138_sb3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);
//        sb.delete(5,16); // Delete the substring
//        System.out.println(sb);

        sb.replace(0, 4, "C++");
        System.out.println(sb);
        //insert
        System.out.println(sb.insert(4,"-"));

        StringBuffer sb2 = new StringBuffer("Hello");
        sb2.setCharAt(1, 'a');
        System.out.println(sb2); // Output: Hallo
       //replace
        System.out.println(sb2.replace(1,2,"a"));
    }
}
