package iterator.Aggregate;

import iterator.iterator.ConcreteIterator;
import iterator.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianshiming
 * @date 2018/7/12 21:49
 * @description
 */
public class ConcreteAggregate implements Aggregate {
    private List list = new ArrayList<>();
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object get(int index) {
        return list.get(index);
    }

    public void set(int index,Object obj) {
        list.add(index, obj);
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public int size() {
        return list.size();
    }


}
