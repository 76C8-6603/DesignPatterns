package TemplateMethod;

/**
 * Created by tdbry on 2017/7/26.
 */
public class Concrete extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("模板方法模式测试1");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("模板方法模式测试2");
    }
}
