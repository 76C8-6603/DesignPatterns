package facade;

public class Facade {
    private SubSystemA subA;
    private SubSystemB subB;

    public Facade(){
        subA = new SubSystemA();
        subB = new SubSystemB();
    }

    public void facadeMethodA(){
        subA.methodA();
    }

    public void facadeMethodB(){
        subB.methodB();
    }
}
