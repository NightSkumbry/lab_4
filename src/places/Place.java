package places;

import java.util.Objects;

public abstract class Place {
    private String name;


    protected Place() {
        super();
        this.name = "NoNamePlace";
    }

    protected Place(String name) {
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

        Place other = (Place) otherObject;
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
