package state.state;

import state.context.Work;

/**
 * @author tianshiming
 * @date 2018/6/21 22:12
 * @description
 */
public class AfternoonWorkState implements WorkState {

    @Override
    public void work(Work work) {
        if (work.getHour() < 18) {
            System.out.println("Fuck the work!");
        } else {
            work.setWorkState(new NightWorkState());
            work.workByState();
        }
    }
}
