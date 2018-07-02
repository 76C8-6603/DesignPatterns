package memento.model;

/**
 * @author tianshiming
 * @date 2018/7/2 22:31
 * @description
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
