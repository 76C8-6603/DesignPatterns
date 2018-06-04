package Observer;

public class ConcreteObserverA {
    private String name;
    private ConcreteSubject cs;
    private String observerState;
    public ConcreteObserverA(String name, ConcreteSubject cs){
        this.name = name;
        this.cs = cs;
    }

    public void updateA() {
        observerState = cs.getSubjectState();
        System.out.println("通知" + this.name + "信息:" + observerState);
    }
}
