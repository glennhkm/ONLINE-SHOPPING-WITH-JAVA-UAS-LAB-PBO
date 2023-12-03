/**
 * @author Kelompok 4
 * @version 1.0
 * @since 2023-12-01
 */
public class COD extends Pembayaran {

    /**
     * Processes the payment using Cash On Delivery (COD).
     * Displays a redirecting message, payment information, and a success message.
     *
     * @param username   The username on the marketplace.
     * @param totalHarga The total amount to be paid.
     */
    @Override
    public void prosesPembayaran(String username, int totalHarga) {
        System.out.println("\n=> Requesting Cash On Delivery payment method . . .\n");

        for(int i = 0; i <= 100000; i++){
            if(i/20000 == 0){
                continue;
            }
            System.out.print("\rRedirecting ... " + i/20000);
        }
        bersihkanConsole();

        System.out.println("=".repeat(10) + " Cash On Delivery " + "=".repeat(10));
        System.out.println("\nPayment Information\n");
        System.out.println("Username on marketplace: " + username);
        System.out.println("Total: " + totalHarga);
        System.out.println("");
        System.out.println("=".repeat(39));
        System.out.println("\n=> Cash On delivery payment method requested successfully");
    }
}
