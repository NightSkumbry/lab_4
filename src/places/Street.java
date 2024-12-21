package places;

import enums.Relatives;
import places.interfaces.IPlayMusic;

public class Street extends Place implements IPlayMusic{
    public Street() {
        super();
    }

    public Street(String name) {
        super(name);
    }


    @Override
    public void PlayMusic(Relatives relative) {
        relative.print();
        this.print();
        System.out.print("играла музыка ");
    }
}
