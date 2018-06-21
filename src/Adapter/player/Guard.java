package Adapter.player;

/**
 * @author tianshiming
 * @date 2018/6/21 23:22
 * @description
 */
public class Guard extends Player {
    public Guard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫" + name + "调整为进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫" + name + "调整为防守");
    }
}
