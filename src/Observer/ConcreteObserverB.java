package Observer;

public class ConcreteObserverB {
    private String name;
    private ConcreteSubject cs;
    private String observerState;
    public ConcreteObserverB(String name, ConcreteSubject cs){
        this.name = name;
        this.cs = cs;
    }

    public void updateB() {
        observerState = cs.getSubjectState();
        System.out.println("通知" + this.name + "信息:" + observerState);
    }
}
