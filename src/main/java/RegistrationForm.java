import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JFrame {

    private JTextField usernameField = new JTextField();
    private JPasswordField passwordField = new JPasswordField();
    private JTextField emailField = new JTextField();
    private JTextField phoneField = new JTextField();

    private JLabel usernameError = new JLabel(" ");
    private JLabel passwordError = new JLabel(" ");
    private JLabel emailError = new JLabel(" ");
    private JLabel phoneError = new JLabel(" ");

    private Validator firstValidator;

    public RegistrationForm(Validator firstValidator) {

        this.firstValidator = firstValidator;

        setTitle("User Registration");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 5, 5));

        panel.setBackground((new Color(210, 190, 240))); // i wanted to make it light purple the background
        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(usernameError);

        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(passwordError);

        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(emailError);

        panel.add(new JLabel("Phone Number (optional):"));
        panel.add(phoneField);
        panel.add(phoneError);

        JButton registerButton = new JButton("Register");
        panel.add(registerButton);

        add(panel);

        // checks the information when register is clicked
        registerButton.addActionListener(e -> registerUser());

        setVisible(true);
    }

    private void registerUser() {

        // clears the old errors
        usernameError.setText(" ");
        passwordError.setText(" ");
        emailError.setText(" ");
        phoneError.setText(" ");

        UserRegistration user = new UserRegistration(
                usernameField.getText(),
                new String(passwordField.getPassword()),
                emailField.getText(),
                phoneField.getText()
        );

        // starts the chain
        if (firstValidator.validate(user)) {
            JOptionPane.showMessageDialog(this, "Registration Successful!");
            return;
        }

        // finds which field has the error
        if (!new UsernameValidator().validate(user)) {
            usernameError.setText("username needs at least 5 characters");

        } else if (!new PasswordValidator().validate(user)) {
            passwordError.setText("password needs 8 chars, uppercase, lowercase and number");

        } else if (!new EmailValidator().validate(user)) {
            emailError.setText("please enter a valid email");

        } else {
            phoneError.setText("phone needs exactly 10 numbers");
        }
    }
}
