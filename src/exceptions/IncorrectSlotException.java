package exceptions;

public class IncorrectSlotException extends RuntimeException {
    public IncorrectSlotException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Ошибка: Отсутствует место действия! " + super.getMessage();
    }
}
