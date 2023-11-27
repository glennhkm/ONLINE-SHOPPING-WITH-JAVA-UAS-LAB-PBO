import java.io.IOException;
// import java.util.Scanner;

public class AdminDriver extends Driver {
    // Scanner input = new Scanner(System.in);

    public static void bersihkanConsole() {
        try {
            Process process = new ProcessBuilder("cmd", "/c", "cls", "clear").inheritIO().start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run(){
        System.out.println("\nWELCOME ADMIN");
    }
}