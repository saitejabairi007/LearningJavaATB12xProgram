package EX20_SuperAbstraction;

public class Lab182_Private {
    public static void main(String[] args) {
        def d = new def();
        int result = d.my_gold;
        System.out.println(d.getName());
        System.out.println(result);
    }
}
class abc{
    private String name="sai";
    protected int my_gold = 10;

    public String getName(){
        return name;
    }
}

class def extends abc{
    void display(){
        System.out.println(super.my_gold);
    }

}
