package memento.model;

/**
 * @author tianshiming
 * @date 2018/7/2 22:31
 * @description
 */
public class Memento {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
