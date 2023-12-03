 /**
 * @author Your Name
 * @version 1.0
 * @since 2023-12-01
 */
public class Bank extends Pembayaran {
    /**
     * Processes the payment using a bank account.
     * Allows the user to choose a bank, enter their PIN, and displays payment information.
     *
     * @param username   The username on the marketplace.
     * @param totalHarga The total amount to be paid.
     */
    @Override
    public void prosesPembayaran(String username, int totalHarga) {
        String namaBank;
        int bankOption;
        System.out.println("\n1. BSI");
        System.out.println("2. BCA");
        System.out.println("3. BNI");
        System.out.print("\nChoose your bank account: ");
        bankOption = input.nextInt();
        namaBank = (bankOption == 1) ? "BSI" : (bankOption == 2) ? "BCA" : "BNI";
        System.out.print("\nInput your " + namaBank + " PIN: ");
        input.nextInt();
        bersihkanConsole();
        System.out.println("=".repeat(10) + " " + namaBank + " " + "=".repeat(10));
        System.out.println("\nPayment Information\n");
        System.out.println("Username on marketplace: " + username);
        System.out.println("Total: " + totalHarga);
        System.out.println("");
        System.out.println("=".repeat(25));
    }
}
