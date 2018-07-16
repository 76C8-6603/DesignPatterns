package singleton.lazy;

/**
 * @author tianshiming
 * @date 2018/7/16 22:20
 * @description
 */
public class LazySingleton {
    private static LazySingleton instance;
    private static final Object syncObj = new Object();

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (syncObj) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
