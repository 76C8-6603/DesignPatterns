package adapter.player;

/**
 * @author tianshiming
 * @date 2018/6/21 23:11
 * @description
 */
public class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println( name + "调整为进攻");
    }

    public void defense() {
        System.out.println(name + "调整为防守");
    }
}
