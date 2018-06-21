package state.state;

import state.context.Work;

/**
 * @author tianshiming
 * @date 2018/6/21 22:11
 * @description
 */
public class ForenoonWorkState implements WorkState {
    @Override
    public void work(Work work) {
        if (work.getHour() < 11) {
            System.out.println("Work!Work!Work!");
        } else {
            work.setWorkState(new NoonWorkState());
            work.workByState();
        }
    }
}
