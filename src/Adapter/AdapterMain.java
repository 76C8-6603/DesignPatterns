package Adapter;

import Adapter.adapter.ForeignerPlayerAdapter;
import Adapter.player.Center;
import Adapter.player.Forward;
import Adapter.player.Guard;
import Adapter.player.Player;

/**
 * @author tianshiming
 * @date 2018/6/21 23:11
 * @description
 */
public class AdapterMain {
    public static void main(String[] args) {
        Player forward = new Forward("forward");
        forward.attack();
        Player center = new Center("center");
        center.attack();
        Player guard = new Guard("guard");
        guard.defense();
        Player foreigner = new ForeignerPlayerAdapter("foreigner");
        foreigner.attack();

    }
}
