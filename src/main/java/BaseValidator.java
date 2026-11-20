public abstract class BaseValidator implements Validator {

    protected Validator nextValidator; // stores the next validator

    public void setNextValidator(Validator next) {
        nextValidator = next; // saves the next validator
    }

    protected boolean checkNext(UserRegistration user) {

        if (nextValidator != null) {
            return nextValidator.validate(user); // sends the user to the next validator
        }

        return true; // all validations passed
    }
}
