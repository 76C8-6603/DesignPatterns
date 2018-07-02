package adapter.foreignerPlayer;

/**
 * @author tianshiming
 * @date 2018/6/21 23:23
 * @description
 */
public class ForeignerPlayer {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void atttack() {
        System.out.println("外籍" + name + "调整为进攻" );
    }

    public void deeeefense() {
        System.out.println("外籍" + name + "调整为防守");
    }
}
