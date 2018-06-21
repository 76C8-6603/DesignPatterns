package state.state;

import state.context.Context;

/**
 * @author tianshiming
 * @date 2018/6/21 22:00
 * @description
 */
public class ConcreteState2 implements State {
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteState1());
    }
}
