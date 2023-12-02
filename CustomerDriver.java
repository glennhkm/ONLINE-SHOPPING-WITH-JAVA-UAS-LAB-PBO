<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;


=======
import java.util.Scanner;

>>>>>>> 223cde28d29ef22dee24c9a2b5121adff63f8b57
public class CustomerDriver extends Driver {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Barang> keranjang = new ArrayList<>();
    static ArrayList<String> historyBelanja = new ArrayList<>();
    
    Bank bank = new Bank("123", "123");
    Keranjang krjg = new Keranjang();
    Barang brg = new Barang(null, null, 0, 0);
    Pembayaran byr = new Pembayaran();

    public void run(){
        System.out.println("\nWELCOME CUSTOMER");
        customerChoice();
    } 
<<<<<<< HEAD
    
=======

>>>>>>> 223cde28d29ef22dee24c9a2b5121adff63f8b57
    @Override
    public void adminEdit() {
        // TODO Auto-generated method stub
        return;
    }
    
<<<<<<< HEAD
    
    private void checkout() {
        // Lakukan proses checkout di sini, jika perlu
        keranjang.clear();
        System.out.println("\nCheckout berhasil!");
    }
    
    
    // private void pilihMetodePembayaran() {
    //     System.out.println("\n-------------------------------------");
    //     System.out.println("======PILIH METODE PEMBAYARAN========");
    //     System.out.println("Menu:");
    //     System.out.println("1. BANK");
    //     System.out.println("2. QRIS");
    //     System.out.println("3. COD");
    //     System.out.println("4. Keluar dari metode pembayaran");
    //     System.out.print("\nPilihan anda (1-4): ");
        
    //     int choice = scanner.nextInt();
    //     scanner.nextLine(); // Move scanner to the next line
        
    //     switch (choice) {
    //         case 1:
    //             bank.bayarViaBank();
    //             break;
    //             case 2:
    //             // Implementasi pilihan QRIS di sini, jika perlu
    //             break;
    //             case 3:
    //             // Implementasi pilihan COD di sini, jika perlu
    //             break;
    //             case 4:
    //             System.out.println("\nAnda keluar dari metode pembayaran!");
    //             break;
    //             default:
    //             System.out.println("\nPilihan anda tidak valid! Silahkan coba lagi!");
    //             break;
    //         };
            
    //     }
        
        
=======
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
>>>>>>> 223cde28d29ef22dee24c9a2b5121adff63f8b57
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
<<<<<<< HEAD
                            brg.lihatListBarang();
                            break;
                        case 2:
                            krjg.masukkanBarangKeKeranjang();
=======
                            lihatListBarang();
                            break;
                        case 2:
                            masukkanBarangKeKeranjang();
>>>>>>> 223cde28d29ef22dee24c9a2b5121adff63f8b57
                            break;
                        case 3:
                            checkout();
                            break;
                        case 4:
<<<<<<< HEAD
                            byr.pilihMetodePembayaran();
                            break;
                        case 5:
                            brg.lihatHistoryBelanja();
=======
                            pilihMetodePembayaran();
                            break;
                        case 5:
                            lihatHistoryBelanja();
>>>>>>> 223cde28d29ef22dee24c9a2b5121adff63f8b57
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
<<<<<<< HEAD
}
=======
}
>>>>>>> 223cde28d29ef22dee24c9a2b5121adff63f8b57
