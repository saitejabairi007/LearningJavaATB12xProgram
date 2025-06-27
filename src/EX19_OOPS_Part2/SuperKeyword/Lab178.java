package EX19_OOPS_Part2.SuperKeyword;

import java.util.TreeMap;

public class Lab178 {
    public static void main(String[] args) {
        Baseclass b = new Baseclass();

        b.openBrowser("edge");
        b.setBrowser("edge",true);
        System.out.println(b.getBrowser());


    }
}

class Baseclass{
    private String browser;

    public void BaseClass(String browser) {
        this.browser = browser;
    }
    public String getBrowser() {
        return browser;
    }
    public void setBrowser(String browser, boolean isAdmin) {
        if(isAdmin){
            this.browser = browser;
        }
        else{
            System.out.println("Change browser Not allowed, Not a Admin");
        }

    }
    void openBrowser() {
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }
    void closeBrowser() {
        System.out.println("Close Browser!!");
    }
}
class tc1 extends Baseclass{

   public void tc1(String browser){

       super.openBrowser();
       super.closeBrowser();

   }
}

