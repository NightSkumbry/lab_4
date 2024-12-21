package characters.interfaces;

import enums.Relatives;
import enums.modificators.Behavior;
import enums.modificators.Text;
import items.Item;
import places.Place;

public interface ICanStand {
    void stand(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location);
    default public void stand(Behavior[] static_mods, Text[] text_mods) {
        stand(static_mods, text_mods, null, null, null);
    }
    default public void stand(Behavior[] static_mods, Text[] text_mods, Item item) {
        stand(static_mods, text_mods, item, null, null);
    }
    default public void stand(Behavior[] static_mods, Text[] text_mods, Relatives relative) {
        stand(static_mods, text_mods, null, relative, null);
    }
    default public void stand(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative) {
        stand(static_mods, text_mods, item, relative, null);
    }
    default public void stand(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        stand(static_mods, text_mods, null, relative, location);
    }
    
    void startStand(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location);
    default public void startStand(Behavior[] static_mods, Text[] text_mods) {
        startStand(static_mods, text_mods, null, null, null);
    }
    default public void startStand(Behavior[] static_mods, Text[] text_mods, Item item) {
        startStand(static_mods, text_mods, item, null, null);
    }
    default public void startStand(Behavior[] static_mods, Text[] text_mods, Relatives relative) {
        startStand(static_mods, text_mods, null, relative, null);
    }
    default public void startStand(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative) {
        startStand(static_mods, text_mods, item, relative, null);
    }
    default public void startStand(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        startStand(static_mods, text_mods, null, relative, location);
    }
}
