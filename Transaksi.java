public class Transaksi {
    String tanggalTransaksi;
    String namaBarang;
    int totalPembayaran;
    String metodePembayaran;

    public Transaksi(String tanggalTransaksi, String namaBarang, int totalPembayaran, String metodePembayaran) {
        this.tanggalTransaksi = tanggalTransaksi;
        this.namaBarang = namaBarang;
        this.totalPembayaran = totalPembayaran;
        this.metodePembayaran = metodePembayaran;
    }
}