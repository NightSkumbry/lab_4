package enums;

public enum Relatives {
    ON("на"),
    ABOUT("о"),
    TOWARDS("к"),
    BEHIND("за"),
    FROM("с"),
    NEAR("у");


    private final String text;

    Relatives(String text) {
        this.text = text;
    }


    public String getText() {
        return this.text;
    }

    public void print() {
        System.out.print(this.text + " ");
    }
}
