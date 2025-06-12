package Java_Tasks;

public class EX05_HackerRankProgramTriangle {
    public static void main(String[] args) {
        int n1=2;
        int n2=3;
        int n3=4;

        if(n1+n2>n3 && n2+n3>n1 && n3+n1>n2) {
            if ((n1 == n2) && (n2 == n3) && (n3 == n1)) {
                System.out.println("Acute Angle triangle");
            } else if ((n1 == n2) || (n2 == n3) || (n3 == n1)) {
                System.out.println("Isc triangle");

            } else {
                System.out.println("equ");
            }
        }
        else{
            System.out.println("not a valid triangle");
        }
    }
}
