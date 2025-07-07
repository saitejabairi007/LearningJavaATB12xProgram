package EX20_SuperAbstraction;

public class Lab189 {
    public static void main(String[] args) {
        sai d = new Teja(); // Dynamic Dispatch will Interface
        Teja d1 = new Teja(); // Dynamic Dispatch will Interface
        d.display();
        System.out.println(d.a);
    }
}

class Teja implements sai{


    @Override
    public void display() {
        System.out.println(a);
    }
}
interface sai{
    int a = 10;
    void display();
}
