package PSIO11.zad3;

public class IncorrectAmountException extends RuntimeException {
    public IncorrectAmountException(String message) {
        super(message + "\n");
    }
}
