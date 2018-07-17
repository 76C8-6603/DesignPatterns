package command.model;

/**
 * @author tianshiming
 * @date 2018/7/17 22:03
 * @description
 */
public class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {

    }
}
