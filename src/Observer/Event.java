package Observer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Event {
    private Object object;
    private String methodName;
    private Object[] params;
    private Class[] paramsType;

    public Event(Object object,String methodName,Object...params){
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        contractParamType(params);
    }

    private void contractParamType(Object[] params){
        this.paramsType = new Class[params.length];
        for(int i = 0; i < params.length; i++){
            this.paramsType[i] = params[i].getClass();
        }
    }

    public void invoke() throws NoSuchMethodException,IllegalAccessException,InvocationTargetException{
        Method method = this.object.getClass().getMethod(methodName,this.paramsType);
        if(method == null){
            return;
        }
        method.invoke(this.object,params);
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParamsType() {
        return paramsType;
    }

    public void setParamsType(Class[] paramsType) {
        this.paramsType = paramsType;
    }
}
