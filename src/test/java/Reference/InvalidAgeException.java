package Reference;

// Custom exception extending Exception (checked exception)
public class InvalidAgeException extends Exception {

    // Constructor that accepts an error message
    public InvalidAgeException(String message) {
        super(message);
    }
}
