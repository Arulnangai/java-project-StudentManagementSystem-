package exception;

public class StudentDoesntExist extends Exception {
    public StudentDoesntExist() {
    }

    public StudentDoesntExist(String message) {
        super(message);
    }

    public StudentDoesntExist(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentDoesntExist(Throwable cause) {
        super(cause);
    }

    public StudentDoesntExist(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
