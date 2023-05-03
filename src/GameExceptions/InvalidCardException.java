package GameExceptions;
import card.*;
public class InvalidCardException extends RuntimeException {
    String message;
    boolean validCard;
    Card card;
    public InvalidCardException(String message) {

        super(message);
    }
}
