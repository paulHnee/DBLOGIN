import java.util.Scanner;

public class Main {
    protected int DB_CHECK(String username, String password) {
       int check = 0; // ALles sauber
        if(!username.equals("admin")){
            return check = 1;
        }
        if(!password.equals("admin")){
            return check = 2;
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username_in = sc.nextLine();
        System.out.print("Enter password: ");
        String password_in = sc.nextLine();

        if (new Main().DB_CHECK(username_in, password_in) == 1){
            System.out.println("Username is wrong");
        } else if (new Main().DB_CHECK(username_in, password_in) == 2) {
            System.out.println("password is wrong");
        }
        else {
            System.out.println("Willkommen");
        }
    }
}
