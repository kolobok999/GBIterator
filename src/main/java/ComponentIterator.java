import java.util.Iterator;
import java.util.List;

public class ComponentIterator implements Iterator<Component> {
    private final List<Component> components;

    public ComponentIterator(Pharmacy pharmacy) {
        this.components = pharmacy.getComponents();
    }

    int index;

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }
}
