package ConsoleCustomerList.exception;

public class InvalidCommandFormatException extends RuntimeException {
    public InvalidCommandFormatException(String text) {
        super(text);
    }
}