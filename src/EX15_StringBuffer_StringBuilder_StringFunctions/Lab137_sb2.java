package EX15_StringBuffer_StringBuilder_StringFunctions;

public class Lab137_sb2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends text
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
