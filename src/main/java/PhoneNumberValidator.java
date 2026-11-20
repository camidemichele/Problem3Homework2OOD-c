public class PhoneNumberValidator extends BaseValidator {

    public boolean validate(UserRegistration user) {

        String phone = user.getPhoneNumber();

        if (phone != null && !phone.isEmpty()) {

            if (!phone.matches("[0-9]{10}")) {
                return false; // phone must have exactly 10 numbers
            }
        }

        return checkNext(user); // moves to the next validator
    }
}
