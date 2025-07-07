package EX20_SuperAbstraction;

public class Lab184_AC {
    public static void main(String[] args) {
        breeza v=new breeza();
        v.drive();
    }

}

class breeza extends Engine implements Tyre,gear{
    void drive(){
        tyrematerial();
        TyreColour();
        start();
        shiftgear();
        stopEngine();

    }
    public void start(){
        System.out.println("Engine started");
    }

    @Override
    public void AirinTyre() {
        System.out.println("air is full");
    }

    @Override
    public void shiftgear() {
        System.out.println("2nd gear");
    }

    @Override
    public void TyreColour() {
        System.out.println("black");
    }
}

abstract class Engine{

    abstract void start();

    void stopEngine() {
        System.out.println("Stop engine");
    }

        }
        abstract
interface Tyre{
    void TyreColour();//interface has incomplete class but can use deafult for comcrete or complete class
    void AirinTyre();
    default void tyrematerial(){
        System.out.println("rubber");
    }

        }
interface gear{
    void shiftgear();
}