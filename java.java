import javax.swing.JOptionPane;

public class UserRegistration {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        String email = JOptionPane.showInputDialog("Enter your email:");
        String password = JOptionPane.showInputDialog("Enter your password:");

        JOptionPane.showMessageDialog(null, "Registration Successful!\n" +
                                            "Name: " + name + "\n" +
                                            "Email: " + email + "\n" +
                                            "Password: (hidden for security)");
    }
}
