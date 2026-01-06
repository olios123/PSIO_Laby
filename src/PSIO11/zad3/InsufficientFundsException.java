package PSIO11.zad3;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message + "\n");
    }
}
