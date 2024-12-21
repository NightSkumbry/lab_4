package characters.interfaces;

import enums.modificators.Behavior;
import enums.modificators.Text;

public interface ICanSpeak {
    void sayAfter(String speech, Behavior[] static_mods, Text[] text_mods);

    void sayBefore(String speech, Behavior[] static_mods, Text[] text_mods);
}
