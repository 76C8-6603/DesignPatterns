package adapter.player;

/**
 * @author tianshiming
 * @date 2018/6/21 23:16
 * @description
 */
public class Forward extends Player {
    public Forward(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋" + name + "调整为进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋" + name + "调整为防守");
    }
}
