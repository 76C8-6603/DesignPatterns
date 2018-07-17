package chain.oa;

/**
 * @author tianshiming
 * @date 2018/7/17 23:47
 * @description
 */
public class GeneralManager extends Manager {
    @Override
    public void handleRequest(Request request) {
        if ("请假".equals(request.getType())) {
            System.out.println("总经理同意" + request.getContent() + ",天数:" + request.getCount());
        } else if ("调薪".equals(request.getType()) && request.getCount() <= 1000) {
            System.out.println("总经理同意" + request.getContent() + ",金额:" + request.getCount());
        } else if ("调薪".equals(request.getType()) && request.getCount() > 1000) {
            System.out.println("滚");
        }
    }
}
