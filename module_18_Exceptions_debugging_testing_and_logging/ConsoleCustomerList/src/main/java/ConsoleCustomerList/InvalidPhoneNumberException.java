package ConsoleCustomerList;

public class InvalidPhoneNumberException extends RuntimeException {
    public InvalidPhoneNumberException(String text){
        super(text);
    }
}
