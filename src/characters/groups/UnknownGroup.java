package characters.groups;

import enums.States;

public class UnknownGroup extends Group {
    private String description;


    public UnknownGroup(String name_1, String name_2, States state, String description) {
        super(name_1, name_2, state);
        this.description = description;
    }

    public UnknownGroup(String name, States state, String description) {
        this(name, name, state, description);
    }


    @Override
    public void listMembers() {
        System.out.print(description + " ");
    }
}
