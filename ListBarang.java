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

    
    }
}
