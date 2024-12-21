package characters;

import java.util.ArrayList;

import enums.States;
import items.Item;

public class Button extends InventoryCharacter {
    public Button(String name_1, String name_2, States state) {
        super(name_1, name_2, state);
    }

    public Button(String name, States state) {
        this(name, name, state);
    }

    public Button(String name_1, String name_2, States state, ArrayList<Item> inventory) {
        super(name_1, name_2, state, inventory);
    }

    public Button(String name, States state, ArrayList<Item> inventory) {
        this(name, name, state, inventory);
    }
}
