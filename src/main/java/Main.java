import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // creates the validators
        Validator username = new UsernameValidator();
        Validator password = new PasswordValidator();
        Validator email = new EmailValidator();
        Validator phone = new PhoneNumberValidator();

        // connects the chain
        username.setNextValidator(password);
        password.setNextValidator(email);
        email.setNextValidator(phone);

        // opens the registration window
        SwingUtilities.invokeLater(() -> new RegistrationForm(username));
    }
}
