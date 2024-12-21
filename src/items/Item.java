package items;

import java.util.Objects;

public abstract class Item {
    private String name;


    protected Item() {
        super();
        this.name = "NoNameItem";
    }

    protected Item(String name) {
        super();
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public void print() {
        System.out.print(this.name + " ");
    }

    
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!this.getClass().equals(otherObject.getClass())) return false;

        Item other = (Item) otherObject;
        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return getClass().getName() + "[" + "name=" + name + "]";
    }
}
