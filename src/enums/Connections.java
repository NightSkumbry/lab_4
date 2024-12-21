package enums;

public enum Connections {
    AND("и"),
    COMMA(","),
    OR("или"),
    FULL_STOP("."),
    COLON(":"),
    RIGHTLY_TO_SAY("вернее сказать"),
    THAT("что"),
    ONLY("только"),
    BECAUSE("потому что"),
    A("а"),
    ON_WHICH("на которых"),
    BUT("но");


    private final String text;

    Connections(String text) {
        this.text = text;
    }

    public void print() {
        System.out.print(this.text + " ");
    }
}
