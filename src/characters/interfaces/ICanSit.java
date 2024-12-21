package characters.interfaces;

import enums.Relatives;
import enums.modificators.Behavior;
import enums.modificators.Text;
import items.Item;
import places.Place;

public interface ICanSit {
    void sit(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location);
    default public void sit(Behavior[] static_mods, Text[] text_mods) {
        sit(static_mods, text_mods, null, null, null);
    }
    default public void sit(Behavior[] static_mods, Text[] text_mods, Item item) {
        sit(static_mods, text_mods, item, null, null);
    }
    default public void sit(Behavior[] static_mods, Text[] text_mods, Relatives relative) {
        sit(static_mods, text_mods, null, relative, null);
    }
    default public void sit(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative) {
        sit(static_mods, text_mods, item, relative, null);
    }
    default public void sit(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        sit(static_mods, text_mods, null, relative, location);
    }
    
    void startSit(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location);
    default public void startSit(Behavior[] static_mods, Text[] text_mods) {
        startSit(static_mods, text_mods, null, null, null);
    }
    default public void startSit(Behavior[] static_mods, Text[] text_mods, Item item) {
        startSit(static_mods, text_mods, item, null, null);
    }
    default public void startSit(Behavior[] static_mods, Text[] text_mods, Relatives relative) {
        startSit(static_mods, text_mods, null, relative, null);
    }
    default public void startSit(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative) {
        startSit(static_mods, text_mods, item, relative, null);
    }
    default public void startSit(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        startSit(static_mods, text_mods, null, relative, location);
    }
}
