package Reference;

import org.testng.annotations.Test;

public class CheckException {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Access granted.");
        }
    }
        @Test
        void test(){
            try {
                checkAge(16);  // This will throw the custom exception
            } catch (InvalidAgeException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }

}
