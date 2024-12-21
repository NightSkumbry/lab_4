package characters;

import java.util.ArrayList;

import characters.interfaces.ICanExchange;
import characters.interfaces.ICanObtain;
import enums.States;
import exceptions.IncorrectSlotException;
import items.Item;

public abstract class InventoryCharacter extends Character implements ICanExchange, ICanObtain {
    ArrayList<Item> inventory = new ArrayList<Item>();


    protected InventoryCharacter(String name_1, String name_2, States state) {
        super(name_1, name_2, state);
    }

    protected InventoryCharacter(String name, States state) {
        this(name, name, state);
    }

    protected InventoryCharacter(String name_1, String name_2, States state, ArrayList<Item> inventory) {
        this(name_1, name_2, state);
        this.inventory = inventory;
    }

    protected InventoryCharacter(String name, States state, ArrayList<Item> inventory) {
        this(name, name, state, inventory);
    }


    public void describeInventory() {
        System.out.print(this.getName_1() + " имеет ");
        String result = "";
        for (Item item : this.inventory) {
            result += item.getName() + " , ";
        }
        if (result.length() >= 1) result = result.substring(0, result.length()-2);
        System.out.print(result);
    }


    @Override
    public void exchange(InventoryCharacter other, int self_slot, int other_slot) {
        Item a = this.getSlot(self_slot);
        Item b = other.getSlot(other_slot);
        System.out.print(this.getName_1() + " меняет " + a.getName() + " у " + other.getName_1() + " на " + b.getName() + " ");
        this.setSlot(self_slot, b);
        other.setSlot(other_slot, a);
    }
    
    @Override
    public Item getSlot(int slot) {
        if (this.inventory.size() <= slot) {
            throw new IncorrectSlotException("Недопустимый слот " + slot + " у " + this.getName_1());
        }
        return this.inventory.get(slot);
    }
    
    @Override
    public void setSlot(int slot, Item item) {
        if (this.inventory.size() <= slot) {
            throw new IncorrectSlotException("Недопустимый слот " + slot + " у " + this.getName_1());
        }
        this.inventory.set(slot, item);
    }


    @Override
    public void addItem(Item item) {
        this.inventory.add(item);
    }

    @Override
    public void obtainItem(Item item) {
        this.addItem(item);
        System.out.print(this.getName_1() + " получил " + item.getName() + " ");
    }
}
