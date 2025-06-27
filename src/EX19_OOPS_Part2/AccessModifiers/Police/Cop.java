package EX19_OOPS_Part2.AccessModifiers.Police;

public class Cop {

    private int gun;
    String idcard;
    public Cop(int gun){
        this.gun = gun;
    }
    protected void CanIShoot(){
        System.out.println("Yes you can shoot");
    }

}
