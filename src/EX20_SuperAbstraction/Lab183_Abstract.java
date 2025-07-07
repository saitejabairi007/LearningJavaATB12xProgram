package EX20_SuperAbstraction;

public class Lab183_Abstract {
    public static void main(String[] args) {
        son s=new son();
        s.loan();
    }
}

abstract class Father{
    abstract void loan();
}

class son extends Father{


   void loan(){
       System.out.println("son will pay the loan");
    }
}