package characters;

import enums.Relatives;
import enums.States;
import enums.modificators.Behavior;
import enums.modificators.Text;
import items.Item;
import places.Place;

public class Plot extends Character {
    public Plot(States state) {
        super("Сюжет", "Сюжет", state);
    }

    @Override
    protected void act(String action, Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location) {
        Behavior[] static_mods_n = new Behavior[static_mods.length + 1];
        for (int i = 0; i < static_mods.length; i++) {
            static_mods_n[i] = static_mods[i];
        }
        static_mods_n[static_mods.length] = Behavior.WITHOUT_NAME;

        super.act(action, static_mods_n, text_mods, item, relative, location);
    }

}
