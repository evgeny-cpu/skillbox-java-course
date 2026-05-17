package ConsoleCustomerList;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String text) {
        super(text);
    }
}
