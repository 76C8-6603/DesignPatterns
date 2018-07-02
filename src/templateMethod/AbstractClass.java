package templateMethod;

/**
 * Created by tdbry on 2017/7/26.
 */
public abstract class AbstractClass {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
    }
}
