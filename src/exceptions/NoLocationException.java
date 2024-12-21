package exceptions;

public class NoLocationException extends RuntimeException {
    public NoLocationException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Ошибка: Отсутствует место действия! " + super.getMessage();
    }
}
