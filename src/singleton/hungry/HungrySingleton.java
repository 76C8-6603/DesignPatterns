package singleton.hungry;

/**
 * @author tianshiming
 * @date 2018/7/16 22:18
 * @description
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
