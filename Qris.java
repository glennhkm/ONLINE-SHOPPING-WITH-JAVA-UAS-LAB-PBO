import java.io.IOException;

/**
 * @author Kelompok 4
 * @version 1.0
 * @since 2023-12-01
 */
public class Qris extends Pembayaran {

    /**
     * Implementation of the payment processing logic using QRIS.
     *
     * @param username   The username of the customer making the payment.
     * @param totalHarga The total price to be paid.
     */
    @Override
    public void prosesPembayaran(String username, int totalHarga) {
        bersihkanConsole();

        // Display QR code
        System.out.println("Kindly scan this QR\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("");

        // Simulate redirection
        for (int i = 0; i <= 10000; i++) {
            if (i / 2000 == 0) {
                continue;
            }
            System.out.print("\rRedirecting ... " + i / 2000);
        }

        // Input QRIS PIN
        System.out.print("\nInput your QRIS PIN: ");
        input.nextInt();

        bersihkanConsole();

        // Display payment information
        System.out.println("=".repeat(10) + " QRIS " + "=".repeat(10));
        System.out.println("\nPayment Information\n");
        System.out.println("Username on marketplace: " + username);
        System.out.println("Total: " + totalHarga);
        System.out.println("");
        System.out.println("=".repeat(26));
    }
}
