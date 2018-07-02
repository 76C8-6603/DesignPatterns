package memento.model;

/**
 * @author tianshiming
 * @date 2018/7/2 22:31
 * @description
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(String state) {
        return new Memento(state);
    }

    public void restore(Memento memento) {
        this.state = memento.getState();
    }

    public void showState() {
        System.out.println("当前状态为:" + this.state);
    }
}
