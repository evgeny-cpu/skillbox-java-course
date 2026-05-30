package ConsoleCustomerList.exception;

public class DuplicateCustomerException extends RuntimeException{
    public DuplicateCustomerException(String text){
        super(text);
    }

}
