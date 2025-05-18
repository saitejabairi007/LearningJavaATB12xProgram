package EX04_Java_Operators;

public class Lab037_Interview {
    public static void main(String[] args) {
        int myage = 12;
        boolean b = !(myage > 10 || myage < 5);
        System.out.println(b);

        // A - myage > 10 -> 12 > 10 -> true
        // B -> myage < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false
    }}
