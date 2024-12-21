package characters.interfaces;

import characters.InventoryCharacter;
import items.Item;

public interface ICanExchange {
    void exchange(InventoryCharacter other, int self_slot, int other_slot);
    Item getSlot(int slot);
    void setSlot(int slot, Item item);
}
