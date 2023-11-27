import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer extends Akun {
    public Keranjang keranjang;
    public ArrayList<Invoice> invoiceSelesai;
    private String fileName = "Customer/AkunCustomer.txt";

    public void saveToTextFile(String username, String password) {
        // Menentukan nama file untuk menyimpan data pengguna

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            // Menulis username dan password ke dalam file
            writer.println("Username: " + username);
            writer.println("Password: " + password);
            writer.println(); // Tambahkan baris kosong antara setiap entri pengguna

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> readCustomerAccounts() {
        List<String> accounts = new ArrayList<>();

        
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String username = scanner.nextLine().split(":")[1].trim();
                String password = scanner.nextLine().split(":")[1].trim();
                
                accounts.add(username);
                accounts.add(password);
                
                scanner.nextLine();
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan");;
        }
        
        return accounts;
    }
    
    @Override
    public boolean validateSignIn(String username, String password) {
        
        List<String> accounts = readCustomerAccounts();
        
        for (int i = 0; i < accounts.size(); i += 2) {
            String uname = accounts.get(i);
            String pword = accounts.get(i + 1);
            
            if (username.equals(uname) && password.equals(pword)) {
                return true;
            }
        }
        return false;

    }

    public int validateSignUp(String username, String password) {
        List<String> accounts = readCustomerAccounts();
        

        for (int i = 0; i < accounts.size(); i += 2) {
            String uname = accounts.get(i);
            String pword = accounts.get(i + 1);

            if (username.equals(uname) && password.equals(pword)) {
                System.out.println("\n=> You already have an account earlier\n");
                return 0;
            }
            if (username.equals(uname)) {
                return 1;
            }
        }
        return 2;

    }



}
