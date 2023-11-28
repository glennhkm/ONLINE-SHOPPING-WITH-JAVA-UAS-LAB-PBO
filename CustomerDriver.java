import java.util.Scanner;

public class CustomerDriver extends Driver {
    public void run(){
        System.out.println("\nWELCOME CUSTOMER");
        customerChoice();
    } 

    @Override
    public void adminEdit() {
        // TODO Auto-generated method stub
        return;
    }
    
    private void lihatListBarang() {
        
        // System.out.println("List Barang yang Dijual:");
        
    }

    private void masukkanBarangKeKeranjang() {
        // Scanner scanner = new Scanner(System.in);
// 
        // System.out.print("Masukkan nama barang yang ingin dimasukkan ke keranjang: ");
        // String barang = scanner.nextLine();
// 
        // 
        // shoppingCart.add(barang);
// 
        // System.out.println("Barang berhasil dimasukkan ke keranjang.");
    }

    private void checkout() {
        
        // transactionHistory.addAll(shoppingCart);
// 
        
        // shoppingCart.clear();
// 
        // System.out.println("Checkout berhasil.");
    }

    private void pilihMetodePembayaran() {
        
        // System.out.println("Pilih metode pembayaran:");
        
    }

    private void lihatHistoryBelanja() {
        
        // System.out.println("History Belanja:");
        // for (String item : transactionHistory) {
            // System.out.println(item);
        // }
    }
    public void customerChoice() {
        try (Scanner scanner = new Scanner(System.in)) {
            int customerPilih;
            while (true) {
                try {
                    System.out.println("Menu Pengguna:");
                    System.out.println("1. Lihat List Barang");
                    System.out.println("2. Masukkan Barang ke Keranjang");
                    System.out.println("3. Checkout");
                    System.out.println("4. Pilih Metode Pembayaran");
                    System.out.println("5. Lihat History Belanja");
                    System.out.println("6. Keluar");
                    System.out.print("Pilih aksi (1-6): ");

                    customerPilih = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan newline setelah nextInt

                    switch (customerPilih) {
                        case 1:
                            lihatListBarang();
                            break;
                        case 2:
                            masukkanBarangKeKeranjang();
                            break;
                        case 3:
                            checkout();
                            break;
                        case 4:
                            pilihMetodePembayaran();
                            break;
                        case 5:
                            lihatHistoryBelanja();
                            break;
                        case 6:
                            System.out.println("Anda telah Log Out dari akun anda");
                            return;
                        default:
                            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    }
                } catch (Exception e) {
                    System.out.println("Terjadi kesalahan: " + e.getMessage());
                    scanner.nextLine(); // Membersihkan buffer input setelah terjadi pengecualian
                }
            }
        }
    }
}
