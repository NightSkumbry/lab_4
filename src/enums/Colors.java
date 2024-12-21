package enums;

public enum Colors {
    WHITE("белая"),
    BLUE("синяя"),
    RED("красная"),
    GREEN("зелёная"),
    BROWN("коричневая"),
    ORANGE("оранжевая"),
    YELLOW("жёлтая"),
    LIGHT_BLUE("голубая"),
    PINK("розовая");


    private final String text;

    Colors(String text) {
        this.text = text;
    }


    public String getText() {
        return this.text;
    }

    public void print() {
        System.out.print(this.text + " ");
    }
}
