package decorate;

/**
 * Created by tdbry on 2017/8/2.
 */
public class DataFilter extends DataInsert {
    @Override
    public void operate() {
        System.out.println("数据过滤");
        super.operate();
    }
}
