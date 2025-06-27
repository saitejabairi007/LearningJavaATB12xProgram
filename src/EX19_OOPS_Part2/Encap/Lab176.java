package EX19_OOPS_Part2.Encap;

public class Lab176 {
    public static void main(String[] args) {
        VwoLogin v=new VwoLogin("sai","123");
        System.out.println(v.Username);
        System.out.println(v.Password);
        GoodVwoLogin v1=new GoodVwoLogin("saiTeja","143");
        System.out.println(v1.getPassword());
         v1.setPasword("981673",true);
        System.out.println(v1.getPassword());
        v1.setUsername("Bairi",false);
        System.out.println(v1.getUsername());

    }

}
    class VwoLogin{

    public String Username;
    public String Password;
     public VwoLogin(String Username, String Password){
         this.Username=Username;
         this.Password=Password;

     }

    }
class GoodVwoLogin {

    private String Username;
    private String Password;

    public GoodVwoLogin(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;

    }

    public String getPassword() {
        return Password;
    }

    public void setPasword(String Password, boolean IsAdmin) {

        if(IsAdmin) {
            this.Password = Password;
        }else {
            System.out.println("Not allowed Set the password, Not a admin!");
        }
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Password, boolean IsAdmin) {

        if(IsAdmin) {
            this.Username = Username;
        }else {
            System.out.println("Not allowed Set the username, Not a admin!");
        }
    }

}
