package state.context;

import state.state.ForenoonWorkState;
import state.state.WorkState;

/**
 * @author tianshiming
 * @date 2018/6/21 22:07
 * @description
 */
public class Work {
    private int hour;
    private boolean complete;
    private WorkState workState;

    public Work() {
        this.workState = new ForenoonWorkState();//初始化
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public boolean isComplete() {
        return complete;
    }
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    public WorkState getWorkState() {
        return workState;
    }
    public void setWorkState(WorkState workState) {
        this.workState = workState;
    }

    public void workByState(){
        this.workState.work(this);
    }
}
