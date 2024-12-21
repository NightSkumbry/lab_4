package characters.groups;

import java.util.ArrayList;

import characters.Character;
import characters.interfaces.IForEach;
import enums.Actions;
import enums.Relatives;
import enums.States;
import enums.modificators.Behavior;
import enums.modificators.Text;
import items.Item;
import places.Place;

public class KnownGroup extends Group implements IForEach {
    private ArrayList<Character> members;


    public KnownGroup(String name_1, String name_2, States state, ArrayList<Character> members) {
        super(name_1, name_2, state);
        this.members = members;
    }

    public KnownGroup(String name, States state, ArrayList<Character> members) {
        this(name, name, state, members);
    }


    public Character getMember(int index) {
        return members.get(index);
    }


    @Override
    public void forEach(Actions action, Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location) {
        for (Character character : members) {
            character.action(action, static_mods, text_mods, item, relative, location);
        }
    }

    @Override
    public void forEach(States state, Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location) {
        for (Character character : members) {
            if (state == States.WALK) {
                character.startWalk(static_mods, text_mods, item, relative, location);
            } else if (state == States.SIT) {
                character.startSit(static_mods, text_mods, item, relative, location);
            } else if (state == States.STAND) {
                character.startStand(static_mods, text_mods, item, relative, location);
            }
        }
        this.setState(state);

    }

    @Override
    public void forEach(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location) {
        for (Character character : members) {
            character.move(static_mods, text_mods, item, relative, location);
        }
    }


    @Override
    public void listMembers() {
        String result = "";
        for (Character character : members) {
            result += character.getName_1() + " , ";
        }
        if (result.length() >= 1) result = result.substring(0, result.length()-2);
        System.out.print(result);
    }


    @Override
    public void move_to(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        this.setLocation(location);
        for (Character character : members) {
            character.setLocation(location);
        }
        this.act("переместился", static_mods, text_mods, null, relative, location);
    }
    
    @Override
    public void run_to(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        this.setLocation(location);
        for (Character character : members) {
            character.setLocation(location);
        }
        this.act("перебежал", static_mods, text_mods, null, relative, location);
    }
}
