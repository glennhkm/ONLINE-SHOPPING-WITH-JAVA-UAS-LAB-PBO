<<<<<<< HEAD
import java.util.ArrayList;

public class ListBarang {
    private ArrayList<Barang> daftarBarang;

    public ListBarang(ArrayList<Barang> daftarBarang) {
        this.daftarBarang = daftarBarang;
    }
    static ArrayList<Barang> keranjang = new ArrayList<>();
    
    public void lihatListBarang(){
    daftarBarang.add(new Barang("Indomie Kari Ayam", "IKA01", 3500, 70));
    daftarBarang.add(new Barang("Ultra Milk Coklat", "UMC01", 7000, 45));
    daftarBarang.add(new Barang("Ciptadent Maxi White", "CMW01", 23000, 30));
    daftarBarang.add(new Barang("Chitato Chicken BBQ", "CCB01", 11000, 65));

    
=======
//import java.util.List;

public class ListBarang {
    private String listBarang;
    private String listTransaksi;

    public ListBarang(String listBarang, String listTransaksi) {
        this.listBarang = listBarang;
        this.listTransaksi = listTransaksi;
    }

    public String getlistBarang() {
        return listBarang;
    }

    public String getlistTransaksi() {
        return listTransaksi;
>>>>>>> 223cde28d29ef22dee24c9a2b5121adff63f8b57
    }
}

