package enums.modificators;

public enum Text {
    LONG_WHILE("долго"),
    GOOD("хорошо"),
    THEMSELVES("себя"),
    NOT("не"),
    ALREADY("уже"),
    THIS_TIME("в это время"),
    IN_THE_FAR("вдали"),
    THIRD("третий"),
    ONE_AFTER_OTHER("один за другим"),
    QUIETLY("тихо"),
    BRISKLY("резво"),
    GENIALLY("добродушно"),
    AS_IF("как будто"),
    INNOCENT_LOOK("невинным видом"),
    FORCED("принудительно"),
    ALSO("тоже"),
    RIGHT_BEHIND("следом за"),
    RIGHT_BEHIND_THEM("следом за ними"),
    RIGHT_IN_FRONT_OF("прямо перед"),
    AROUND("вокруг"),
    THIS_DAY("в этот день"),
    FUNNY_VOICES("весёлые голоса"),
    HAPPY_LAUGH("радостный смех"),
    WITH("с"),
    BIG_BASKETS("большие корзины"),
    UP("вверху"),
    HAND_FULL("пригоршнями"),
    DIFFERENT("разные"),
    IN_FLIGHT("на лету"),
    FROM_GROUND("с земли"),
    BETWEEN_EACH_OTHER("между собой"),
    ONE_COLOR("одного цвета"),
    SUDDENLY("неожиданно"),
    STRONGLY("крепко"),
    EACH_OTHER("друг на дружку"),
    NOTHING_AND_NO_ONE("ничего и никого"),
    FROM("с"),
    ALMOST("почти"),
    ANYWAY("всё-таки"),
    TWO_GLOVE_EACH("по две рукавички каждый"),
    WITH_BIG_WORK("с большим трудом"),
    FROM_ABOVE("сверху"),
    FOR_EACH("каждый"),
    LOOT("добычу"),
    WITH_LAUGH("со смехом"),
    RESENTMENT("обиду"),
    EXCHANGE("меняться"),
    TO_THEM("к ним"),
    THIS("это"),
    SURPRISED("от удивления"),
    FROM_FEET_TO_HEAD("с ног до головы"),
    THAT(", что"),
    EXTRA_ATTENTIVELY("особенно внимательно"),
    FROM_FEAR("от страха"),
    QUICKLY("быстро"),
    ON_HANDS("на руки"),
    HURRY("спеша"),
    THEM("их"),
    AS_IT_SHOULD_BE("как следует"),
    WIDELY("широко"),
    HIS_ROAD("своей дорогой"),
    TALKING_THIS_WAY("разговаривая таким образом"),
    IN_HOLE("в щель"),
    BEHIND_RADIATOR("за радиатором"),
    BY_ROADS("по дорогам"),
    THAT_LED("которые вели"),
    BACK("обратно"),
    WHICH("которые"),
    WHERE("где"),
    IN_PLACE("на место");


    private final String text;

    Text(String text) {
        this.text = text;
    }


    public String getText() {
        return this.text;
    }

    public void print() {
        System.out.print(this.text + " ");
    }
}
