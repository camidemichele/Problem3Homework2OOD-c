public class EmailValidator extends BaseValidator {

    public boolean validate(UserRegistration user) {

        String email = user.getEmail();

        if (email == null || !email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
            return false; // email format is not valid
        }

        return checkNext(user); // moves to the next validator
    }
}
