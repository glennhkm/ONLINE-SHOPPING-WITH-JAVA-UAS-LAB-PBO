import java.util.List;

public abstract class Akun {

    public abstract void saveToTextFile(String username, String password);

  // // Menentukan nama file untuk menyimpan data pengguna

  // try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
  //     // Menulis username dan password ke dalam file
  //     writer.println("Username: " + username);
  //     writer.println("Password: " + password);
  //     writer.println(); // Tambahkan baris kosong antara setiap entri pengguna
  //     System.out.println("User data has been saved to " + fileName);

  // } catch (IOException e) {
  //     e.printStackTrace();
  // }

    public abstract List<String> readCustomerAccounts();

  // List<String> accounts = new ArrayList<>();

  // try(Scanner scanner = new Scanner(new File(fileName))) {
  //     while(scanner.hasNextLine()) {
  //         String username = scanner.nextLine().split(":")[1].trim();
  //         String password = scanner.nextLine().split(":")[1].trim();

  //         accounts.add(username);
  //         accounts.add(password);

  //         scanner.nextLine();
  //     }

  // } catch (FileNotFoundException e) {
  //     e.printStackTrace();
  // }

  // return accounts;

    public abstract boolean validateSignIn(String username, String password);

  // List<String> accounts = readCustomerAccounts();

  // for(int i = 0; i < accounts.size(); i += 2) {
  //     String uname = accounts.get(i);
  //     String pword = accounts.get(i + 1);

  //     if(username.equals(uname) && password.equals(pword)) {
  //         return true;
  //     }
  // }
  // return false;
    public abstract int validateSignUp(String username, String password);
}
