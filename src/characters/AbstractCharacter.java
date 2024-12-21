package characters;

import enums.States;

public class AbstractCharacter extends Character {
    public AbstractCharacter(String name_1, String name_2, States state) {
        super(name_1, name_2, state);
    }

    public AbstractCharacter(String name, States state) {
        this(name, name, state);
    }
}
