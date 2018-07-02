package memento.gameplay.test;

import memento.gameplay.Player;
import memento.gameplay.PlayerCaretaker;
import org.testng.annotations.Test;

/**
 * @author tianshiming
 * @date 2018/7/2 23:03
 * @description
 */
public class PlayerTest {
    @Test
    public void test() {
        Player player = new Player();
        System.out.println("******ready~~");
        player.initPlayerState();
        player.show();

        PlayerCaretaker caretaker = new PlayerCaretaker();
        caretaker.setPlayerMemento(player.saveState());

        System.out.println("******fight!");
        player.fight();
        player.show();

        System.out.println("******try again!");
        player.recoveryState(caretaker.getPlayerMemento());
        player.show();
    }
}
