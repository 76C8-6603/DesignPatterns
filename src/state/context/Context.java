package state.context;

import state.state.State;

/**
 * @author tianshiming
 * @date 2018/6/21 21:59
 * @description
 */
public class Context {
    public Context(State state) {
        this.state = state;
    }

    private State state;
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request(){
        state.Handle(this);
    }
}
