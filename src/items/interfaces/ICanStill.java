package items.interfaces;

import enums.Relatives;
import enums.modificators.Behavior;
import enums.modificators.Text;
import places.Place;

public interface ICanStill {
    void stand(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location);
    default public void stand(Behavior[] static_mods, Text[] text_mods) {
        stand(static_mods, text_mods, null, null);
    }
    
    void startStand(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location);
    default public void startStand(Behavior[] static_mods, Text[] text_mods) {
        startStand(static_mods, text_mods, null, null);
    }
}
