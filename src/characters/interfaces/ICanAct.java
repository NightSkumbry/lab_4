package characters.interfaces;

import enums.Actions;
import enums.Relatives;
import enums.modificators.Behavior;
import enums.modificators.Text;
import items.Item;
import places.Place;

public interface ICanAct {
    void action(Actions action, Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location);
    default public void action(Actions action, Behavior[] static_mods, Text[] text_mods) {
        action(action, static_mods, text_mods, null, null, null);
    }
    default public void action(Actions action, Behavior[] static_mods, Text[] text_mods, Item item) {
        action(action, static_mods, text_mods, item, null, null);
    }
    default public void action(Actions action, Behavior[] static_mods, Text[] text_mods, Relatives relative) {
        action(action, static_mods, text_mods, null, relative, null);
    }
    default public void action(Actions action, Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative) {
        action(action, static_mods, text_mods, item, relative, null);
    }
    default public void action(Actions action, Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        action(action, static_mods, text_mods, null, relative, location);
    }

    void move(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location);
    default public void move(Behavior[] static_mods, Text[] text_mods) {
        move(static_mods, text_mods, null, null, null);
    }
    default public void move(Behavior[] static_mods, Text[] text_mods, Item item) {
        move(static_mods, text_mods, item, null, null);
    }
    default public void move(Behavior[] static_mods, Text[] text_mods, Relatives relative) {
        move(static_mods, text_mods, null, relative, null);
    }
    default public void move(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative) {
        move(static_mods, text_mods, item, relative, null);
    }
    default public void move(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        move(static_mods, text_mods, null, relative, location);
    }
}
