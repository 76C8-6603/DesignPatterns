package observer;

import java.lang.reflect.InvocationTargetException;

/**
 * @author tianshiming
 * @date 2018/6/4 22:26
 * @description
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Notifier notifier = new ConcreteNotifier();
        notifier.addListener(new GodOfWarObserver(),"boy");
        notifier.addListener(new GodOfWarObserver(),"boy","What's that say");
        notifier.notifyX();
    }
}
