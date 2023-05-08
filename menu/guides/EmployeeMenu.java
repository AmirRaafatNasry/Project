package menu.guides;

import human.Storage;
import human.ScannerUtil;

public class EmployeeMenu
{
    public static void employeeMenuStart() 
    {
        while (true) 
        {
            login();
            displayOptions();

            switch (ScannerUtil.takeInteger(2, 1)) 
            {
                case (1):
                    displayLevelOne(); 
                    switch (ScannerUtil.takeInteger(3, 0)) 
                    {
                        case (1):
                            Storage.admin.displayCustomers();
                            break;
                        case (2):
                            Storage.admin.displayRentedCars();
                            break;
                        case (3):
                            Storage.admin.displaySoldCars();
                            break;
                        case (0):
                            displayOptions();
                            break;
                    }
                    break;

                case (2):
                    displayLevelTwo();
                    switch (ScannerUtil.takeInteger(2, 0)) 
                    {
                        case (1):
                            Storage.admin.addCar();
                            break;
                        case (2):
                            Storage.admin.removeCar();
                            break;
                        case (0):
                            displayOptions();
                    }

                case (3):
                    displayLevelThree();
                    break;
            }
        }
    }

    public static void login() 
    {
        ScannerUtil.takeString("Username", "Username is an English word.", "Admin");
        MenuController.clearScreen();

        ScannerUtil.takeString("Password", "Password is an English word with numbers.", "Admin01");
        MenuController.clearScreen();
    }

    public static void displayOptions() 
    {
        System.out.println("1. Display");
        System.out.println("2. Add/Remove Car");
        System.out.println("3. Reset Password");

        MenuController.clearScreen();
    }

    public static void displayLevelOne() 
    {
        System.out.println("1. Display Customers");
        System.out.println("2. Display Rented Cars");
        System.out.println("3. Display Sold Cars");
        System.out.println();
        System.out.println("0. Back");

        MenuController.clearScreen();
    }

    public static void displayLevelTwo() 
    {
        System.out.println("1. Add Car");
        System.out.println("2. Remove Car");
        System.out.println();
        System.out.println("0. Back");

        MenuController.clearScreen();
    }

    public static void displayLevelThree() 
    {
        Storage.admin.resetPassword(ScannerUtil.takeString("New Password", null, Storage.admin.getPassword()));
        Storage.admin.showData();
    }
}