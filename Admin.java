import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin extends Akun {

    private String fileName = "Admin/AkunAdmin.txt";

    @Override
    public void saveToTextFile(String username, String password) {
        return;
    }

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

