package state.state;

import state.context.Work;

/**
 * @author tianshiming
 * @date 2018/6/21 22:11
 * @description
 */
public class NoonWorkState implements WorkState {
    @Override
    public void work(Work work) {
        if (work.getHour() < 14) {
            System.out.println("Sleep!Sleep!Sleep!");
        } else {
            work.setWorkState(new AfternoonWorkState());
            work.workByState();
        }
    }
}
