
public class UsernameValidator extends BaseValidator {

    public boolean validate(UserRegistration user) {

        String username = user.getUsername();

        if (username == null || username.trim().length() < 5) {
            return false; // username is too short
        }

        return checkNext(user); // moves to the next validator
    }
}
