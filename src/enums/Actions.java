package enums;

public enum Actions {
    WARM("грелись"),
    JOY("радовались"),
    FEEL("чувствовали"),
    REGRET("жалел"),
    APPEAR("показались"),
    WAS("был"),
    KNOCK_WITH_HOOF("постукивали копытцами"),
    WAVE_TAIL("помахивали хвостом"),
    MOVE_EARS("шевелили ушами"),
    UNDERSTAND("понимал"),
    TALK_ABOUT("говорили о"),
    LOWER_HEAD("опустил голову"),
    BLINK_EYES("помаргивал глазами"),
    HAS("имел"),
    OPEN("отворила"),
    HURRY("поспешили"),
    SAW("увидел"),
    WANT("хотел"),
    STAY_AT_HOME("оставаться дома"),
    SING("пели"),
    PRODUCE("издавали"),
    TAKE_FROM("доставали"),
    THROW_TO("бросали в"),
    GET_CLOSER("подошли ближе"),
    CLOSER("приближается"),
    GRAB("хватали"),
    RAISE("поднимали"),
    EQUIP_HANDS("надевали на руки"),
    START_EXCHANGE("начинали обмениваться"),
    TRYING_PICK_A_PAIR("старались подобрать пару"),
    HOLD_HANDS("держались за руки"),
    WATCH_ON("смотрели"),
    LAYING_EYES("спуская глаз"),
    RECOGNIZE("замечали"),
    RUSH_TO_PICK_UP("бросилась подбирать"),
    KNOCKED_DOWN("был сбит с ног"),
    LEAVE_SWARM("выбрались из толпы"),
    START_REVIEWING("стали рассматривать"),
    RUN_CLOSER("подбежали"),
    CONVINCE("убедился"),
    OPEN_MOUTH("разинул рот"),
    REMAIN("так и остался"),
    WENT_STRAIGHT_TO("направился прямо к"),
    START_INSPECT("принялся осматривать"),
    INSPECT("осмотрел"),
    SEEM("как казалось"),
    SEEMED("показалось"),
    FROZE("похолодел"),
    WAS_READY_TO_MAKE_STREKACH("был готов задать стрекача"),
    WATCH_CLOSER("взглянул"),
    PULL("натянул"),
    STRAIGHTEN("расправил"),
    HANDE_HOCH("приложил руку к козырьку"),
    SMILE("улыбнулся"),
    WENT_HIS_ROAD("отправился своей дорогой"),
    PUT_HANDS("сунул руку"),
    PULL_OUT("вытащил"),
    FIND("нашёл"),
    PUT("сунул");


    private final String text;

    Actions(String text) {
        this.text = text;
    }


    public String getText() {
        return this.text;
    }

    public void print() {
        System.out.print(this.text + " ");
    }
}
