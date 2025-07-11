import java.util.Scanner;
import java.util.regex.Pattern;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class UserRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Taking user inputs
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            
            System.out.print("Enter your age: ");
            String ageInput = scanner.nextLine();

            // 1. Check if email is valid using regex
            if (!isValidEmail(email)) {
                throw new IllegalArgumentException("Invalid email format!");
            }

            // 2. Try parsing age
            int age = Integer.parseInt(ageInput);

            // 3. Check if age is 18+
            if (age < 18) {
                throw new InvalidAgeException("User must be at least 18 years old to register.");
            }

            System.out.println("Registration successful ✅");

        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number for age!");

        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());

        } finally {
            scanner.close();
            System.out.println("Registration process completed. ✅");
        }
    }

    // Email validation using regex
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return Pattern.matches(emailRegex, email);
    }
}
