package Observer;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class EventHandler {
    List<Event> eventList;

    public EventHandler() {
        this.eventList = new ArrayList<Event>();
    }

    public void eventListen(Object object,String methodName,Object...params){
        this.eventList.add(new Event(object,methodName,params));
    }

    public void notifyOb() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        for(Event event:eventList){
            event.invoke();
        }
    }
}
