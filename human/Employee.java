package human;

import car.Car;
import car.Rented;
import car.Sold;
import storage.Storage;
import utility.ScannerUtil;

public class Employee extends Human 
{
    // Attributes
    private String department;

    // Constructor
    public Employee(String email, String username, String password, String phoneNumber) 
    {
        super(email, username, password, phoneNumber);
        this.department = department;
    }

    // Getters (Accessors) & Setters (Mutators)
    public String getDepartment() 
    {
        return department;
    }
    public void setDepartment(String department) 
    {
        this.department = department;
    }

    // Methods
    public static void displayCustomers() 
    {
        if (Storage.customers.isEmpty())
            System.out.println("No Customers!");
        else 
        {
            System.out.println("Customer/s Data");
            int totalNumber = 1;
            for (Customer customer : Storage.customers) {
                System.out.println("━ " + totalNumber + " ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println();

                System.out.println("1. Email: " + customer.getEmail());
                System.out.println("2. Username: " + customer.getUsername());
                System.out.println("3. Password: " + customer.getPassword());
                System.out.println("4. Phone Number: " + customer.getPhoneNumber());
                System.out.println("5. National Identification Number: " + customer.getNationalIdentificationNumber());

                System.out.println();
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println();
                totalNumber++;
            }
        }
    }

    // public Car(boolean disabled, String bodyType, String fuelType, String
    // transmissionType, String color, int numberOfSeats)

    public static void displayAvailableCars() 
    {
        if (Storage.availableCars.isEmpty())
            System.out.println("No Available Cars!");
        else 
        {
            System.out.println("Available Car/s Data");
            int totalNumber = 1;
            for (Car availableCar : Storage.availableCars) 
            {
                System.out.println("━ " + totalNumber + " ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println();

                System.out.println("1. Car for Disabled People: " + availableCar.isDisabled());
                System.out.println("2. Body Type: " + availableCar.getBodyType());
                System.out.println("3. Fuel Type: " + availableCar.getFuelType());
                System.out.println("4. Transmission Type : " + availableCar.getTransmissionType());
                System.out.println("5. Color: " + availableCar.getColor());
                System.out.println("6. Number of Seats : " + availableCar.getNumberOfSeats());

                System.out.println();
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println();
                totalNumber++;
            }
        }
    }

    public static void displayRentedCars() 
    {
        if (Storage.rentedCars.isEmpty())
            System.out.println("No Rented Cars!");
        else 
        {
            System.out.println("Rented Car/s Data");
            int totalNumber = 1;
            for (Rented rentedCar : Storage.rentedCars) {
                System.out.println("━ " + totalNumber + " ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println();

                System.out.println("1. Car for Disabled People: " + rentedCar.isDisabled());
                System.out.println("2. Body Type: " + rentedCar.getBodyType());
                System.out.println("3. Fuel Type: " + rentedCar.getFuelType());
                System.out.println("4. Transmission Type : " + rentedCar.getTransmissionType());
                System.out.println("5. Color: " + rentedCar.getColor());
                System.out.println("6. Number of Seats : " + rentedCar.getNumberOfSeats());

                System.out.println();
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println();
                totalNumber++;
            }
        }
    }

    public void displaySoldCars()
    {
        if (Storage.rentedCars.isEmpty())
            System.out.println("No Sold Cars!");
        else 
        {
            System.out.println("Sold Car/s Data");
            int totalNumber = 1;
            for (Sold soldCar : Storage.soldCars) {
                System.out.println("━ " + totalNumber + " ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println();

                System.out.println("01. Accessibility: " + soldCar.getAccessibility());
                System.out.println("02. Body Type: " + soldCar.getBodyType());
                System.out.println("03. Fuel Type: " + soldCar.getFuelType());
                System.out.println("04. Transmission Type : " + soldCar.getTransmissionType());
                System.out.println("05. Color: " + soldCar.getColor());
                System.out.println("06. Number of Seats : " + soldCar.getNumberOfSeats());

                System.out.println();
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println();
                totalNumber++;
            }
        }
    }

    public static void addCar() 
    {
        boolean flag = true;
        while (flag) 
        {
            System.out.println("Accessibility: ");
            System.out.println("Body Type: ");
            System.out.println("Fuel Type: ");
            System.out.println("Transmission Type: ");
            System.out.println("Color: ");
            System.out.println("Number of Seats: ");
            System.out.println();

            System.out.println("Are you sure about the data you entered?");
            System.out.println("01. Yes");
            System.out.println("02. No");
            int choice = ScannerUtil.takeInteger(1, 2);
            if (choice == 2)
                continue;
            
            System.out.println("01. Rentable Car");
            System.out.println("02. Sellable Car");
            // TODO finish this

            System.out.println("Add another?");
            System.out.println("01. Yes");
            System.out.println("02. No");
            choice = ScannerUtil.takeInteger(1, 2);
            if (choice == 2)
                break;
        }
    }


    public static void removeCar() 
    {
        while (true) 
        {
            System.out.println("Disabled?");
            System.out.println("Body Type: ");
            System.out.println("Fuel Type: ");
            System.out.println("Transmission Type: ");
            System.out.println("Color: ");
            System.out.println("Number of Seats: ");
            System.out.println();

            System.out.println("Are you sure about the data you entered?");
            System.out.println("01. Yes");
            System.out.println("02. No");
            int choice = ScannerUtil.takeInteger(1, 2);
            if (choice == 2)
                continue;

            // TODO search for the car and remove it

            System.out.println("Remove another?");
            System.out.println("01. Yes");
            System.out.println("02. No");
            choice = ScannerUtil.takeInteger(1,2);
            if (choice == 2)
                break;
        }
    }

    public static void addEmployee()
    {
        
    }

    public static void removeEmployee()
    {

    }

    // TODO add reset email/username/phone number
    public String resetPassword() 
    {
        while (true) 
        {
            String newPassword = ScannerUtil.takeString("New Password: ");
            String newPasswordCheck = ScannerUtil.takeString("Confirm New Password: ");

            if (newPassword == Storage.admin.getPassword())
                System.out.println("THE NEW PASSWORD SHOULDN'T BE THE SAME AS THE OLD PASSWORD!");
            else if (newPassword == newPasswordCheck)
                return newPassword;
        }
    }

    @Override // Annotation
    public void showData() 
    {
        System.out.println("Email: " + getEmail());
        System.out.println("Username: " + getUsername());
        System.out.println("Password: " + getPassword());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Department: " + getDepartment());
    }
}
