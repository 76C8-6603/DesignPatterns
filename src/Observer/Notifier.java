package Observer;

import Observer.event.EventHandler;

import java.lang.reflect.InvocationTargetException;

/**
 * @author tianshiming
 * @description
 * @date 2018/6/4 22:23
 */
public class Notifier {
    protected EventHandler eventHandler;

    public Notifier() {
        eventHandler = new EventHandler();
    }

    public void addListener(Object obj, String methodName, Object... args) {
    }

    public void notifyX() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    }
}
