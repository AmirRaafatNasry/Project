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

    // Methods
    public void displayCustomers()
    {
        if (Storage.customers.isEmpty())
            System.out.println("No Customers");
        else
        {
            for (Customer customer : Storage.customers)
            {
                System.out.println("Customer/s Data");
                System.out.println("1. Email: " + customer.getEmail());
                System.out.println("2. Username: " + customer.getUsername());
                System.out.println("3. Password: " + customer.getPassword());
                System.out.println();
                System.out.println("4. Phone Number: " + customer.getPhoneNumber());
                System.out.println("5. National Identification Number: " + customer.getNationalIdentificationNumber());
                System.out.println("6. Insurance : " + customer.isInsured());

                System.out.println();
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println();
            }
        }
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


    public void addCar()
    {
        boolean flag = true;
        while (flag)
        {
            System.out.println("Disabled?");
            System.out.println("Body Type: ");
            System.out.println("Fuel Type: ");
            System.out.println("Transmission Type: ");
            System.out.println("Color: ");
            System.out.println("Number of Seats: ");
            System.out.println("");

            // ?????????
            System.out.println("Add another? [Y/N]");
            System.out.println("1. Yes");
            System.out.println("2. No");
        }
    }
    public void removeCar()
    {
    }

    public String resetPassword(String newPassword) 
    {
    while (true) 
        {
            try 
            {
                System.out.println("Password");
                newPassword = input.next();

                if (newPassword == password)
                    System.out.println("Invalid password.");
                else
                    return newPassword;
            } 
            catch (InputMismatchException exception) 
            {
                // ?????????????????????
                System.out.println("Password ");
                input.next();
            }
        }
    }

    // ??????????????
    @Override // Annotation
    public void showData() 
    {
        System.out.println("Username " + getUsername());
        System.out.println("Password " + getPassword());
    }
}
