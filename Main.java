import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
* @author Kelompok 4
 * @version 1.0
 * @since 2023-12-01
 */
public class Main {
    public Akun akunAdmin = new Admin();
    public Akun akunCustomer = new Customer();
    public Driver driverAkun;
    Scanner input = new Scanner(System.in);


     /**
     * Clears the console screen using platform-specific commands.
     */
    public static void bersihkanConsole() {
        try {
            Process process = new ProcessBuilder("cmd", "/c", "cls", "clear").inheritIO().start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Handles the sign-in process for both Admin and Customer.
     * Redirects to appropriate functionalities based on the user's role.
     */
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
        
        if(((Customer)akunCustomer).validateSignIn(username, password)){
            
            System.out.println("\n=> Login successfully\n");
            for(int i = 0; i <= 8000; i++){
                if(i/2000 == 0){
                    continue;
                }
                System.out.print("\rRedirecting ... " + i/2000);
            }
            bersihkanConsole();
            CustomerDriver driver = new CustomerDriver((Customer)akunCustomer);  
            driver.run();
        }
        
        else{
            System.out.println("\n=> Login successfully\n");
            for(int i = 0; i <= 8000; i++){
                if(i/2000 == 0){
                    continue;
                }
                System.out.print("\rRedirecting ... " + i/2000);
            }
            bersihkanConsole();
            driverAkun = new AdminDriver();
            driverAkun.run();
        }
        for (int i = 0; i <= 8000; i++) {
            if (i / 2000 == 0) {
                continue;
            }
            System.out.print("\rRedirecting ... " + i / 2000);
        }
        bersihkanConsole();
        authMenu();
    }

    /**
     * Handles the sign-up process for creating a new Customer account.
     * Validates the input and redirects to the authentication menu.
     */
    public void sign_up() {
        String username;
        String password;
        int mark = 0;

        System.out.println("\n" + "=".repeat(30) + " SIGN-UP " + "=".repeat(30));
        System.out.println("\nPlease enter the requirements below\n");
        
        while (true) {

            try {    
                System.out.print("Username : ");
                username = input.next();
                System.out.print("Password : ");
                password = input.next();
                if(akunCustomer.validateSignUp(username, password) == 0){
                    mark = 1;
                    break;
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
        
        if(mark == 1){
            authMenu();
        }
        else{
            akunCustomer.saveToTextFile(username, password);
            System.err.println("\n=> Your account created successfully!\n");
            
            for(int i = 0; i <= 8000; i++){
                if(i/2000 == 0){
                    continue;
                }
                System.out.print("\rRedirecting ... " + i/2000);
            }
            bersihkanConsole();
            authMenu();
        }
    }

    /**
     * Displays the authentication menu, allowing users to sign in, sign up, or exit.
     * Redirects to corresponding methods based on user input.
     */
    public void authMenu(){
        int inputAuth;
        System.out.println("\n" + "=".repeat(30) + " DOBLEH INDUSTRIES " + "=".repeat(30) + "\n");
        while (true){
            try{
                System.out.println("=".repeat(18));
                System.out.println("||              ||");
                System.out.println("||  1. Sign in  ||");
                System.out.println("||  2. Sign up  ||");
                System.out.println("||  0. Exit     ||");
                System.out.println("||              ||");
                System.out.println("=".repeat(18));
                System.out.print("\nInput : ");
                inputAuth = input.nextInt();
                if(inputAuth >= 0 && inputAuth < 3 ){
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
        } else if (inputAuth == 2) {
            sign_up();
        }
    }
    
    /**
     * Initiates the program by displaying the authentication menu.
     */
    public void run() {
        authMenu();

    }

    /**
     * The main method to start the program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }
}
