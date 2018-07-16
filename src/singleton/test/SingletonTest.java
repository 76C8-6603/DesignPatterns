package singleton.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import singleton.hungry.HungrySingleton;
import singleton.lazy.LazySingleton;

/**
 * @author tianshiming
 * @date 2018/7/16 22:19
 * @description
 */
public class SingletonTest {
    @Test
    public void lazyTest() {
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        Assert.assertEquals(lazy1,lazy2);
    }

    @Test
    public void hungryTest() {
        HungrySingleton hungry1 = HungrySingleton.getInstance();
        HungrySingleton hungry2 = HungrySingleton.getInstance();
        Assert.assertEquals(hungry1,hungry2);
    }
}
