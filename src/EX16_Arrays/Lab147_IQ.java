package EX16_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab147_IQ {
    public static void main(String[] args) {
        int n []={99,12,4,5,6};
        Arrays.sort(n);
        System.out.println(n[n.length-1]);//highest
        System.out.println(n[n.length-2]);//second highest
        System.out.println(n[n.length-3]);//third highest

    }
}
