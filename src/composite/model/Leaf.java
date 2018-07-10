package composite.model;

/**
 * @author tianshiming
 *
 * @date 2018/7/4 16:27
 * @description
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void show(String parentName) {
        System.out.println(parentName + "--" + this.name);
    }
}
