package bridge.model.abstraction;

/**
 * @author tianshiming
 * @date 2018/7/16 23:35
 * @description
 */
public class RefinedAbstraction1 extends Abstraction {

    public void operation() {
        System.out.println("提炼抽象对象1");
        impl.operation();
    }
}
