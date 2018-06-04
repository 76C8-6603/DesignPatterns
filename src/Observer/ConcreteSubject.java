package Observer;

import java.lang.reflect.InvocationTargetException;

public class ConcreteSubject implements Subject {
    private String subjectState;
    private EventHandler eventHandler = new EventHandler();

    public void eventListen(Object object,String methodName,Object...params){
        eventHandler.eventListen(object,methodName,params);
    }

    @Override
    public void notifyObservers() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        eventHandler.notifyOb();
    }

    @Override
    public String getSubjectState() {
        return this.subjectState;
    }

    @Override
    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
