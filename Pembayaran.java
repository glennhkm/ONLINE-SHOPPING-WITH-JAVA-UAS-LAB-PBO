import java.util.Scanner;

public class Pembayaran {
    Bank bank = new Bank("123", "123");
    public void pilihMetodePembayaran() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-------------------------------------");
        System.out.println("======PILIH METODE PEMBAYARAN========");
        System.out.println("Menu:");
        System.out.println("1. BANK");
        System.out.println("2. QRIS");
        System.out.println("3. COD");
        System.out.println("4. Keluar dari metode pembayaran");
        System.out.print("\nPilihan anda (1-4): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Move scanner to the next line

        switch (choice) {
            case 1:
                bank.bayarViaBank();
                break;
            case 2:
                // Implementasi pilihan QRIS di sini, jika perlu
                break;
            case 3:
                // Implementasi pilihan COD di sini, jika perlu
                break;
            case 4:
                System.out.println("\nAnda keluar dari metode pembayaran!");
                break;
            default:
                System.out.println("\nPilihan anda tidak valid! Silahkan coba lagi!");
                break;
        };
        
    }
}





