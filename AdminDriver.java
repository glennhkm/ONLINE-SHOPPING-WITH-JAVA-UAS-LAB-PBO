import java.io.IOException;
import java.util.Scanner;

public class AdminDriver extends Driver {
    // Scanner input = new Scanner(System.in);

    public static void bersihkanConsole() {
        try {
            Process process = new ProcessBuilder("cmd", "/c", "cls", "clear").inheritIO().start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run(){
        System.out.println("\nWELCOME ADMIN");
        adminEdit();

    }
    @Override
    public void customerChoice() {
        // TODO Auto-generated method stub
        return;
    
    }
    
    private void tambahBarangMenu() {
    
    }

    private void hapusBarangMenu() {

    }

    private void editBarangMenu() {

    }

    private void terimaTransaksiMenu() {

    }
    public void adminEdit(){
        try (Scanner s = new Scanner(System.in)) {
            int adminpilih;
            while(true){
                try {
                    System.out.println("Menu:");
                    System.out.println("1. Tambah Barang");
                    System.out.println("2. Hapus Barang");
                    System.out.println("3. Edit Barang");
                    System.out.println("4. Terima Transaksi");
                    System.out.println("5. Log out");
                    System.out.print("Pilih aksi (1-5): ");
                    
                    adminpilih = s.nextInt();
                    s.nextLine(); // Membersihkan newline setelah nextInt

                    switch (adminpilih) {
                        case 1:
                            // Tambah Barang
                            tambahBarangMenu();
                            break;
                        case 2:
                            // Hapus Barang
                            hapusBarangMenu();
                            break;
                        case 3:
                            // Edit Barang
                            editBarangMenu();
                            break;
                        case 4:
                            // Terima Transaksi
                            terimaTransaksiMenu();
                            break;
                        case 5:
                            System.out.println("Anda telah Log Out dari akun anda");
                            return;
                        default:
                            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    }
                } catch (Exception e) {
                    System.out.println("Terjadi kesalahan: " + e.getMessage());
                    s.nextLine(); // Membersihkan buffer input setelah terjadi pengecualian
                }
            }
        }
    }

}
