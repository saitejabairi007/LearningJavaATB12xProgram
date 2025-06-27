package EX19_OOPS_Part2.AccessModifiers.Police;

public class JrCop{

    public static void main(String[] args) {
        Cop jrCop = new Cop(10);
//        System.out.println(jrCop.gun);
        jrCop.CanIShoot();
    }

}
