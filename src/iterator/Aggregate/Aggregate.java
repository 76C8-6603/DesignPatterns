package iterator.Aggregate;

import iterator.iterator.Iterator;

import java.util.List;

/**
 * @author tianshiming
 * @date 2018/7/12 21:46
 * @description
 */
public interface Aggregate {
    public Iterator createIterator();

    public Object get(int index);

    public void set(int index,Object obj);

    public int size();

    public List getList();

    public void setList(List list);
}
