package decorate;

/**
 * Created by tdbry on 2017/8/2.
 */
public class DataSecure extends DataInsert {
    @Override
    public void operate() {
        System.out.println("数据加密");
        super.operate();
    }
}
