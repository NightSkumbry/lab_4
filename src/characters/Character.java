package characters;

import java.util.Objects;

import characters.interfaces.ICanAct;
import characters.interfaces.ICanSit;
import characters.interfaces.ICanStand;
import characters.interfaces.ICanWalk;
import characters.interfaces.IExtendedRelocation;
import enums.Relatives;
import enums.States;
import enums.modificators.Behavior;
import enums.modificators.Text;
import enums.Actions;
import enums.NamesRecord;
import items.Item;
import places.Place;
import exceptions.NoLocationException;

public abstract class Character implements ICanAct, ICanSit, ICanStand, ICanWalk, IExtendedRelocation{
    private NamesRecord name;
    private Place location;
    private States state;


    protected Character(String name_1, String name_2, States state) {
        super();
        this.name = new NamesRecord(name_1, name_2);
        this.state = state;
    }

    protected Character(String name, States state) {
        this(name, name, state);
    }

    public String getName_1() {
        return name.name_1();
    }

    public String getName_2() {
        return name.name_2();
    }

    public void printName_1() {
        System.out.print(this.getName_1() + " ");
    }

    public void printName_2() {
        System.out.print(this.getName_2() + " ");
    }

    public Place getLocation() {
        return location;
    }

    public void setLocation(Place location) {
        this.location = location;
    }

    public States getState() {
        return this.state;
    }

    protected void setState(States state) {
        this.state = state;
    }

    protected void act(String action, Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location) {
        String name = this.getName_1() + " ";
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
            else if (mod == Behavior.USE_SECOND_NAME) {
                name = this.getName_2() + " ";
            }
        }

        String result = name;
        if (!IAA && item != null) {
            result += item.getName() + " ";
        }
        if (MBA) {
            for (Text mod : text_mods) {
                result += mod.getText() + " ";
            }
        }
        result += action + " ";
        if (IAA && item != null) {
            result += item.getName() + " ";
        }
        if (!MBA) {
            for (Text mod : text_mods) {
                result += mod.getText() + " ";
            }
        }
        if (relative != null) {
            if (location == null) {
                location = this.getLocation();
            }
            if (location == null) {
                throw new NoLocationException(this.getName_1() + " не имеет Location. Невозможно произвести действие " + action + " " + relative.getText() + " null.");
            }
            result += relative.getText() + " " + location.getName() + " ";
        }
        
        System.out.print(result);
    }


    @Override
    public void action(Actions action, Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location) {
        this.act(action.getText(), static_mods, text_mods, item, relative, location);
    }

    @Override
    public void move(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location) {
        if (this.getState() == States.SIT) {
            this.sit(static_mods, text_mods, item, relative, location);
        } else if (this.getState() == States.STAND) {
            this.stand(static_mods, text_mods, item, relative, location);
        } else if (this.getState() == States.WALK) {
            this.walk(static_mods, text_mods, item, relative, location);
        }
    }


    @Override
    public void stand(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location) {
        this.act(States.STAND.getInAction(), static_mods, text_mods, item, relative, location);
    }

    @Override
    public void sit(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location) {
        this.act(States.SIT.getInAction(), static_mods, text_mods, item, relative, location);
    }
    
    @Override
    public void walk(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location) {
        this.act(States.WALK.getInAction(), static_mods, text_mods, item, relative, location);
    }

    @Override
    public void startStand(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location) {
        this.setState(States.STAND);
        this.act(States.STAND.getStartAction(), static_mods, text_mods, item, relative, location);
    }

    @Override
    public void startSit(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location) {
        this.setState(States.SIT);
        this.act(States.SIT.getStartAction(), static_mods, text_mods, item, relative, location);
    }

    @Override
    public void startWalk(Behavior[] static_mods, Text[] text_mods, Item item, Relatives relative, Place location) {
        this.setState(States.WALK);
        this.act(States.WALK.getStartAction(), static_mods, text_mods, item, relative, location);
    }


    @Override
    public void move_to(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        this.setLocation(location);
        this.act("переместился", static_mods, text_mods, null, relative, location);
    }
    
    @Override
    public void run_to(Behavior[] static_mods, Text[] text_mods, Relatives relative, Place location) {
        this.setLocation(location);
        this.act("перебежал", static_mods, text_mods, null, relative, location);
    }


    @Override
    public boolean equals(Object otherObject)
    {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!otherObject.getClass().equals(this.getClass())) return false;

        Character other = (Character) otherObject;
        return name.equals(other.name) && location.equals(other.location);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, location);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
                + "name=" + this.name
                + ",location=" + this.location + "]";
    }
}
