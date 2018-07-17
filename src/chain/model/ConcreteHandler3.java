package chain.model;

/**
 * @author tianshiming
 * @date 2018/7/17 23:34
 * @description
 */
public class ConcreteHandler3 extends Handler {
    @Override
    public void handle(int request) {
        System.out.println("handler3处理了请求:" + request);
    }
}
