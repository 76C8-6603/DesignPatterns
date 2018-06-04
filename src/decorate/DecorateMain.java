package decorate;

/**
 * Created by tdbry on 2017/8/2.
 */
public class DecorateMain {
    public static void main(String[] args){
        DataFilter filter = new DataFilter();
        DataSecure secure = new DataSecure();
        DataInsert insert = new DataInsert();

        filter.decorate(insert);
        secure.decorate(filter);

        secure.operate();
    }
}
