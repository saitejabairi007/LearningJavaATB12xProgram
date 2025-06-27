package EX19_OOPS_Part2.AccessModifiers.Thief;

import EX19_OOPS_Part2.AccessModifiers.Police.Cop;

public class Donga {
    public static void main(String[] args) {
        Cop c=new Cop(10);
       // c.canIShoot(); protected
      //System.out.println(c.gun); protected
    }
}
