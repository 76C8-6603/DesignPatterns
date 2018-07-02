package builder;

public class ConcreteBuilderB extends Builder{
    private Product product = new Product();
    @Override
    protected void buildePartA() {
        product.addPart("B类产品组件1");
    }

    @Override
    protected void buildePartB() {
        product.addPart("B类产品组件2");
    }

    @Override
    protected void getResult() {
        product.show();
    }

}
