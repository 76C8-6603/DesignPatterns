package state.state;

import state.context.Context;

/**
 * @author tianshiming
 * @date 2018/6/21 21:59
 * @description
 */
public interface State {
    void Handle(Context context);
}
