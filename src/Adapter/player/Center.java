package Adapter.player;

/**
 * @author tianshiming
 * @date 2018/6/21 23:20
 * @description
 */
public class Center extends Player {
    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中场" + name + "调整为进攻");
    }

    @Override
    public void defense() {
        System.out.println("中场" + name + "调整为防守");
    }
}
