import java.util.ArrayList;

public class Barang {
    String nama;
    String kode;
    int harga;
    int stok;

<<<<<<< HEAD
    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
    static ArrayList<Barang> daftarBarang = new ArrayList<>();
    

=======
>>>>>>> 223cde28d29ef22dee24c9a2b5121adff63f8b57
    public Barang(String nama, String kode, int harga, int stok) {
        this.nama = nama;
        this.kode = kode;
        this.harga = harga;
        this.stok = stok;
    }
<<<<<<< HEAD

    public void lihatHistoryBelanja() {
        System.out.println("\n-------------------------------------");
        System.out.println("========= HISTORY BELANJA ===========");
    }
    
    ListBarang listBarang = new ListBarang(daftarBarang);
    public void lihatListBarang() {
        System.out.println("\n-------------------------------------");
        System.out.println("=============LIST BARANG=============\n");
        for (Barang barang : daftarBarang) {
            System.out.println("Nama\t: " + barang.getNama());
            System.out.println("Kode\t: " + barang.getKode());
            System.out.println("Harga\t: " + barang.getHarga());
            System.out.println("Stok\t: " + barang.getStok());
            System.out.println(".....................................");
        }
    }
=======
>>>>>>> 223cde28d29ef22dee24c9a2b5121adff63f8b57
}