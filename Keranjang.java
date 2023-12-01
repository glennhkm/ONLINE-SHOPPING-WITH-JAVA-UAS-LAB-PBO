import java.util.ArrayList;
import java.util.Scanner;

public class Keranjang {
    
    static ArrayList<Barang> keranjang = new ArrayList<>();
    static ArrayList<Barang> daftarBarang = new ArrayList<>();
    boolean isBarangDitemukan = false;
    public void masukkanBarangKeKeranjang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n+++++++++++++++++++++++++++++++++++++");
        System.out.println("--Memasukkan Barang dalam Keranjang--");

        System.out.print("Kode barang\t: ");
        String kodeBarang = scanner.nextLine();

        Barang barang = null;
        for (Barang b : daftarBarang) {
            if (b.kode.equals(kodeBarang)) {
                barang = b;
                isBarangDitemukan = true;
                break;
            }
        }

        if (barang != null) {
            keranjang.add(barang);
            System.out.println("\nBarang dimasukkan dalam keranjang!");
        } else {
            System.out.println("\nKode barang '" + kodeBarang + "' tidak ditemukan! Silahkan coba lagi!");
        }
    }
}
