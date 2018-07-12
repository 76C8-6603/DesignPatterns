package iterator.test;

import iterator.Aggregate.ConcreteAggregate;
import iterator.iterator.ConcreteIterator;
import org.testng.annotations.Test;

/**
 * @author tianshiming
 * @date 2018/7/12 21:52
 * @description
 */
public class IteratorTest {
    @Test
    public void test() {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.set(0, "L");
        aggregate.set(1, "O");
        aggregate.set(2, "L");
        ConcreteIterator concreteIterator = new ConcreteIterator(aggregate);
        System.out.println(concreteIterator.next());
        System.out.println(concreteIterator.hasNext());
        System.out.println(concreteIterator.next());
        System.out.println(concreteIterator.next());
        System.out.println(concreteIterator.hasNext());
        System.out.println(concreteIterator.next());
    }
}
