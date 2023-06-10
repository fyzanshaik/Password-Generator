import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The PasswordGeneratorApp class provides a command-line interface for generating passwords.
 * It interacts with the user to obtain the desired number of characters and character choice,
 * and then utilizes the PasswordGenerator class to generate the password.
 */
public class PasswordGeneratorApp {

    /**
     * The main method of the PasswordGeneratorApp.
     * It obtains user input, generates the password, and displays it to the user.
     * @param args The command-line arguments (unused)
     */
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        Scanner scanner = new Scanner(System.in);

        int letters = getInputCharacterCount(scanner);
        char choice = getInputCharacterChoice(scanner);

        StringBuilder password = passwordGenerator.generator(letters, choice);
        System.out.println(password);
    }

    /**
     * Obtains the desired number of characters for the password from the user.
     * Validates the input and keeps asking until a valid number is provided.
     * @param scanner The Scanner object to read user input
     * @return The number of characters for the password
     */
    private static int getInputCharacterCount(Scanner scanner) {
        int count = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("How many characters do you need?: ");
                count = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        return count;
    }

    /**
     * Obtains the desired character choice for the password from the user.
     * Validates the input and keeps asking until a valid choice is provided.
     * @param scanner The Scanner object to read user input
     * @return The character choice for the password
     */
    private static char getInputCharacterChoice(Scanner scanner) {
        char choice = '\0';
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Would you like only alphabets(A)/symbols(B) or both(C): ");
                String input = scanner.next();
                choice = input.charAt(0);
                validInput = true;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Invalid input. Please enter a valid choice.");
            }
        }

        return choice;
    }
}
