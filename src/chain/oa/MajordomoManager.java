package chain.oa;

/**
 * @author tianshiming
 * @date 2018/7/17 23:47
 * @description
 */
public class MajordomoManager extends Manager {
    @Override
    public void handleRequest(Request request) {
        if ("请假".equals(request.getType()) && request.getCount() <= 5) {
            System.out.println("总监同意" + request.getContent() + ",天数:" + request.getCount());
        } else if (superior != null) {
            superior.handleRequest(request);
        }
    }
}
