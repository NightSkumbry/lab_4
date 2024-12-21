import java.util.ArrayList;
import java.util.Arrays;

import characters.AbstractCharacter;
import characters.Button;
import characters.Character;
import characters.Cleaner;
import characters.Donkey;
import characters.Motley;
import characters.Plot;
import characters.Policeman;
import characters.Small;
import characters.Stupid;
import characters.Wizard;
import characters.groups.KnownGroup;
import characters.groups.UnknownGroup;
import enums.Actions;
import enums.Colors;
import enums.Connections;
import enums.Relatives;
import enums.States;
import enums.modificators.Behavior;
import enums.modificators.Text;
import exceptions.IncorrectSlotException;
import exceptions.NoLocationException;
import items.AbstractItem;
import items.Cars;
import items.Gate;
import items.Glove;
import items.Gloves;
import items.HandScarf;
import items.Helmet;
import items.Item;
import items.PaperSign;
import items.Stick;
import items.Trousers;
import places.AbstractPlace;
import places.Bench;
import places.Car;
import places.Corner;
import places.CrossRoad;
import places.Exit;
import places.Fence;
import places.House;
import places.Pavement;
import places.Road;
import places.Square;
import places.Street;
import places.Sun;
import places.Town;

public class App {
    static private Connections and = Connections.AND;
    static private Connections comma = Connections.COMMA;
    static private Connections full_stop = Connections.FULL_STOP;
    static private Connections or = Connections.OR;
    static private boolean debug = false;

    static private Donkey pegasik;
    static private Donkey kaligula;
    static private Donkey brikun;
    static private KnownGroup donkeys;
    static private Cleaner cleaner;
    static private Stupid stupid;
    static private Wizard wizard;
    static private Button button;
    static private Motley motley;
    static private KnownGroup they_four;
    static private AbstractCharacter no_one;
    static private KnownGroup they_three;
    static private AbstractItem something;
    static private Plot plot;
    static private UnknownGroup swarm;
    static private Gloves gloves;


    private static void part_1() {
        if (debug) System.out.println("Часть 1 (12)\n");
            
        Bench bench = new Bench("лавочка");
        stupid = new Stupid(
            "Незнайка",
            States.SIT
        );
        stupid.setLocation(bench);
        wizard = new Wizard(
            "волшебник",
            States.SIT
        );
        wizard.setLocation(bench);
        button = new Button(
            "Кнопочка", 
            States.SIT
        );
        button.setLocation(bench);
        motley = new Motley(
            "Пёстренький", 
            States.SIT
        );
        motley.setLocation(bench);
        they_four = new KnownGroup(
            "они", 
            "Незнайка и спутники",
            States.SIT, 
            new ArrayList<Character>(Arrays.asList(
                wizard,
                stupid,
                button,
                motley
            ))
        );
        they_four.setLocation(bench);
        they_four.move(
            new Behavior[] {Behavior.MODS_BEFORE_ACTION}, 
            new Text[] {Text.LONG_WHILE},
            Relatives.ON
        );
        and.print();
        Sun sun = new Sun("солнышко");
        they_four.action(
            Actions.WARM,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {},
            Relatives.ON,
            sun
        );
        comma.print();
        and.print();
        they_four.action(
            Actions.JOY,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {}
        );
        comma.print();
        and.print();
        they_four.action(
            Actions.FEEL,
            new Behavior[] {Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.GOOD, Text.THEMSELVES}
        );
        comma.print();
        and.print();
        no_one = new AbstractCharacter(
            "никто", 
            States.STAND
        );
        no_one.action(
            Actions.REGRET,
            new Behavior[] {Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.ALREADY, Text.NOT}
        );
        Relatives.ABOUT.print();
        Stick magic_stick = new Stick("волшебная палочка");
        magic_stick.print();
        full_stop.print();
        and.print();
        stupid.sayAfter(
            "", 
            new Behavior[] {}, 
            new Text[] {}
        );
        full_stop.print();
    }


    private static void part_2() {
        if (debug) System.out.println("\n\nЧасть 2 (10)\n\n");

        Road road = new Road("дорожка");
        kaligula = new Donkey(
            "Калигула",
            States.WALK
        );
        kaligula.setLocation(road);
        brikun = new Donkey(
            "Брыкун",
            States.WALK
        );
        brikun.setLocation(road);
        pegasik = new Donkey(
            "Пегасик",
            "не чистокровный осёл",
            States.WALK
        );
        pegasik.setLocation(road);
        donkeys = new KnownGroup(
            "три осла",
            "два осла и лошак",
            States.WALK,
            new ArrayList<Character>(Arrays.asList(
                kaligula,
                brikun,
                pegasik
            ))
        );
        donkeys.setLocation(road);
        donkeys.action(
            Actions.APPEAR,
            new Behavior[] {},
            new Text[] {Text.THIS_TIME, Text.IN_THE_FAR},
            Relatives.ON
        );
        comma.print();
        or.print();
        comma.print();
        Connections.RIGHTLY_TO_SAY.print();
        comma.print();
        donkeys.printName_2();
        comma.print();
        pegasik.action(
            Actions.WAS,
            new Behavior[] {Behavior.WITHOUT_NAME, Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.THIRD}
        );
        pegasik.printName_2();
        full_stop.print();
        donkeys.move(
            new Behavior[] {},
            new Text[] {Text.ONE_AFTER_OTHER}
        );
        comma.print();
        donkeys.action(
            Actions.KNOCK_WITH_HOOF,
            new Behavior[] {Behavior.WITHOUT_NAME, Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.QUIETLY}
        );
        comma.print();
        donkeys.action(
            Actions.WAVE_TAIL,
            new Behavior[] {Behavior.WITHOUT_NAME, Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.BRISKLY}
        );
        and.print();
        donkeys.action(
            Actions.MOVE_EARS,
            new Behavior[] {Behavior.WITHOUT_NAME, Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.GENIALLY}
        );
        full_stop.print();
        cleaner = new Cleaner(
            "уборщица",
            States.WALK
        );
        HandScarf white_hand_scarf = new HandScarf("белый платочек");
        cleaner.addItem(white_hand_scarf);
        cleaner.setEquipped(0);
        cleaner.move(
            new Behavior[] {},
            new Text[] {Text.RIGHT_BEHIND_THEM}
        );
        comma.print();
        cleaner.printEquipped();
        full_stop.print();
    }


    private static void part_3() {
        if (debug) System.out.println("\n\nЧасть 3 (8)\n");

        pegasik.move(
            new Behavior[] {},
            new Text[] {Text.RIGHT_BEHIND}
        );
        kaligula.printName_1();
        and.print();
        brikun.printName_1();
        comma.print();
        pegasik.action(
            Actions.UNDERSTAND,
            new Behavior[] {Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.AS_IF}
        );
        comma.print();
        Connections.THAT.print();
        they_four.action(
            Actions.TALK_ABOUT,
            new Behavior[] {Behavior.USE_SECOND_NAME},
            new Text[] {}
        );
        pegasik.printName_1();
        full_stop.print();
        pegasik.action(
            Actions.LOWER_HEAD,
            new Behavior[] {},
            new Text[] {}
        );
        and.print();
        Connections.ONLY.print();
        pegasik.action(
            Actions.BLINK_EYES,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {Text.WITH, Text.INNOCENT_LOOK}
        );
        full_stop.print();
    }


    private static void part_4() {
        if (debug) System.out.println("\n\nЧасть 4 (6)\n");

        Fence fence = new Fence("загородка");
        cleaner.move_to(
            new Behavior[] {},
            new Text[] {},
            Relatives.TOWARDS,
            fence
        );
        full_stop.print();
        Gate gate = new Gate("калитка");
        cleaner.action(
            Actions.OPEN,
            new Behavior[] {Behavior.ITEM_AFTER_ACTION},
            new Text[] {},
            gate
        );
        and.print();
        donkeys.move_to(
            new Behavior[] {Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.FORCED},
            Relatives.BEHIND,
            fence
        );
        full_stop.print();
    }


    private static void part_5() {
        if (debug) System.out.println("\n\nЧасть 5 (4)\n");

        wizard.sayBefore(
            "",
            new Behavior[] {},
            new Text[] {}
        );
        and.print();
        wizard.startStand(
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {},
            Relatives.FROM
        );
        and.print();
        Exit exit_from_zoo = new Exit("выход из зоопарка");
        wizard.startWalk(
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {},
            Relatives.TOWARDS,
            exit_from_zoo
        );
        full_stop.print();
        they_three = new KnownGroup(
            "они",
            "ними",
            States.SIT,
            new ArrayList<Character>(Arrays.asList(
                stupid,
                button,
                motley
            ))
        );
        they_three.forEach(
            States.STAND,
            new Behavior[] {Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.ALSO}
        );
        and.print();
        they_three.action(
            Actions.HURRY,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {},
            Relatives.TOWARDS,
            exit_from_zoo
        );
        full_stop.print();
        Street street = new Street("улица");
        they_four.move_to(
            new Behavior[] {},
            new Text[] {},
            Relatives.ON,
            street
        );
        comma.print();
        they_four.action(
            Actions.SAW,
            new Behavior[] {},
            new Text[] {}
        );
        comma.print();
        Connections.THAT.print();
        UnknownGroup a_lot_of_people = new UnknownGroup(
            "полно прохожих",
            "все",
            States.STAND,
            "несчётное число прохожих"
        );
        a_lot_of_people.action(
            Actions.WAS,
            new Behavior[] {},
            new Text[] {Text.AROUND}
        );
        full_stop.print();
        plot = new Plot(States.STAND);
        plot.action(
            Actions.SEEM,
            new Behavior[] {},
            new Text[] {}
        );
        comma.print();
        Connections.THAT.print();
        a_lot_of_people.move_to(
            new Behavior[] {Behavior.USE_SECOND_NAME, Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.THIS_DAY},
            Relatives.ON,
            street
        );
        and.print();
        no_one.action(
            Actions.WANT,
            new Behavior[] {Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.NOT}
        );
        no_one.action(
            Actions.STAY_AT_HOME,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {}
        );
        full_stop.print();
        street.PlayMusic(Relatives.ON);
        comma.print();
        a_lot_of_people.action(
            Actions.SING,
            new Behavior[] {Behavior.USE_SECOND_NAME, Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.AROUND}
        );
        comma.print();
        a_lot_of_people.action(
            Actions.PRODUCE,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {Text.FUNNY_VOICES}
        );
        and.print();
        a_lot_of_people.action(
            Actions.PRODUCE,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {Text.HAPPY_LAUGH}
        );
        full_stop.print();
    }


    private static void part_6() {
        if (debug) System.out.println("\n\nЧасть 6 (2)\n");

        CrossRoad cross_road = new CrossRoad("перекрёсток");
        they_four.move_to(
            new Behavior[] {Behavior.USE_SECOND_NAME},
            new Text[] {},
            Relatives.TOWARDS,
            cross_road
        );
        and.print();
        they_four.action(
            Actions.SAW,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {}
        );
        swarm = new UnknownGroup(
            "толпа коротышек",
            "стоявшие снизу",
            States.STAND,
            "несчётное число коротышек"
        );
        House corner_house = new House("угловой дом");
        swarm.setLocation(corner_house);
        swarm.move(
            new Behavior[] {},
            new Text[] {},
            Relatives.NEAR
        );
        full_stop.print();
        UnknownGroup some_smalls = new UnknownGroup(
            "несколько малышей и малышек",
            "они",
            States.STAND,
            "счётное множество коротышек"
        );
        some_smalls.move(
            new Behavior[] {},
            new Text[] {Text.WITH, Text.BIG_BASKETS, Text.UP},
            Relatives.ON,
            corner_house
        );
        full_stop.print();
        something = new AbstractItem("что-то");
        some_smalls.action(
            Actions.TAKE_FROM,
            new Behavior[] {Behavior.USE_SECOND_NAME, Behavior.ITEM_AFTER_ACTION},
            new Text[] {},
            something
        );
        and.print();
        some_smalls.action(
            Actions.THROW_TO,
            new Behavior[] {Behavior.WITHOUT_NAME, Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.HAND_FULL}
        );
        swarm.printName_1();
        full_stop.print();
        they_four.action(
            Actions.GET_CLOSER,
            new Behavior[] {Behavior.USE_SECOND_NAME},
            new Text[] {}
        );
        and.print();
        they_four.action(
            Actions.SAW,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {}
        );
        comma.print();
        Connections.THAT.print();
        Gloves gloves = new Gloves("рукавички");
        gloves.fall(
            new Behavior[] {Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.UP}
        );
        full_stop.print();
        gloves.print();
        plot.action(
            Actions.WAS,
            new Behavior[] {},
            new Text[] {Text.DIFFERENT}
        );
        Connections.COLON.print();
        gloves.listColors();
        full_stop.print();
        swarm.action(
            Actions.GRAB,
            new Behavior[] {Behavior.USE_SECOND_NAME},
            new Text[] {Text.THEM, Text.IN_FLIGHT}
        );
        comma.print();
        swarm.action(
            Actions.RAISE,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {Text.FROM_GROUND}
        );
        comma.print();
        swarm.action(
            Actions.EQUIP_HANDS,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {}
        );
        and.print();
        swarm.action(
            Actions.START_EXCHANGE,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {Text.BETWEEN_EACH_OTHER}
        );
        comma.print();
        swarm.action(
            Actions.TRYING_PICK_A_PAIR,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {Text.ONE_COLOR}
        );
        full_stop.print();
    }


    private static void part_7() {
        if (debug) System.out.println("\n\nЧасть 7 (1)\n");

        Corner next_corner = new Corner("следующей угол");
        wizard.startStand(
            new Behavior[] {Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.SUDDENLY},
            Relatives.ON,
            next_corner
        );
        and.print();
        wizard.sayAfter(
            "",
            new Behavior[] {Behavior.MODS_BEFORE_ACTION, Behavior.WITHOUT_NAME},
            new Text[] {Text.QUIETLY}
        );
        full_stop.print();
        they_three.forEach(
            States.STAND,
            new Behavior[] {},
            new Text[] {}
        );
        full_stop.print();
        Pavement middle_of_pavement = new Pavement("середина тротуара");
        UnknownGroup two_smalls = new UnknownGroup(
            "малыш и малышка",
            "они",
            States.STAND,
            "конечное количество коротышек"
            );
        two_smalls.setLocation(middle_of_pavement);
        two_smalls.move(
            new Behavior[] {},
            new Text[] {},
            Relatives.ON
        );
        Text.RIGHT_IN_FRONT_OF.print();
        they_three.printName_2();
        full_stop.print();
        two_smalls.action(
            Actions.HOLD_HANDS,
            new Behavior[] {Behavior.MODS_BEFORE_ACTION, Behavior.USE_SECOND_NAME},
            new Text[] {Text.STRONGLY}
        );
        comma.print();
        two_smalls.action(
            Actions.WATCH_ON,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {Text.EACH_OTHER}
        );
        comma.print();
        two_smalls.action(
            Actions.LAYING_EYES,
            new Behavior[] {Behavior.WITHOUT_NAME, Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.NOT}
        );
        comma.print();
        and.print();
        two_smalls.action(
            Actions.RECOGNIZE,
            new Behavior[] {Behavior.WITHOUT_NAME, Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.NOTHING_AND_NO_ONE, Text.AROUND, Text.NOT}
        );
        full_stop.print();
    }


    private static void part_8() {
        if (debug) System.out.println("\n\nЧасть 8 (3)\n");

        something.startFall(
            new Behavior[] {},
            new Text[] {Text.FROM_ABOVE}
        );
        comma.print();
        and.print();
        swarm.action(
            Actions.RUSH_TO_PICK_UP,
            new Behavior[] {Behavior.ITEM_AFTER_ACTION},
            new Text[] {},
            gloves
        );
        full_stop.print();
        they_three.forEach(
            Actions.KNOCKED_DOWN,
            new Behavior[] {Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.ALMOST}
        );
        full_stop.print();
        they_three.action(
            Actions.LEAVE_SWARM,
            new Behavior[] {Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.WITH_BIG_WORK}
        );
        comma.print();
        Connections.BUT.print();
        they_three.action(
            Actions.GRAB,
            new Behavior[] {},
            new Text[] {Text.ANYWAY, Text.TWO_GLOVE_EACH}
        );
        full_stop.print();
        AbstractPlace further = new AbstractPlace("подальше");
        they_three.run_to(
            new Behavior[] {},
            new Text[] {},
            Relatives.TOWARDS,
            further
        );
        and.print();
        they_three.action(
            Actions.START_REVIEWING,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {Text.LOOT}
        );
        full_stop.print();
        stupid.obtainItem(new Glove("рукавичка", Colors.BROWN));
        and.print();
        stupid.obtainItem(new Glove("рукавичка", Colors.ORANGE));
        full_stop.print();
        button.obtainItem(new Glove("рукавичка", Colors.YELLOW));
        and.print();
        button.obtainItem(new Glove("рукавичка", Colors.PINK));
        full_stop.print();
        motley.obtainItem(new Glove("рукавичка", Colors.BLUE));
        and.print();
        motley.obtainItem(new Glove("рукавичка", Colors.WHITE));
        full_stop.print();
    }


    private static void part_9() {
        if (debug) System.out.println("\n\nЧасть 9 (5)\n");

        Small first_small = new Small(
            "один малыш", 
            States.WALK,
            new ArrayList<Item>(Arrays.asList(
                new Glove("рукавичка", Colors.GREEN)
            ))
        );
        Small second_small = new Small(
            "другой малыш", 
            States.WALK,
            new ArrayList<Item>(Arrays.asList(
                new Glove("рукавичка", Colors.LIGHT_BLUE)
            ))
        );
        Small smally = new Small(
            "какая-то малышка", 
            States.WALK,
            new ArrayList<Item>(Arrays.asList(
                new Glove("рукавичка", Colors.RED)
            ))
        );
        KnownGroup smalls = new KnownGroup(
            "несколько коротышек",
            States.WALK,
            new ArrayList<Character>(Arrays.asList(
                first_small,
                second_small,
                smally
            ))
        );
        smalls.action(
            Actions.RUN_CLOSER,
            new Behavior[] {Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.SUDDENLY, Text.WITH_LAUGH}
        );
        and.print();
        smalls.action(
            Actions.START_EXCHANGE,
            new Behavior[] {Behavior.WITHOUT_NAME, Behavior.ITEM_AFTER_ACTION},
            new Text[] {},
            gloves
        );
        full_stop.print();
        first_small.exchange(stupid, 0, 1);
        comma.print();
        second_small.exchange(stupid, 0, 0);
        comma.print();
        smally.exchange(stupid, 0, 0);
        full_stop.print();
    }


    private static void part_10() {
        if (debug) System.out.println("\n\nЧасть 10 (7)\n");

        Small knop_two_smalls = new Small(
            "двое малышей",
            States.WALK,
            new ArrayList<Item>(Arrays.asList(
                new Glove("рукавичка", Colors.BLUE),
                new Glove("рукавичка", Colors.GREEN)
            ))
        );
        knop_two_smalls.exchange(button, 0, 0);
        comma.print();
        knop_two_smalls.exchange(button, 1, 1);
        full_stop.print();
        motley.action(
            Actions.FEEL,
            new Behavior[] {},
            new Text[] {Text.RESENTMENT}
        );
        comma.print();
        Connections.BECAUSE.print();
        no_one.action(
            Actions.WANT,
            new Behavior[] {Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.EXCHANGE, Text.NOT}
        );
        full_stop.print();
    }


    private static void part_11() {
        if (debug) System.out.println("\n\nЧасть 11 (9)\n");

        stupid.action(
            Actions.SAW,
            new Behavior[] {},
            new Text[] {}
        );
        comma.print();
        Connections.THAT.print();
        Policeman svist = new Policeman(
            "милиционер",
            "Свистулькин",
            States.WALK,
            new ArrayList<Item> (Arrays.asList(
                new Glove("рукавичка", Colors.WHITE),
                new Glove("рукавичка", Colors.RED),
                new Helmet("новая блестящая каска")
            ))
        );
        svist.setEquipped(2);
        svist.action(
            Actions.CLOSER,
            new Behavior[] {},
            new Text[] {}
        );
        full_stop.print();
        svist.printEquipped();
        full_stop.print();
        stupid.action(
            Actions.CONVINCE,
            new Behavior[] {},
            new Text[] {}
        );
        comma.print();
        Connections.THAT.print();
        svist.action(
            Actions.WAS,
            new Behavior[] {},
            new Text[] {}
        );
        svist.introduce();
        full_stop.print();
        stupid.action(
            Actions.OPEN_MOUTH,
            new Behavior[] {},
            new Text[] {Text.SURPRISED}
        );
        comma.print();
        and.print();
        stupid.action(
            Actions.REMAIN,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {}
        );
        comma.print();
        Connections.A.print();
        svist.action(
            Actions.WENT_STRAIGHT_TO,
            new Behavior[] {Behavior.USE_SECOND_NAME},
            new Text[] {}
        );
        stupid.printName_1();
        and.print();
        svist.action(
            Actions.START_INSPECT,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {Text.FROM_FEET_TO_HEAD}
        );
        full_stop.print();
        stupid.action(
            Actions.SEEMED,
            new Behavior[] {},
            new Text[] {Text.THAT, Text.EXTRA_ATTENTIVELY}
        );
        svist.action(
            Actions.INSPECT,
            new Behavior[] {Behavior.USE_SECOND_NAME, Behavior.ITEM_AFTER_ACTION},
            new Text[] {},
            new Trousers("жёлтые брюки")
        );
        full_stop.print();
        stupid.action(
            Actions.FROZE,
            new Behavior[] {},
            new Text[] {Text.FROM_FEAR}
        );
        and.print();
        stupid.action(
            Actions.WAS_READY_TO_MAKE_STREKACH,
            new Behavior[] {Behavior.WITHOUT_NAME, Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.ALREADY}
        );
        comma.print();
        Connections.BUT.print();
        svist.action(
            Actions.WATCH_CLOSER,
            new Behavior[] {},
            new Text[] {Text.ON_HANDS}
        );
        comma.print();
        Connections.ON_WHICH.print();
        svist.describeInventory();
        and.print();
        AbstractPlace motley_location = new AbstractPlace("Пёстренький");
        svist.move_to(
            new Behavior[] {Behavior.MODS_BEFORE_ACTION},
            new Text[] {Text.QUICKLY},
            Relatives.TOWARDS,
            motley_location
        );
        comma.print();
        svist.exchange(motley, 1, 1);
        full_stop.print();
        svist.describeInventory();
        full_stop.print();
        svist.action(
            Actions.PULL,
            new Behavior[] {Behavior.USE_SECOND_NAME},
            new Text[] {Text.THEM, Text.NOT, Text.HURRY, Text.ON_HANDS}
        );
        comma.print();
        svist.action(
            Actions.STRAIGHTEN,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {Text.AS_IT_SHOULD_BE}
        );
        comma.print();
        svist.action(
            Actions.HANDE_HOCH,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {}
        );
        comma.print();
        svist.action(
            Actions.SMILE,
            new Behavior[] {Behavior.MODS_BEFORE_ACTION, Behavior.WITHOUT_NAME},
            new Text[] {Text.WIDELY}
        );
        and.print();
        svist.action(
            Actions.WENT_HIS_ROAD,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {}
        );
        full_stop.print();
    }


    private static void part_12() {
        if (debug) System.out.println("\n\nЧасть 12 (11)\n");

        Square square = new Square("площадь");
        they_four.move_to(
            new Behavior[] {Behavior.MODS_BEFORE_ACTION, Behavior.USE_SECOND_NAME},
            new Text[] {Text.TALKING_THIS_WAY},
            Relatives.ON,
            square
        );
        full_stop.print();
        Cars a_lot_of_cars = new Cars("десятка два или три автомобилей, предназначенных для загородной езды");
        a_lot_of_cars.stand(
            new Behavior[] {},
            new Text[] {},
            Relatives.ON,
            square
        );
        full_stop.print();
    }


    private static void part_13() {
        if (debug) System.out.println("\n\nЧасть 13 (13)\n");

        Car last_car = new Car("крайняя машина");
        wizard.move_to(
            new Behavior[] {},
            new Text[] {},
            Relatives.TOWARDS,
            last_car
        );
        comma.print();
        wizard.action(
            Actions.PUT_HANDS,
            new Behavior[] {Behavior.WITHOUT_NAME},
            new Text[] {Text.IN_HOLE, Text.BEHIND_RADIATOR}
        );
        and.print();
        PaperSign paper_sign = new PaperSign("картонная табличка");
        paper_sign.setPainting("карта страны коротышек");
        wizard.action(
            Actions.PULL_OUT,
            new Behavior[] {Behavior.ITEM_AFTER_ACTION, Behavior.WITHOUT_NAME},
            new Text[] {},
            paper_sign
        );
        full_stop.print();
        paper_sign.describePainting();
        full_stop.print();
        Town flower_town = new Town("Цветочный город");
        Town sunny_town = new Town("Солнечный город");
        wizard.action(
            Actions.FIND,
            new Behavior[] {},
            new Text[] {}
        );
        flower_town.print();
        and.print();
        paper_sign.paintWithPencil(
            "путь по дорогам, которые вели" + 
            " " + Relatives.FROM.getText() +  
            " " + sunny_town.getName() + 
            " " + Relatives.TOWARDS.getText() + 
            " " + flower_town.getName()
        );
        comma.print();
        wizard.action(
            Actions.PUT,
            new Behavior[] {Behavior.ITEM_AFTER_ACTION, Behavior.WITHOUT_NAME},
            new Text[] {Text.IN_PLACE},
            paper_sign
        );
        comma.print();
        and.print();
        wizard.sayAfter(
            "", 
            new Behavior[] {Behavior.WITHOUT_NAME}, 
            new Text[] {}
        );
        full_stop.print();
    }


    public static void main(String[] args){
        if (args.length >= 1 && args[0].equals("-d")) debug = true;
        
        try {
            part_1();
            part_2();
            part_3();
            part_4();
            part_5();
            part_6();
            part_7();
            part_8();
            part_9();
            part_10();
            part_11();
            part_12();
            part_13();
        }
        catch (NoLocationException | IncorrectSlotException e) {
            System.err.println("\n\nВозникла ошибка: " + e);
        }
    }
}
