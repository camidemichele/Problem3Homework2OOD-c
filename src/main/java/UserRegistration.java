public class UserRegistration {

    private String username;
    private String password;
    private String email;
    private String phoneNumber;

    public UserRegistration(String username, String password, String email, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username; // returns the username
    }

    public String getPassword() {
        return password; // returns the password
    }

    public String getEmail() {
        return email; // returns the email
    }

    public String getPhoneNumber() {
        return phoneNumber; // returns the phone number
    }
}
