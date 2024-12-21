package items;

import items.interfaces.ICanBePainted;

public class PaperSign extends Item implements ICanBePainted {
    private String painting = "";


    public PaperSign() {
        super();
    }

    public PaperSign(String name) {
        super(name);
    }


    @Override
    public void setPainting(String description) {
        this.painting = description;
    }

    @Override
    public void describePainting() {
        System.out.print("на " + this.getName() + " нарисовано " + this.painting + " ");
    }

    @Override
    public void paintWithPencil(String description) {
        this.setPainting(description);
        System.out.print("начертил на " + this.getName() + " карандашом " + description + " ");
    }
}
