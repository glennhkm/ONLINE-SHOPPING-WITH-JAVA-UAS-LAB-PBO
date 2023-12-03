import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**

 * @author Kelompok 4
 * @version 1.0
 * @since 2023-12-01
 */
public class Admin extends Akun {

    private String fileName = "Admin/Credentials/AkunAdmin.txt";

    /**
     * Dummy implementation. Admin accounts cannot be created through sign-up.
     *
     * @param username The username of the user.
     * @param password The password of the user.
     */
    @Override
    public void saveToTextFile(String username, String password) {
        return;
    }

    /**
     * Reads and returns a list of customer accounts from the Admin's credentials file.
     *
     * @return A list containing customer account information.
     */
    @Override
    public List<String> readCustomerAccounts() {
        List<String> accounts = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String username = scanner.nextLine().split(":")[1].trim();
                String password = scanner.nextLine().split(":")[1].trim();

                accounts.add(username);
                accounts.add(password);

                scanner.nextLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return accounts;
    }

    /**
     * Validates the sign-in credentials for an Admin user.
     *
     * @param username The username entered for sign-in.
     * @param password The password entered for sign-in.
     * @return True if the provided credentials are valid, false otherwise.
     */
    @Override
    public boolean validateSignIn(String username, String password) {
        List<String> accounts = readCustomerAccounts();

        for (int i = 0; i < accounts.size(); i += 2) {
            String uname = accounts.get(i);
            String pword = accounts.get(i + 1);

            if (username.equals(uname) && password.equals(pword)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Validates the sign-up credentials for an Admin user.
     * Admin accounts cannot be created through sign-up, so always returns 0.
     *
     * @param username The username entered for sign-up.
     * @param password The password entered for sign-up.
     * @return Always returns 0 as Admin accounts cannot be created through sign-up.
     */
    @Override
    public int validateSignUp(String username, String password) {
        List<String> accounts = readCustomerAccounts();

        for (int i = 0; i < accounts.size(); i += 2) {
            String uname = accounts.get(i);

            if (username.equals(uname)) {
                return 0;
            }
        }
        return 1;
    }
}
