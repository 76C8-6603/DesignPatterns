package chain.test;

import chain.model.ConcreteHandler1;
import chain.model.ConcreteHandler2;
import chain.model.ConcreteHandler3;
import chain.model.Handler;
import chain.oa.*;
import org.testng.annotations.Test;

/**
 * @author tianshiming
 * @date 2018/7/17 23:23
 * @description
 */
public class ChainTest {
    @Test
    public void modelTest() {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        int[] nums = new int[]{2, 11, 31};
        for (int i : nums) {
            handler1.handle(i);
        }
    }

    @Test
    public void oaTest() {
        Manager common = new CommonManager();
        Manager majordomo = new MajordomoManager();
        Manager general = new GeneralManager();
        common.setSuperior(majordomo);
        majordomo.setSuperior(general);

        Request request1 = new Request();
        request1.setContent("小明请假");
        request1.setCount(2);
        request1.setType("请假");
        common.handleRequest(request1);

        Request request2 = new Request();
        request2.setContent("小明请假");
        request2.setCount(5);
        request2.setType("请假");
        common.handleRequest(request2);

        Request request3 = new Request();
        request3.setContent("小明调薪");
        request3.setCount(1000);
        request3.setType("调薪");
        common.handleRequest(request3);

        Request request4 = new Request();
        request4.setContent("小明调薪");
        request4.setCount(2000);
        request4.setType("调薪");
        common.handleRequest(request4);
    }
}
