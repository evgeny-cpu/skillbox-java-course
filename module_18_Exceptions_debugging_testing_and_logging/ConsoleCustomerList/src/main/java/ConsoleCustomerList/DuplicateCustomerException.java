package ConsoleCustomerList;

public class DuplicateCustomerException extends RuntimeException{
    public DuplicateCustomerException(String text){
        super(text);
    }
}
