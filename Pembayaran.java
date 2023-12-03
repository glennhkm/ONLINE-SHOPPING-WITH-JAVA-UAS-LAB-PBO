import java.io.IOException;
import java.util.Scanner;

/**
 * @author Kelompok 4
 * @version 1.0
 * @since 2023-12-01
 */
abstract public class Pembayaran {

    /** Scanner for user input. */
    Scanner input = new Scanner(System.in);

    /**
     * Abstract method to process payment.
     *
     * @param username   The username of the customer making the payment.
     * @param totalHarga The total price to be paid.
     */
    abstract public void prosesPembayaran(String username, int totalHarga);

    /**
     * Clears the console screen.
     * Note: This method might not work on all systems.
     * It is recommended to use it with caution.
     */
    public static void bersihkanConsole() {
        try {
            // Clear console based on the operating system.
            Process process = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
            // For Linux or MacOS, use "clear" instead of "cls".
            // Process process = new ProcessBuilder("clear").inheritIO().start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
