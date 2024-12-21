package characters;

import java.util.ArrayList;

import characters.interfaces.ICanEquip;
import characters.interfaces.IHasIntroduction;
import enums.States;
import items.Item;

public class Policeman extends InventoryCharacter implements IHasIntroduction, ICanEquip {
    private int equipment_index = 0;


    public Policeman(String name_1, String name_2, States state) {
        super(name_1, name_2, state);
    }

    public Policeman(String name, States state) {
        this(name, name, state);
    }

    public Policeman(String name_1, String name_2, States state, ArrayList<Item> inventory) {
        super(name_1, name_2, state, inventory);
    }

    public Policeman(String name, States state, ArrayList<Item> inventory) {
        this(name, name, state, inventory);
    }


    @Override
    public void describeInventory() {
        System.out.print(this.getName_1() + " имеет ");
        String result = "";
        for (Item item : this.inventory) {
            if (item != getSlot(equipment_index)) result += item.getName() + " , ";
        }
        if (result.length() >= 1) result = result.substring(0, result.length()-2);
        System.out.print(result);
    }


    @Override
    public void introduce() {
        System.out.print("всем известный " + this.getName_1() + " " + this.getName_2() + " ");
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
