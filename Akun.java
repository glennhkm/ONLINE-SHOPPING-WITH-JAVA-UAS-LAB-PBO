import java.util.List;

/**
* @author Kelompok4
 * @version 1.0
 * @since 2023-12-01
 */
abstract public class Akun {

    /**
     * Saves the user account information to a text file.
     *
     * @param username The username of the user.
     * @param password The password of the user.
     */
    public abstract void saveToTextFile(String username, String password);

    /**
     * Reads and returns a list of customer accounts from a data source.
     *
     * @return A list containing customer account information.
     */
    public abstract List<String> readCustomerAccounts();

    /**
     * Validates the sign-in credentials for a user.
     *
     * @param username The username entered for sign-in.
     * @param password The password entered for sign-in.
     * @return True if the provided credentials are valid, false otherwise.
     */
    public abstract boolean validateSignIn(String username, String password);

    /**
     * Validates the sign-up credentials for a new user.
     *
     * @param username The username entered for sign-up.
     * @param password The password entered for sign-up.
     * @return An integer code indicating the result of the validation:
     *         - 0: Sign-up successful.
     *         - 1: Username already exists.
     *         - 2: Other validation failure.
     */
    public abstract int validateSignUp(String username, String password);
}
