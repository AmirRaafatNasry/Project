package menu.guides;

import human.Storage;
import human.ScannerUtil;

public class EmployeeMenu /* implements EmployeeOptions */
{
    private static int option;

    public static void employeeMenuStart()
    {
        while (true)
        {
            login();
            a();
            switch (option)
            {
                case (1): b(); // Display
                        switch (option) 
                        {
                            case (1): Storage.admin.displayCustomers();
                                break;
                            case (2): Storage.admin.displayRentedCars();
                                break;
                            case (3): Storage.admin.displaySoldCars();
                                break;
                            case(0): a();
                                break;
                        }
                        break;
                case (2): c();
                        switch(option)
                        {
                            case(1): Storage.admin.addCar();
                            break;
                            case(2): Storage.admin.removeCar();
                            break;
                            case (0); a();
                        }
                case (3): d();
                break;
            }
        }
    }

    public static void login() 
    {
        ScannerUtil.takeString("Username", "null", "Admin");
        MenuController.clearScreen();
        
        ScannerUtil.takeString("Username", "null", "Admin");
        MenuController.clearScreen();
    }

    public static int a() 
    {
        System.out.println("1. Display");
        System.out.println("2. Add/Remove Car");
        System.out.println("3. Reset Password");

        option = MenuController.chooseOption();
        MenuController.clearScreen();
        return option;
    }

    public static int b() 
    {
        System.out.println("1. Display Customers");
        System.out.println("2. Display Rented Cars");
        System.out.println("3. Display Sold Cars");
        System.out.println();
        System.out.println("0. Back");

        option = MenuController.chooseOption();
        MenuController.clearScreen();
        return option;
    }

    public static int c() 
    {
        System.out.println("1. Add Car");
        System.out.println("2. Remove Car");
        System.out.println();
        System.out.println("0. Back");

        option = MenuController.chooseOption();
        MenuController.clearScreen();
        return option;
    }

    public static void d()
    {
        Storage.admin.resetPassword(ScannerUtil.takeString("New Password", null, Storage.admin.getPassword()));
        Storage.admin.showData();
    }
}