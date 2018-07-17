package chain.model;

/**
 * @author tianshiming
 * @date 2018/7/17 23:27
 * @description
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handle(int request) {
        if (request > 10 && request <= 20) {
            System.out.println("handler2处理了请求:" + request);
        } else if (successor != null) {
            successor.handle(request);
        }
    }
}
