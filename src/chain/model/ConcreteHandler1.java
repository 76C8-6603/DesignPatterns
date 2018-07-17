package chain.model;

/**
 * @author tianshiming
 * @date 2018/7/17 23:27
 * @description
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handle(int request) {
        if (0 < request && request <= 10) {
            System.out.println("handler1处理了请求:" + request);
        } else if (successor != null) {
            successor.handle(request);
        }
    }
}
