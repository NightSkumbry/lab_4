package characters.interfaces;

import enums.Relatives;
import enums.modificators.Behavior;
import enums.modificators.Text;
import places.Place;

public interface IExtendedRelocation {
    void move_to(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location);
    void run_to(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location);
}
