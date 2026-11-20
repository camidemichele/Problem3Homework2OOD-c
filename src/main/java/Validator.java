public interface Validator {

    void setNextValidator(Validator next); // connects to the next validator

    boolean validate(UserRegistration user); // checks if the information is valid
}
