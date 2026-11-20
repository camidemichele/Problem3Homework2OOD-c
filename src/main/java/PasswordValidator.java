public class PasswordValidator extends BaseValidator {

    public boolean validate(UserRegistration user) {

        String password = user.getPassword();

        if (password == null || password.length() < 8) {
            return false; // password needs at least 8 characters
        }

        boolean upper = false;
        boolean lower = false;
        boolean number = false;

        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                upper = true; // found an uppercase letter
            }

            if (Character.isLowerCase(c)) {
                lower = true; // found a lowercase letter
            }

            if (Character.isDigit(c)) {
                number = true; // found a number
            }
        }

        if (!upper || !lower || !number) {
            return false; // password is missing something
        }

        return checkNext(user); // moves to the next validator
    }
}
