package human;

public class Customer extends Human
{
    // Attribute 
    private boolean isInsured;
    
    // Constructor
    public Customer(String email, String username, String password, int phoneNumber, int nationalIdentificationNumber, boolean isInsured)
    {
        super(email, username, password, phoneNumber, nationalIdentificationNumber);
        this.isInsured = isInsured;
    }
    
    // Getters (Accessors) & Setters (Mutators)
    public boolean isInsured() 
    {
        return isInsured;
    }
    public void setInsured(boolean isInsured) 
    {
        this.isInsured = isInsured;
    }
}
