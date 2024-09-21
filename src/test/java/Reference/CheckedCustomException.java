package Reference;

// Custom exception extending Exception (checked exception)
public class CheckedCustomException extends Exception {

    // Constructor that accepts an error message
    public CheckedCustomException(String message) {
        super(message);
    }
}
