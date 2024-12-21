package characters.interfaces;

import enums.Relatives;
import enums.modificators.Behavior;
import enums.modificators.Text;
import items.Item;
import places.Place;

public interface ICanWalk {
    void walk(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location);
    default public void walk(Behavior[] static_mods, Text[] text_mods) {
        walk(static_mods, text_mods, null, null, null);
    }
    default public void walk(Behavior[] static_mods, Text[] text_mods, Item item) {
        walk(static_mods, text_mods, item, null, null);
    }
    default public void walk(Behavior[] static_mods, Text[] text_mods, Relatives relative) {
        walk(static_mods, text_mods, null, relative, null);
    }
    default public void walk(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative) {
        walk(static_mods, text_mods, item, relative, null);
    }
    default public void walk(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        walk(static_mods, text_mods, null, relative, location);
    }
    
    void startWalk(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location);
    default public void startWalk(Behavior[] static_mods, Text[] text_mods) {
        startWalk(static_mods, text_mods, null, null, null);
    }
    default public void startWalk(Behavior[] static_mods, Text[] text_mods, Item item) {
        startWalk(static_mods, text_mods, item, null, null);
    }
    default public void startWalk(Behavior[] static_mods, Text[] text_mods, Relatives relative) {
        startWalk(static_mods, text_mods, null, relative, null);
    }
    default public void startWalk(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative) {
        startWalk(static_mods, text_mods, item, relative, null);
    }
    default public void startWalk(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        startWalk(static_mods, text_mods, null, relative, location);
    }
}
