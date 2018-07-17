package command.model;

/**
 * @author tianshiming
 * @date 2018/7/17 22:04
 * @description
 */
public class ConcreteCommand2 extends Command {
    public ConcreteCommand2(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.execute2();
    }
}
