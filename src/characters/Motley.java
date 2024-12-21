package characters;

import java.util.ArrayList;

import enums.States;
import items.Item;

public class Motley extends InventoryCharacter {
    public Motley(String name_1, String name_2, States state) {
        super(name_1, name_2, state);
    }

    public Motley(String name, States state) {
        this(name, name, state);
    }

    public Motley(String name_1, String name_2, States state, ArrayList<Item> inventory) {
        super(name_1, name_2, state, inventory);
    }

    public Motley(String name, States state, ArrayList<Item> inventory) {
        this(name, name, state, inventory);
    }
}
