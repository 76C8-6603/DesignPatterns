package composite.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianshiming
 * @date 2018/7/4 16:27
 * @description
 */
public class Composite extends Component{
    private List<Component> components = new ArrayList<>();
    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void show(String parentName) {
        System.out.println(parentName + "--" + this.name);
        for (Component comp : components) {
            comp.show(this.name);
        }
    }
}
