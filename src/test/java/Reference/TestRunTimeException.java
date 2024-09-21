package Reference;

import org.testng.annotations.Test;

public class TestRunTimeException {
    public static void validateUsername(String username) {
        if (username == null || username.isEmpty()) {
            throw new UnCheckedException("Username cannot be empty or null.");
        } else {
            System.out.println("Valid username.");
        }
    }

    @Test
    void test(){
        try {
            validateUsername("");  // Throws unchecked exception
        } catch (UnCheckedException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
