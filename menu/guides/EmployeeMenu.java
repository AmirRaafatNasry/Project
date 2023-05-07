package menu.guides;

import human.Employee;
import human.ScannerUtil;
import human.Storage;

public class EmployeeMenu /* implements EmployeeOptions */
{
    private static int option;

    public static void login() 
    {
        ScannerUtil.takeString("Username", "null", "Admin");
        Controller.clearScreen();
        
        ScannerUtil.takeString("Username", "null", "Admin");
        Controller.clearScreen();
    }

    public static int a() 
    {
        System.out.println("1. Display");
        System.out.println("2. Add/Remove Car");
        System.out.println("3. Reset Password");

        option = Controller.chooseOption();
        Controller.clearScreen();
        return option;
    }

    public static int b() 
    {
        System.out.println("1. Display Customers");
        System.out.println("2. Display Rented Cars");
        System.out.println("3. Display Sold Cars");
        System.out.println();
        System.out.println("0. Back");

        option = Controller.chooseOption();
        Controller.clearScreen();
        return option;
    }

    public static int c() 
    {
        System.out.println("1. Add Car");
        System.out.println("2. Remove Car");
        System.out.println();
        System.out.println("0. Back");

        option = Controller.chooseOption();
        Controller.clearScreen();
        return option;
    }

    public static void d()
    {
        // Storage.admin.takeString("Password");
    }
}