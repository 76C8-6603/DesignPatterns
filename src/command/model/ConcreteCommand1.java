package command.model;

/**
 * @author tianshiming
 * @date 2018/7/17 22:04
 * @description
 */
public class ConcreteCommand1 extends Command {
    public ConcreteCommand1(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.execute1();
    }
}
