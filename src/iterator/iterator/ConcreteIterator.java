package iterator.iterator;

import iterator.Aggregate.Aggregate;

/**
 * @author tianshiming
 * @date 2018/7/12 21:50
 * @description
 */
public class ConcreteIterator implements Iterator {
    private int count = 0;
    private Aggregate aggregate;

    public ConcreteIterator(Aggregate aggregate) {
        this.count = 0;
        this.aggregate = aggregate;
    }

    @Override
    public Object getFirst() {
        return aggregate.get(0);
    }

    @Override
    public Object next() {
        Object cur = null;
        if (count < aggregate.size()) {

            cur = aggregate.get(count);
            count++;
        }
        return cur;
    }

    @Override
    public boolean hasNext() {
        if(count >= aggregate.size()){
            return false;
        }
        return true;
    }

    @Override
    public Object current() {
        return aggregate.get(count);
    }
}
