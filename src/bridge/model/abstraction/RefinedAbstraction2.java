package bridge.model.abstraction;

/**
 * @author tianshiming
 * @date 2018/7/16 23:36
 * @description
 */
public class RefinedAbstraction2 extends Abstraction {

    public void operation() {
        System.out.println("提炼抽象对象2");
        impl.operation();
    }
}
