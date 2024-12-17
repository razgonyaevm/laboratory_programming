package lab3.exceptions;

public class RemovingException extends Exception {
    public RemovingException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
