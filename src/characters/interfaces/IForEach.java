package characters.interfaces;

import enums.Actions;
import enums.Relatives;
import enums.States;
import enums.modificators.Behavior;
import enums.modificators.Text;
import items.Item;
import places.Place;

public interface IForEach {
    void forEach(Actions action, Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location);
    default public void forEach(Actions action, Behavior[] static_mods, Text[] text_mods) {
        forEach(action, static_mods, text_mods, null, null, null);
    }
    default public void forEach(Actions action, Behavior[] static_mods, Text[] text_mods, Item item) {
        forEach(action, static_mods, text_mods, item, null, null);
    }
    default public void forEach(Actions action, Behavior[] static_mods, Text[] text_mods, Relatives relative) {
        forEach(action, static_mods, text_mods, null, relative, null);
    }
    default public void forEach(Actions action, Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative) {
        forEach(action, static_mods, text_mods, item, relative, null);
    }
    default public void forEach(Actions action, Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        forEach(action, static_mods, text_mods, null, relative, location);
    }

    void forEach(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location);
    default public void forEach(Behavior[] static_mods, Text[] text_mods) {
        forEach(static_mods, text_mods, null, null, null);
    }
    default public void forEach(Behavior[] static_mods, Text[] text_mods, Item item) {
        forEach(static_mods, text_mods, item, null, null);
    }
    default public void forEach(Behavior[] static_mods, Text[] text_mods, Relatives relative) {
        forEach(static_mods, text_mods, null, relative, null);
    }
    default public void forEach(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative) {
        forEach(static_mods, text_mods, item, relative, null);
    }
    default public void forEach(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        forEach(static_mods, text_mods, null, relative, location);
    }

    void forEach(States state, Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location);
    default public void forEach(States state, Behavior[] static_mods, Text[] text_mods) {
        forEach(state, static_mods, text_mods, null, null, null);
    }
    default public void forEach(States state, Behavior[] static_mods, Text[] text_mods, Item item) {
        forEach(state, static_mods, text_mods, item, null, null);
    }
    default public void forEach(States state, Behavior[] static_mods, Text[] text_mods, Relatives relative) {
        forEach(state, static_mods, text_mods, null, relative, null);
    }
    default public void forEach(States state, Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative) {
        forEach(state, static_mods, text_mods, item, relative, null);
    }
    default public void forEach(States state, Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        forEach(state, static_mods, text_mods, null, relative, location);
    }
}
