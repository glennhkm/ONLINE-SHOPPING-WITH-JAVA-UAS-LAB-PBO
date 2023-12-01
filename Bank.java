import java.util.Scanner;

public class Bank {
    String nomorRekening;
    String kodePembayaran;

    public Bank(String nomorRekening, String kodePembayaran){
        this.nomorRekening = nomorRekening;
        this.kodePembayaran = kodePembayaran;
    }

    public void bayarViaBank() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n+++++++++++++++++++++++++++++++++++++");
        System.out.println("--------------- BANK ----------------");
        System.out.print("Nomor Rekening\t\t: ");
        String nomorRekening1 = scan.nextLine();
        System.out.print("Kode Pembayaran\t\t: ");
        String kodePembayaran1 = scan.nextLine();
        // Lakukan proses pembayaran di sini, jika perlu
        if((nomorRekening1.equals(nomorRekening))&&(kodePembayaran1.equals(kodePembayaran))){
            System.out.println("Pembayaran berhasil!");
        }
        else {
            System.out.println("Pembayaran anda gagal!");
        }
    }
}