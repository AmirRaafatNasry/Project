package human;
import java.util.Scanner;


import car.Car;
import car.Rented;
import car.Sold;

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
            System.out.println("No Customers!");
        else
        {
            System.out.println("Customer/s Data");
            int totalNumber = 1;
            for (Customer customer : Storage.customers)
            {
                System.out.println("━ " + totalNumber + " ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println();

                System.out.println("1. Email: " + customer.getEmail());
                System.out.println("2. Username: " + customer.getUsername());
                System.out.println("3. Password: " + customer.getPassword());
                System.out.println();
                System.out.println("4. Phone Number: " + customer.getPhoneNumber());
                System.out.println("5. National Identification Number: " + customer.getNationalIdentificationNumber());
                System.out.println("6. Insurance : " + customer.isInsured());

                System.out.println();
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println();
                totalNumber++;
            }
        }
    }

    // public Car(boolean disabled, String bodyType, String fuelType, String transmissionType, String color, int numberOfSeats)

    public void displayAvailableCars()
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

    public void displayRentedCars()
    {
        if (Storage.rentedCars.isEmpty())
            System.out.println("No Rented Cars!");
        else 
        {
            System.out.println("Rented Car/s Data");
            int totalNumber = 1;
            for (Rented rentedCar : Storage.rentedCars) 
            {
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
            for (Sold soldCar : Storage.soldCars) 
            {
                System.out.println("━ " + totalNumber + " ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println();

                System.out.println("1. Car for Disabled People: " + soldCar.isDisabled());
                System.out.println("2. Body Type: " + soldCar.getBodyType());
                System.out.println("3. Fuel Type: " + soldCar.getFuelType());
                System.out.println("4. Transmission Type : " + soldCar.getTransmissionType());
                System.out.println("5. Color: " + soldCar.getColor());
                System.out.println("6. Number of Seats : " + soldCar.getNumberOfSeats());

                System.out.println();
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println();
                totalNumber++;
            }
        }

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
