package characters.groups;

import characters.Character;
import enums.States;

public abstract class Group extends Character {
    protected Group(String name_1, String name_2, States state) {
        super(name_1, name_2, state);
    }

    protected Group(String name, States state) {
        this(name, name, state);
    }

    
    abstract void listMembers();
}
