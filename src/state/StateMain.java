package state;

import state.context.Work;

/**
 * @author tianshiming
 * @date 2018/6/21 22:26
 * @description
 */
public class StateMain {
    public static void main(String[] args) {
        Work work = new Work();

        work.setHour(9);
        work.workByState();
        work.setHour(13);
        work.workByState();
        work.setHour(15);
        work.workByState();
        work.setHour(18);
        work.setComplete(true);
        work.workByState();
        work.setHour(21);
        work.workByState();
        work.setHour(24);
        work.workByState();
    }
}
