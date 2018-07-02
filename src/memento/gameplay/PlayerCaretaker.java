package memento.gameplay;

/**
 * @author tianshiming
 * @date 2018/7/2 22:52
 * @description
 */
public class PlayerCaretaker {
    private PlayerMemento playerMemento;

    public PlayerMemento getPlayerMemento() {
        return playerMemento;
    }

    public void setPlayerMemento(PlayerMemento playerMemento) {
        this.playerMemento = playerMemento;
    }
}
