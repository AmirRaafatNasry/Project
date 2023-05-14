package human;

public class Customer extends Human
{
    // Constructor
    public Customer(String email, String username, String password, String phoneNumber, int nationalIdentificationNumber)
    {
        super(email, username, password, phoneNumber, nationalIdentificationNumber);
    }

    // Methods
    @Override // Annotation
    public void showData() {
        System.out.println("Username: " + getUsername());
        System.out.println("Password: " + getPassword());
    }
}
