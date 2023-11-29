import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminDriver extends Driver {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Barang> daftarBarang = new ArrayList<>();
    static ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();

    public static void bersihkanConsole() {
        try {
            Process process = new ProcessBuilder("cmd", "/c", "cls", "clear").inheritIO().start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void customerChoice() {
        // TODO Auto-generated method stub
        return;
    }

    static void tampilkanBarangMenu() {
        System.out.println("\n-------------------------------------");
        System.out.println("============DAFTAR BARANG============\n");
        for (Barang barang : daftarBarang) {
            System.out.println("Nama\t: " + barang.nama);
            System.out.println("Kode\t: " + barang.kode);
            System.out.println("Harga\t: " + barang.harga);
            System.out.println("Stok\t: " + barang.stok);
            System.out.println(".....................................");
        }
    }
    
    private void tambahBarangMenu() {
        System.out.println("\n-------------------------------------");
        System.out.println("==========TAMBAH DATA BARANG=========\n");
        System.out.print("Nama\t: ");
        String nama = input.next();
        System.out.print("Kode\t: ");
        String kode = input.next();
        System.out.print("Harga\t: ");
        int harga = input.nextInt();
        System.out.print("Stok\t: ");
        int stok = input.nextInt();

        Barang barangBaru = new Barang(nama, kode, harga, stok);
        daftarBarang.add(barangBaru);

        System.out.println("\nData Berhasil Ditambahkan!");
    }

    private void hapusBarangMenu() {
        System.out.println("\n-------------------------------------");
        System.out.println("==========HAPUS DATA BARANG==========\n");
        
        boolean ditemukan = false;
        String kodeHapus;
    
        do {
            System.out.print("Kode\t: ");
            kodeHapus = input.next();
    
            ditemukan = false;
            for (Barang barang : daftarBarang) {
                if (barang.kode.equals(kodeHapus)) {
                    daftarBarang.remove(barang);
                    ditemukan = true;
                    System.out.println("\nData Berhasil Dihapus!");
                    break;
                }
            }
    
            if (!ditemukan) {
                System.out.println("\nKode barang '" + kodeHapus + "' tidak ditemukan! Silahkan coba lagi!");
            }
        } while (!ditemukan);
    }

    private void editBarangMenu() {
        System.out.println("\n-------------------------------------");
        System.out.println("==========EDIT DATA BARANG===========\n");
        
        boolean ditemukan = false;
        String kodeEdit;
    
        do {
            System.out.print("Kode\t: ");
            kodeEdit = input.next();
    
            ditemukan = false;
            for (Barang barang : daftarBarang) {
                if (barang.kode.equals(kodeEdit)) {
                    System.out.print("\nNama\t: ");
                    barang.nama = input.next();
                    System.out.print("Kode\t: ");
                    barang.kode = input.next();
                    System.out.print("Harga\t: ");
                    barang.harga = input.nextInt();
                    System.out.print("Stok\t: ");
                    barang.stok = input.nextInt();
                    ditemukan = true;
                    System.out.println("\nData Berhasil Diedit!");
                    break;
                }
            }
    
            if (!ditemukan) {
                System.out.println("\nKode barang '" + kodeEdit + "' tidak ditemukan! Silahkan coba lagi!");
            }
        } while (!ditemukan);
    }

    private void terimaTransaksiMenu() {
        System.out.println("-------------------------------------");
        System.out.println("=============TRANSAKSI===============");
        System.out.print("Tanggal Transaksi\t: ");
        String tanggalTransaksi = input.next();
        System.out.print("Nama Barang\t\t: ");
        String namaBarang = input.next();
        System.out.print("Total Pembayaran\t: ");
        int totalPembayaran = input.nextInt();
        System.out.print("Pembayaran (BANK/QRIS/COD)\t: ");
        String metodePembayaran = input.next();

        Transaksi transaksiBaru = new Transaksi(tanggalTransaksi, namaBarang, totalPembayaran, metodePembayaran);
        daftarTransaksi.add(transaksiBaru);
    }
    
    public void adminEdit(){
        Main main = new Main();
        
        try (Scanner s = new Scanner(System.in)) {
            int adminpilih;
            while(true){
                try {
                    System.out.println("\n=====================================");
                    System.out.println("Menu:");
                    System.out.println("1. Tampilkan Barang");
                    System.out.println("2. Tambah Barang");
                    System.out.println("3. Hapus Barang");
                    System.out.println("4. Edit Barang");
                    System.out.println("5. Terima Transaksi");
                    System.out.println("6. Log out");
                    System.out.print("Pilih aksi (1-6): ");
                    
                    adminpilih = s.nextInt();
                    s.nextLine(); // Membersihkan newline setelah nextInt

                    switch (adminpilih) {
                        case 1:
                            // Tampilkan Barang
                            tampilkanBarangMenu();
                            break;
                        case 2:
                            // Tambah Barang
                            tambahBarangMenu();
                            break;
                        case 3:
                            // Hapus Barang
                            hapusBarangMenu();
                            break;
                        case 4:
                            // Edit Barang
                            editBarangMenu();
                            break;
                        case 5:
                            // Terima Transaksi
                            terimaTransaksiMenu();
                            break;
                        case 6:
                            System.out.println("\nAnda telah Log Out dari akun anda!");
                            main.authMenu();
                            break;
                        default:
                            System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
                    }
                } catch (Exception e) {
                    System.out.println("\nTerjadi kesalahan: " + e.getMessage());
                    s.nextLine(); // Membersihkan buffer input setelah terjadi pengecualian
                }
            }
        }
    }

    public void run(){
        // daftar barang manual untuk list barang
        daftarBarang.add(new Barang("Indomie Kari Ayam", "IKA01", 3500, 70));
        daftarBarang.add(new Barang("Ultra Milk Coklat", "UMC01", 7000, 45));
        daftarBarang.add(new Barang("Ciptadent Maxi White", "CMW01", 23000, 30));
        daftarBarang.add(new Barang("Chitato Chicken BBQ", "CCB01", 11000, 65));
        
        System.out.println("\nWELCOME ADMIN!");
        adminEdit();
    }
}
