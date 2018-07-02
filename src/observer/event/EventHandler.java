package observer.event;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tianshiming
 * @date 2018/6/4 22:26
 * @description
 */
public class EventHandler {
    private List<Event> events;

    public EventHandler() {
        events = new ArrayList<>();
    }

    public void addEvent(Object obj, String methodName, Object... args) {
        events.add(new Event(obj, methodName, args));
    }

    public void notifyX() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        for (Event event : events) {
            event.invoke();
        }
    }
}
