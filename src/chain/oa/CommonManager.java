package chain.oa;

/**
 * @author tianshiming
 * @date 2018/7/17 23:46
 * @description
 */
public class CommonManager extends Manager {
    @Override
    public void handleRequest(Request request) {
        if ("请假".equals(request.getType()) && request.getCount() <= 2) {
            System.out.println("经理同意" + request.getContent() + ",天数:" + request.getCount());
        } else if (superior != null) {
            superior.handleRequest(request);
        }
    }
}
