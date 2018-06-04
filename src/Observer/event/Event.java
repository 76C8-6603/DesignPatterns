package Observer.event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author tianshiming
 * @date 2018/6/4 22:26
 * @description
 */
public class Event {
    private Object obj;
    private String methodName;
    private Object[] args;
    private Class[] types;

    public Event(Object obj, String methodName, Object...args) {
        this.obj = obj;
        this.methodName = methodName;
        this.args = args;
        contractClassType();
    }

    private void contractClassType(){
        types = new Class[args.length];
        for(int i=0; i<args.length; i++){
            types[i] = args[i].getClass();
        }
    }

    public void invoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = obj.getClass().getMethod(methodName, types);
        if (method == null) {
            return;
        }
        method.invoke(obj, args);
    }
}