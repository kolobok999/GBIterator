import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
    private List<Component> components;

    public Pharmacy() {
        this.components = new ArrayList<>();
    }

    public Pharmacy addComponent(Component component) {
        this.components.add(component);
        return this;
    }

    public List<Component> getComponents() {
        return components;
    }

    private int getPharmacyPower() {
        int power = 0;
        for (Component component : components) {
            power += component.getPower();
        }
        return power;
    }

    private String compareName() {
        StringBuilder sb = new StringBuilder();
        for (Component component : components) {
            sb.append(component.getName());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "\nPharmacy{" +
                components +
                " total power: " + this.getPharmacyPower() +
                "}";
    }


    @Override
    public Iterator<Component> iterator() {
        return new ComponentIterator(this);
    }


    @Override
    public int compareTo(Pharmacy o) {
        if (this.getPharmacyPower() - o.getPharmacyPower() == 0) {
            return this.compareName().compareTo(o.compareName());
        }
        return this.getPharmacyPower() - o.getPharmacyPower();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return this.compareTo(pharmacy) == 0;
//        return this.getPharmacyPower() pharmacy.getPharmacyPower() == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 11;
        int result = 1;
        for (Component component : components) {
            result = prime * result + ((component.getName() == null) ? 0 : component.getName().hashCode());
            result = prime * result + ((component.getWeight() == null) ? 0 : component.getWeight().hashCode());
            result = prime * result + component.getPower();
        }
        return result;
    }
}
