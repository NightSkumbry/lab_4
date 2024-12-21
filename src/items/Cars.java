package items;

import enums.Relatives;
import enums.modificators.Behavior;
import enums.modificators.Text;
import items.interfaces.ICanStill;
import places.Place;

public class Cars extends Item implements ICanStill {
    public Cars() {
        super();
    }

    public Cars(String name) {
        super(name);
    }


    @Override
    public void stand(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        String name = this.getName() + " ";
        boolean MBA = false;
        boolean IAA = false;
        for (Behavior mod : static_mods) {
            if (mod == Behavior.WITHOUT_NAME) {
                name = "";
            }
            else if (mod == Behavior.MODS_BEFORE_ACTION) {
                MBA = true;
            }
            else if (mod == Behavior.ITEM_AFTER_ACTION) {
                IAA = true;
            }
        }

        String result = "";
        if (!IAA) {
            result += name;
        }
        if (MBA) {
            for (Text mod : text_mods) {
                result += mod.getText() + " ";
            }
        }
        result += "стояли ";
        if (IAA) {
            result += name;
        }
        if (!MBA) {
            for (Text mod : text_mods) {
                result += mod.getText() + " ";
            }
        }
        if (relative != null) {
            result += relative.getText() + " " + location.getName() + " ";
        }
        
        System.out.print(result);
    }

    @Override
    public void startStand(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        String name = this.getName() + " ";
        boolean MBA = false;
        boolean IAA = false;
        for (Behavior mod : static_mods) {
            if (mod == Behavior.WITHOUT_NAME) {
                name = "";
            }
            else if (mod == Behavior.MODS_BEFORE_ACTION) {
                MBA = true;
            }
            else if (mod == Behavior.ITEM_AFTER_ACTION) {
                IAA = true;
            }
        }

        String result = "";
        if (!IAA) {
            result += name;
        }
        if (MBA) {
            for (Text mod : text_mods) {
                result += mod.getText() + " ";
            }
        }
        result += "встали ";
        if (IAA) {
            result += name;
        }
        if (!MBA) {
            for (Text mod : text_mods) {
                result += mod.getText() + " ";
            }
        }
        if (relative != null) {
            result += relative.getText() + " " + location.getName() + " ";
        }

        System.out.print(result);
    }
}
