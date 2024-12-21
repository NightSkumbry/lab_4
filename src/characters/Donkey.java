package characters;

import enums.States;

public class Donkey extends Character {
    public Donkey(String name_1, String name_2, States state) {
        super(name_1, name_2, state);
    }

    public Donkey(String name, States state) {
        this(name, name, state);
    }
}
