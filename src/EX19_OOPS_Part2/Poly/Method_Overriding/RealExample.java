package EX19_OOPS_Part2.Poly.Method_Overriding;

public class RealExample {
    public static void main(String[] args) {
        Tc_chrome c=new Tc_chrome();
        c.OpenBrowser();
    }
}

class CommonToAll{

   void OpenBrowser(){
        System.out.println("Starting Browser");
    }
}
class Tc_chrome extends CommonToAll{
    @Override
    void OpenBrowser(){
        System.out.println("Starting chrome");
    }

}
