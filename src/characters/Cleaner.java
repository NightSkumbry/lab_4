package characters;

import java.util.ArrayList;

import characters.interfaces.ICanEquip;
import enums.States;
import items.Item;

public class Cleaner extends InventoryCharacter implements ICanEquip {
    private int equipment_index = 0;


    public Cleaner(String name_1, String name_2, States state) {
        super(name_1, name_2, state);
    }

    public Cleaner(String name, States state) {
        this(name, name, state);
    }

    public Cleaner(String name_1, String name_2, States state, ArrayList<Item> inventory) {
        super(name_1, name_2, state, inventory);
    }

    public Cleaner(String name, States state, ArrayList<Item> inventory) {
        this(name, name, state, inventory);
    }


    @Override
    public void setEquipped(int index) {
        this.getSlot(index);
        this.equipment_index = index;
    }

    @Override
    public void printEquipped() {
        Item item = this.getSlot(this.equipment_index);
        System.out.print("на " + this.getName_1() + " был " + item.getName() + " ");
    }
}
