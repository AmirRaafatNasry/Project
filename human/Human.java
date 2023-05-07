package human;

public class Human 
{
    // Attributes
    private String email;
    private String username;
    private String password;

    private int phoneNumber;
    private int nationalIdentificationNumber;

    // Constructor for Employee
    public Human()
    {
    }

    // Constructor for Customer
    public Human(String email, String username, String password, int phoneNumber, int nationalIdentificationNumber)
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

    public int getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) 
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
        System.out.println("Username " + getUsername());
        System.out.println("Password " + getPassword());
    }
}