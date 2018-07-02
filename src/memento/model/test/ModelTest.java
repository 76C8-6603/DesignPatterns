package memento.model.test;

import memento.model.Caretaker;
import memento.model.Originator;
import org.testng.annotations.Test;

/**
 * @author tianshiming
 * @date 2018/7/2 22:32
 * @description
 */
public class ModelTest {
    @Test
    public void test() {
        Originator o = new Originator();
        o.setState("on");

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(o.createMemento(o.getState()));
        o.showState();

        o.setState("off");
        o.showState();

        o.restore(caretaker.getMemento());
        o.showState();
    }
}
