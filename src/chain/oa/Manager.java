package chain.oa;

/**
 * @author tianshiming
 * @date 2018/7/17 23:45
 * @description
 */
public class Manager {
    protected Manager superior;

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public void handleRequest(Request request) {

    }
}
