package characters;

import java.util.ArrayList;

import characters.interfaces.ICanSpeak;
import enums.States;
import enums.modificators.Behavior;
import enums.modificators.Text;
import items.Item;

public class Wizard extends InventoryCharacter implements ICanSpeak {
    public Wizard(String name_1, String name_2, States state) {
        super(name_1, name_2, state);
    }

    public Wizard(String name, States state) {
        this(name, name, state);
    }

    public Wizard(String name_1, String name_2, States state, ArrayList<Item> inventory) {
        super(name_1, name_2, state, inventory);
    }

    public Wizard(String name, States state, ArrayList<Item> inventory) {
        this(name, name, state, inventory);
    }


    @Override
    public void sayAfter(String speech, Behavior[] static_mods, Text[] text_mods) {
        String name = this.getName_1() + " ";
        Boolean MBA = false;
        for (Behavior mod : static_mods) {
            if (mod == Behavior.WITHOUT_NAME) {
                name = "";
            }
            else if (mod == Behavior.MODS_BEFORE_ACTION) {
                MBA = true;
            }
            else if (mod == Behavior.USE_SECOND_NAME) {
                name = this.getName_2() + " ";
            }
        }
        String result = name;
        if (MBA) {
            for (Text mod : text_mods) {
                result += mod.getText() + " ";
            }
        }
        result += "сказал ";
        if (!MBA) {
            for (Text mod : text_mods) {
                result += mod.getText() + " ";
            }
        }
        result += ": \"" + speech + "\" ";
        System.out.print(result);
    }

    @Override
    public void sayBefore(String speech, Behavior[] static_mods, Text[] text_mods) {
        String name = this.getName_1() + " ";
        Boolean MBA = false;
        for (Behavior mod : static_mods) {
            if (mod == Behavior.WITHOUT_NAME) {
                name = "";
            }
            else if (mod == Behavior.MODS_BEFORE_ACTION) {
                MBA = true;
            }
            else if (mod == Behavior.USE_SECOND_NAME) {
                name = this.getName_2() + " ";
            }
        }
        String result = "\"" + speech + "\", ";
        if (MBA) {
            for (Text mod : text_mods) {
                result += mod.getText() + " ";
            }
        }
        result += "сказал ";
        if (!MBA) {
            for (Text mod : text_mods) {
                result += mod.getText() + " ";
            }
        }
        result += name;
        System.out.print(result);
    }
}
