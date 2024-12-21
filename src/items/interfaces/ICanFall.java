package items.interfaces;

import enums.Relatives;
import enums.modificators.Behavior;
import enums.modificators.Text;
import places.Place;

public interface ICanFall {
    void fall(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location);
    default public void fall(Behavior[] static_mods, Text[] text_mods) {
        fall(static_mods, text_mods, null, null);
    }
    
    void startFall(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location);
    default public void startFall(Behavior[] static_mods, Text[] text_mods) {
        startFall(static_mods, text_mods, null, null);
    }
}
