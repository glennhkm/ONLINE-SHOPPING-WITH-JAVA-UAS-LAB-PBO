import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public Akun akunAdmin = new Admin();
    public Akun akunCustomer = new Customer();
    public Driver driverAkun;
    Scanner input = new Scanner(System.in);


    public static void bersihkanConsole() {
        try {
            Process process = new ProcessBuilder("cmd", "/c", "cls", "clear").inheritIO().start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void sign_in() {
        String username;
        String password;
        
        System.out.println("\n" + "=".repeat(30) + " SIGN-IN " + "=".repeat(30));
        System.out.println("\nPlease Login to your account\n");

        while (true){
            try{
                System.out.print("Username : ");
                username = input.next();
                System.out.print("Password : ");
                password = input.next();
                if((!akunAdmin.validateSignIn(username, password) && !akunCustomer.validateSignIn(username, password))){
                    System.out.println("\n=> Your username or password is not valid\n");
                }
                else{
                    break;
                }
            }catch(InputMismatchException e){
                System.out.println("=> Your input is not valid, please input the valid characters");
                input.nextLine();
            }
        }
        
        driverAkun = akunAdmin.validateSignIn(username, password) ? new AdminDriver() : new CustomerDriver(); 
        System.out.println("\n=> Login successfully\n");
        for(int i = 0; i <= 80000; i++){
            if(i/40000 == 0){
                continue;
            }
            System.out.print("\rRedirecting ... " + i/20000);
        }
        bersihkanConsole();
    }


    public void sign_up() {
        String username;
        String password;

        System.out.println("\n" + "=".repeat(30) + " SIGN-UP " + "=".repeat(30));
        System.out.println("\nPlease enter the requirements below\n");
        
        while (true) {

            try {    
                System.out.print("Username : ");
                username = input.next();
                System.out.print("Password : ");
                password = input.next();
                if(akunCustomer.validateSignUp(username, password) == 0){
                    authMenu();
                }
                else if(akunAdmin.validateSignUp(username, password) == 0 || akunCustomer.validateSignUp(username, password) == 1){
                    System.out.println("\n=> Username is already available, please input another Username\n");
                }
                else if(akunAdmin.validateSignUp(username, password) == 1 && akunCustomer.validateSignUp(username, password) == 2){
                    break;
                }
            } 
            catch (InputMismatchException e) {
                System.out.println("=> Your input is not valid, please input the valid characters");
                input.nextLine();
            }
            
        }

        akunCustomer.saveToTextFile(username, password);
        System.err.println("\n=> Your account created successfully!\n");

        for(int i = 0; i <= 80000; i++){
            if(i/40000 == 0){
                continue;
            }
            System.out.print("\rRedirecting ... " + i/20000);
        }
        bersihkanConsole();
        authMenu();
    }

    
    public void authMenu(){
        int inputAuth;
        System.out.println("\n" + "=".repeat(30) + " DOBLEH INDUSTRIES " + "=".repeat(30) + "\n");
        while (true){
            try{
                System.out.println("=".repeat(18));
                System.out.println("||              ||");
                System.out.println("||  1. Sign in  ||");
                System.out.println("||  2. Sign up  ||");
                System.out.println("||              ||");
                System.out.println("=".repeat(18));
                System.out.print("\nInput : ");
                inputAuth = input.nextInt();
                if(inputAuth == 1 || inputAuth == 2 ){
                    break;
                }
                else{
                    System.out.println("\n=> Please enter the available number options\n");
                }
            }catch (InputMismatchException e) {
                System.out.println("\n=> Input must be a number\n");
                input.nextLine();
            }
        }
    
        bersihkanConsole();
        if (inputAuth == 1) {
            sign_in();
        } else {
            sign_up();
        }
    }
    
    
    public void run() {
        authMenu();
        
        driverAkun.run();

    }

    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }
}
