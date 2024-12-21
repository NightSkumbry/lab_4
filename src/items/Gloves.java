package items;

import enums.Colors;
import enums.Relatives;
import enums.modificators.Behavior;
import enums.modificators.Text;
import items.interfaces.ICanFall;
import places.Place;

public class Gloves extends Item implements ICanFall{
    public Gloves() {
        super();
    }

    public Gloves(String name) {
        super(name);
    }


    public void listColors() {
        Colors.BLUE.print();
        System.out.print(", ");
        Colors.WHITE.print();
        System.out.print(", ");
        Colors.RED.print();
        System.out.print(", ");
        Colors.GREEN.print();
        System.out.print(", ");
        Colors.PINK.print();
    }


    @Override
    public void fall(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
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
        result += "падали ";
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
    public void startFall(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
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
        result += "посыпались ";
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
