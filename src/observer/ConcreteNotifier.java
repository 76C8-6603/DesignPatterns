package observer;

import java.lang.reflect.InvocationTargetException;

/**
 * @author tianshiming
 * @description
 * @date 2018/6/4 22:24
 */
public class ConcreteNotifier extends Notifier {
    @Override
    public void addListener(Object obj, String methodName, Object... args) {
        eventHandler.addEvent(obj,methodName,args);
    }

    @Override
    public void notifyX() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        eventHandler.notifyX();
    }
}
