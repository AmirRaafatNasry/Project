package human;
import java.util.Scanner;

public class Employee extends Human
{
    // Attributes
    private final String username = "Admin";
    private static String password = "Admin";

    // Constructor
    public Employee()
    {
        super();
    }

    // Getters (Accessors) & Setters (Mutators)
    public String getUsername() 
    {
        return username;
    }
    public String getPassword() 
    {
        return password;
    }
    public void setPassword(String password) 
    {
        Employee.password = password;
    }

    // Display
    public void displayCustomers()
    {
    }

    public void displayAvailableCars()
    {
    }

    public void displayRentedCars()
    {
    }

    public void displaySoldCars()
    {
    }

    public void displayCarsInMaintenance()
    {
    }

    // Add & Remove
    public void addCar()
    {
    }

    public void removeCar()
    {
    }

    // Password
    // Reset
    public String resetPassword(String newPassword)
    {
        while (true)
        {
            System.out.println("Password");
            Scanner input = new Scanner(System.in);
            newPassword = input.next();

            if (checkPassword(newPassword))
                System.out.println("SAME PASSWORD!" + "\n" + "TRY AGAIN!" + "\n");
            else
                return newPassword;
        }
    }

    // Check
    public boolean checkPassword(String password) 
    {
        return (getPassword() == password);
    }
}
