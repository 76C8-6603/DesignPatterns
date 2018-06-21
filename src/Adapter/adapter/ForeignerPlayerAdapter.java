package Adapter.adapter;

import Adapter.foreignerPlayer.ForeignerPlayer;
import Adapter.player.Player;

/**
 * @author tianshiming
 * @date 2018/6/21 23:26
 * @description
 */
public class ForeignerPlayerAdapter extends Player {
    private ForeignerPlayer foreignerPlayer;
    public ForeignerPlayerAdapter(String name) {
        super(name);
        foreignerPlayer = new ForeignerPlayer();
        foreignerPlayer.setName(name);
    }

    @Override
    public void attack() {
        foreignerPlayer.atttack();
    }

    @Override
    public void defense() {
        foreignerPlayer.deeeefense();
    }
}
