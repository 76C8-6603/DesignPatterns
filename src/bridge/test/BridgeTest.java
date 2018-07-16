package bridge.test;

import bridge.model.abstraction.RefinedAbstraction1;
import bridge.model.abstraction.RefinedAbstraction2;
import bridge.model.implementor.ConcreteImplementor1;
import bridge.model.implementor.ConcreteImplementor2;
import org.testng.annotations.Test;

/**
 * @author tianshiming
 * @date 2018/7/16 23:33
 * @description
 */
public class BridgeTest {
    @Test
    public void test() {
        RefinedAbstraction1 refinedAbstraction1 = new RefinedAbstraction1();
        refinedAbstraction1.setImpl(new ConcreteImplementor1());
        refinedAbstraction1.operation();

        refinedAbstraction1.setImpl(new ConcreteImplementor2());
        refinedAbstraction1.operation();

        RefinedAbstraction2 refinedAbstraction2 = new RefinedAbstraction2();
        refinedAbstraction2.setImpl(new ConcreteImplementor1());
        refinedAbstraction2.operation();

        refinedAbstraction2.setImpl(new ConcreteImplementor2());
        refinedAbstraction2.operation();
    }
}
