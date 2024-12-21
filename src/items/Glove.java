package items;

import enums.Colors;

public class Glove extends Item {
    private Colors color;


    public Glove(Colors color) {
        super();
        this.color = color;
    }

    public Glove(String name, Colors color) {
        super(name);
        this.color = color;
    }


    public Colors getColor() {
        return this.color;
    }
    
    @Override
    public String getName() {
        return this.color.getText() + " " + super.getName();
    }

    @Override
    public void print() {
        this.color.print();
        super.print();
    }
}
