package chain.model;

/**
 * @author tianshiming
 * @date 2018/7/17 23:27
 * @description
 */
public class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void handle(int request) {

    }
}
