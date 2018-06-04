package Observer;

import java.lang.reflect.InvocationTargetException;

public class ObserverMain {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ConcreteSubject cs = new ConcreteSubject();
        ConcreteObserverA oa = new ConcreteObserverA("A",cs);
        ConcreteObserverB ob = new ConcreteObserverB("B",cs);
        cs.eventListen(oa,"updateA");
        cs.eventListen(ob,"updateB");
        cs.setSubjectState("wake up");
        cs.notifyObservers();
    }
}