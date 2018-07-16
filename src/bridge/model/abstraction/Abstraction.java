package bridge.model.abstraction;

import bridge.model.implementor.Implementor;

/**
 * @author tianshiming
 * @date 2018/7/16 23:35
 * @description
 */
public class Abstraction {
    protected Implementor impl;

    public void setImpl(Implementor impl) {
        this.impl = impl;

    }

    public void operation() {
        impl.operation();
    }
}
