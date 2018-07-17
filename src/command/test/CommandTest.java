package command.test;

import command.model.ConcreteCommand1;
import command.model.ConcreteCommand2;
import command.model.Invoker;
import command.model.Receiver;
import org.testng.annotations.Test;

/**
 * @author tianshiming
 * @date 2018/7/17 22:02
 * @description
 */
public class CommandTest {
    @Test
    public void test() {
        Receiver receiver = new Receiver();
        ConcreteCommand1 concreteCommand1 = new ConcreteCommand1(receiver);
        ConcreteCommand2 concreteCommand2 = new ConcreteCommand2(receiver);

        Invoker invoker = new Invoker();
        invoker.addCommand(concreteCommand1);
        invoker.addCommand(concreteCommand2);
        invoker.execute();
    }
}
