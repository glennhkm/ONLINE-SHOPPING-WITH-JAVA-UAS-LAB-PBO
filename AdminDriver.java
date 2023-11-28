import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class AdminDriver extends Driver {
    static ArrayList<Barang> daftarBarang = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void bersihkanConsole() {
        try {
            Process process = new ProcessBuilder("cmd", "/c", "cls", "clear").inheritIO().start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void menuAdmin() {
        Main main = new Main();

        System.out.println("\n=====================================");
        System.out.println("Menu:");
        System.out.println("1. Tampilkan Barang");
        System.out.println("2. Tambah Barang");
        System.out.println("3. Hapus Barang");
        System.out.println("4. Edit barang");
        System.out.println("5. Transaksi");
        System.out.println("0. Keluar");
        System.out.print("\nPilihan anda: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 0:
                System.out.println("\nSampai Jumpa Lagi Admin!");
                main.authMenu();
                break;
            case 1:
                tampilkanBarang();
                menuAdmin();
                break;
            case 2:
                tambahBarang();
                menuAdmin();
                break;
            case 3:
                hapusBarang();
                menuAdmin();
                break;
            case 4:
                editBarang();
                menuAdmin();
                break;
            case 5:
                menuAdmin();
                break;
            default:
                System.out.println("\nPilihan anda tidak valid! Silahkan coba lagi!");
                menuAdmin();
                break;
        }
    }

    static void tampilkanBarang() {
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

    static void tambahBarang() {
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

    static void hapusBarang() {
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
                    System.out.println("Data Berhasil Dihapus!\n");
                    break;
                }
            }
    
            if (!ditemukan) {
                System.out.println("\nKode barang '" + kodeHapus + "' tidak ditemukan! Silahkan coba lagi!");
            }
        } while (!ditemukan);
    }

    static void editBarang() {
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
                    System.out.println("\nData Berhasil Diedit!\n");
                    break;
                }
            }
    
            if (!ditemukan) {
                System.out.println("\nKode barang '" + kodeEdit + "' tidak ditemukan! Silahkan coba lagi!");
            }
        } while (!ditemukan);

        // Transaksi belum
    }
    
    public void run(){
        System.out.println("\nWELCOME ADMIN!");
        menuAdmin();
    }
}
