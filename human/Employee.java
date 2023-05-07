package human;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Employee extends Human
{
    Scanner input = new Scanner(System.in);
    // Attributes
    private final String username = "Admin";
    private static String password = "Admin01";

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

    // Take data
    public void takeUsername()
    {
        while (true)
        {
            try
            {
                System.out.println("Username");
                String username = input.next();

                if (checkUsername(username))
                    break;
                else
                    System.out.println("Invalid username.");
            }
                catch (InputMismatchException exception)
                {
                    System.out.println("Wrong entry!");
                    System.out.println();
                    System.out.println("Username : 1) English.");
                    System.out.println("           2) Letters.");
                }
        }
    }

    public void takePassword()
    {
        while (true) 
        {
            try 
            {
                System.out.println("Password");
                String password = input.next();

                if (checkPassword(password))
                    break;
                else
                    System.out.println("Invalid password.");
            } 
            catch (InputMismatchException exception) 
            {
                System.out.println("Wrong entry!");
                System.out.println();
                System.out.println("Password  English.");
                System.out.println("           2) Letters.");
                System.out.println("           3) Numbers.");
            }
        }
    }

    // Check
    public boolean checkPassword(String password) 
    {
        return (getPassword() == password);
    }

    public boolean checkUsername(String username) 
    {
        return (getUsername() == username);
    }

    // Reset Password
    public String resetPassword(String newPassword)
    {
        while (true)
        {
            System.out.println("Password");
            newPassword = input.next();

            if (checkPassword(newPassword))
                System.out.println("SAME PASSWORD!" + "\n" + "TRY AGAIN!" + "\n");
            else
                return newPassword;
        }
    }

    // Show Data
    public void showData()
    {
        System.out.println("Username " + getUsername());
        System.out.println("Password " + getPassword());
    }
}
