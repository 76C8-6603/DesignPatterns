package state.state;

import state.context.Work;

/**
 * @author tianshiming
 * @date 2018/6/21 22:16
 * @description
 */
public class NightWorkState implements WorkState {
    @Override
    public void work(Work work) {
        if (work.isComplete()) {
            System.out.println("Happy go home!");
        } else {
            if (work.getHour() < 22) {
                System.out.println("Oh god help me!");
            }else {
                System.out.println("die.");
            }
        }
    }
}
