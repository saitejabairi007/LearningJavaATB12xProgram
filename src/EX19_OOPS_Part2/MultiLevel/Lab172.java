package EX19_OOPS_Part2.MultiLevel;


public class Lab172 {

    public static void main(String[] args) {
        Son s=new Son();
        Father f=new Father();
        Grandfather g=new Grandfather();
        g.home();
        s.extra();

       // Dynamic Dispatch.
        Father f1 = new Son();
        Grandfather gf1 = new Son();
        Grandfather gf2 = new Father();
       // Son s3 = new Grandfather(); not possible son cannot see gf birth

    }

}

