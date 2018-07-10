package composite.model;

import java.util.Objects;

/**
 * @author tianshiming
 * @date 2018/7/4 16:27
 * @description
 */
public abstract class Component {
    public String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component) ;

    public abstract void remove(Component component);

    public abstract void show(String parentName);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return Objects.equals(name, component.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
