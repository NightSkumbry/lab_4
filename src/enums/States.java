package enums;

public enum States {
    WALK("шёл", "пошёл"),
    STAND("стоял", "встал"),
    SIT("сидел", "сел");


    private final String in_action, start_action;
    
    States(String in_action, String start_action) {
        this.in_action = in_action;
        this.start_action = start_action;
    }


    public String getInAction() {
        return this.in_action;
    }

    public String getStartAction() {
        return this.start_action;
    }

    public void printInAction() {
        System.out.print(this.in_action + " ");
    }

    public void printStartAction() {
        System.out.print(this.start_action + " ");
    }
}
