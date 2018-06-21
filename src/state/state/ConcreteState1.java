package state.state;

import state.context.Context;

/**
 * @author tianshiming
 * @date 2018/6/21 21:59
 * @description
 */
public class ConcreteState1 implements State {
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteState2());
    }
}
