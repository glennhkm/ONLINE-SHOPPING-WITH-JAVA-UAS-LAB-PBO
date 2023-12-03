import java.io.IOException;

/**
 * Abstract class representing a generic driver in the marketplace system.
 * Contains common methods and inner interfaces for admin and customer functionalities.
 *
 * @author Kelompok 4
 * @version 1.0
 * @since 2023-12-01
 */
abstract public class Driver {

    /**
     * Clears the console screen.
     * Uses platform-specific commands for clearing the console.
     * Handles IOException and InterruptedException.
     */
    public static void bersihkanConsole() {
        try {
            Process process = new ProcessBuilder("cmd", "/c", "cls", "clear").inheritIO().start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Inner interface representing admin-specific functionalities.
     * AdminDriver interface provides methods for managing users, items, and transactions.
     */
    interface AdminDriver {
        /**
         * Deletes a user from the system.
         */
        void deleteUser();

        /**
         * Adds a new item to the list of available items.
         */
        void addBarang();

        /**
         * Displays the list of available items.
         */
        boolean showBarang();

        /**
         * Edits the details of an existing item.
         */
        void editBarang();

        /**
         * Deletes an item from the list of available items.
         */
        void deleteBarang();

        /**
         * Manages transactions, possibly including approval or rejection.
         */
        void mengaturTransaksi();
    }

    /**
     * Inner interface representing customer-specific functionalities.
     * CustomerDriver interface provides methods for managing items, cart, and transactions for customers.
     */
    interface CustomerDriver {
        /**
         * Displays the list of available items.
         */
        void showBarang();

        /**
         * Adds an item to the customer's shopping cart.
         */
        void masukKeranjang();

        /**
         * Displays the contents of the customer's shopping cart.
         *
         * @return True if the cart is not empty, false otherwise.
         */
        boolean showCart();

        /**
         * Edits the quantity of items in the customer's shopping cart.
         */
        void editCart();

        /**
         * Deletes an item from the customer's shopping cart.
         */
        void deleteCart();

        /**
         * Initiates the checkout process for the items in the cart.
         */
        void checkoutBarang();

        /**
         * Checks and displays the invoices related to the customer's transactions.
         */
        void checkInvoice();
    }

    /**
     * Abstract method to be implemented by subclasses.
     * Represents the main functionality to be executed by the driver.
     */
    public abstract void run();
}
