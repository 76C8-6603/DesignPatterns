package templateMethod;

/**
 * Created by tdbry on 2017/7/26.
 */
public class TemplateTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        AbstractClass abs = new Concrete();
        abs.templateMethod();
    }
}
