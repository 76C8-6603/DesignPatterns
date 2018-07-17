package command.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianshiming
 * @date 2018/7/17 22:06
 * @description
 */
public class Invoker {
    private List<Command> commands = new ArrayList<>();;

    public void addCommand(Command command) {
        if (command instanceof ConcreteCommand2) {
            System.out.println("execute2不受支持");
        }else{
            commands.add(command);
            System.out.println("execute已经追加");
        }

    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void execute() {
        for (Command c : commands) {
            c.execute();
        }
    }

}
