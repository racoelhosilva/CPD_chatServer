package exception;

public class ProtocolException extends RuntimeException {
    public ProtocolException() {}

    public ProtocolException(String message) {
        super(message);
    }
}
