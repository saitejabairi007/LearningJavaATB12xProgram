package EX19_OOPS_Part2.Poly.Method_Overloading;

public class Lab174_MethodOd {
    public static void main(String[] args) {
        MathOperators m1 = new MathOperators();
        int r = m1.add(3,4);
        System.out.println(r);

        int r1 = m1.add(3,6,5);
        System.out.println(r1);


        double r0 = m1.add(3.34,4.56);
        System.out.println(r1);

    }
}
