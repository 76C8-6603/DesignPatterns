package iterator.iterator;

/**
 * @author tianshiming
 * @date 2018/7/12 21:49
 * @description
 */
public interface Iterator {
    public Object getFirst();

    public Object next();

    public boolean hasNext();

    public Object current();
}
