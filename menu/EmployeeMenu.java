package menu;

import human.Employee;
import storage.Storage;
import utility.OutputUtil;
import utility.ScannerUtil;

public class EmployeeMenu
{
    public static void start() 
    {
        login();
        displayOptions();
    }

    public static void login() 
    {
        OutputUtil.clearScreen();
        ScannerUtil.takeString("Username", "Username is an English word.", Storage.admin.getUsername());
        OutputUtil.clearScreen();
        ScannerUtil.takeString("Password", "Password is an English word with numbers.", Storage.admin.getPassword());
    }

    public static void displayOptions() 
    {
        OutputUtil.clearScreen();
        System.out.println("01. Display");
        System.out.println("02. Add/Remove Car");
        System.out.println("03. Add/Remove Employee");
        System.out.println("04. Reset Password");

        switch (ScannerUtil.takeInteger(1, 4))
        {
            case(1):
                displayOptionOne();
                break;
            case(2):
                displayOptionTwo();
                break;
            case(3):
                displayOptionThree();
                break;
            case(4):
                displayOptionFour();
                break;
        }
    }

    public static void displayOptionOne() 
    {
        OutputUtil.clearScreen();
        System.out.println("01. Display Customers");
        System.out.println("02. Display Available Cars");
        System.out.println("03. Display Rented Cars");
        System.out.println("04. Display Sold Cars");
        System.out.println();
        System.out.println("00. Back");

        switch (ScannerUtil.takeInteger(0, 4))
        {
            case(1):
                Employee.displayCustomers();
                break;
            case(2):
                Employee.displayAvailableCars();
                break;
            case(3):
                Employee.displayRentedCars();
                break;
            case(4):
                displayOptionThree();
                break;
            case(0):
                displayOptions();
                break;
        }
    }

    public static void displayOptionTwo() 
    {
        OutputUtil.clearScreen();
        System.out.println("01. Add Car");
        System.out.println("02. Remove Car");
        System.out.println();
        System.out.println("00. Back");

        switch (ScannerUtil.takeInteger(0, 2))
        {
            case(1):
                Employee.addCar();
                break;
            case(2):
                Employee.removeCar();
                break;
            case(0):
                displayOptions();
                break;
        }
    }

    public static void displayOptionThree() 
    {
        OutputUtil.clearScreen();
        System.out.println("01. Add Employee");
        System.out.println("02. Remove Employee");
        System.out.println();
        System.out.println("00. Back");

        switch (ScannerUtil.takeInteger(0, 2))
        {
            case(1):
                Employee.addEmployee();
                break;
            case(2):
                Employee.removeCar();
                break;
            case(0):
                displayOptions();
                break;
        }
    }

    public static void displayOptionFour() 
    {
        OutputUtil.clearScreen();
        Storage.admin.resetPassword();
        Storage.admin.showData();
    }
}