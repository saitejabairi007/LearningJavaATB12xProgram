package EX19_OOPS_Part2.SuperKeyword;

public class Lab179 {
    public static void main(String[] args) {
        Son s=new Son();
        s.newhome();
    }
}

class Father{
    Father(){
        System.out.println("I am Father");
    }
    int gold=100;

    void home(){
        System.out.println("father has 1bhk");
    }

}
class Son extends Father{
    Son(){
        super();
    }
    String bike="yamaha";

    void bike(){
        System.out.println(bike);
    }
void newhome(){
    super.home();

    System.out.println("son has 2bhk and father home also");
    System.out.println(super.gold);
}

}