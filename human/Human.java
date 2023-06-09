package human;

public class Human 
{
    // Attributes
    private String email;
    private String username;
    private String password;
    private String phoneNumber;

    private int nationalIdentificationNumber;

    // Constructor for Employee
    public Human(String email, String username, String password, String phoneNumber)
    {
        this.email = email;
        this.username = username;
        this.password = password;

        this.phoneNumber = phoneNumber;
    }

    // Constructor for Customer
    public Human(String email, String username, String password, String phoneNumber, int nationalIdentificationNumber)
    {
        this.email = email;
        this.username = username;
        this.password = password;

        this.phoneNumber = phoneNumber;
        this.nationalIdentificationNumber = nationalIdentificationNumber;
    }

    // Getters (Accessors) & Setters (Mutators)
    public String getEmail() 
    {
        return email;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public int getNationalIdentificationNumber() 
    {
        return nationalIdentificationNumber;
    }
    public void setNationalIdentificationNumber(int nationalIdentificationNumber) 
    {
        this.nationalIdentificationNumber = nationalIdentificationNumber;
    }


    // Methods
    public void showData() 
    {
    }
}