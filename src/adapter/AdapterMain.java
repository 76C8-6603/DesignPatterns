package adapter;

import adapter.adapter.ForeignerPlayerAdapter;
import adapter.player.Center;
import adapter.player.Forward;
import adapter.player.Guard;
import adapter.player.Player;

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
