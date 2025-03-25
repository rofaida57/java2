import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        scanner.close();

        System.out.println("\nRegistration Successful!");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: " + Password);
    }
}
