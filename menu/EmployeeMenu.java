package menu;

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
        ScannerUtil.takeString("Username", "Username is an English word.", "Admin");
        OutputUtil.clearScreen();

        ScannerUtil.takeString("Password", "Password is an English word with numbers.", "Admin01");
        OutputUtil.clearScreen();
    }

    public static void displayOptions() 
    {
        OutputUtil.clearScreen();
        System.out.println("01. Display");
        System.out.println("02. Add/Remove Car");
        System.out.println("03. Add/Remove Employee");
        System.out.println("04. Reset Password");

        // break?
        switch (ScannerUtil.takeInteger(4, 1))
        {
            case(1):
                OutputUtil.clearScreen();
                displayOptionOne();
                break;
            case(2):
                OutputUtil.clearScreen();
                displayOptionTwo();
                break;
            case(3):
                OutputUtil.clearScreen();
                displayOptionThree();
                break;
            case(4):
                OutputUtil.clearScreen();
                displayOptionFour();
                break;
        }
    }

    public static void displayOptionOne() 
    {
        System.out.println("01. Display Customers");
        System.out.println("02. Display Rented Cars");
        System.out.println("03. Display Sold Cars");
        System.out.println();
        System.out.println("00. Back");

        switch (ScannerUtil.takeInteger(3, 0))
        {
            case(1):
                OutputUtil.clearScreen();
                Employee.displayCustomer();
                break;
            case(2):
                OutputUtil.clearScreen();
                Employee.displayRe();
                break;
            case(3):
                OutputUtil.clearScreen();
                displayOptionThree();
                break;
            case(0):
                OutputUtil.clearScreen();
                displayOptions();
                break;
        }

        OutputUtil.clearScreen();
    }

    public static void displayOptionTwo() 
    {
        System.out.println("01. Add Car");
        System.out.println("02. Remove Car");
        System.out.println();
        System.out.println("00. Back");

        switch (ScannerUtil.takeInteger(2, 0))
        {
            case(1):
                OutputUtil.clearScreen();
                Employee.displayCustomer();
                break;
            case(2):
                OutputUtil.clearScreen();
                Employee.displayRe();
                break;
            case(0):
                OutputUtil.clearScreen();
                displayOptions();
                break;
        }
    }

    public static void displayOptionThree() 
    {
        System.out.println("01. Add Employee");
        System.out.println("02. Remove Employee");
        System.out.println();
        System.out.println("00. Back");

        switch (ScannerUtil.takeInteger(2, 0))
        {
            case(1):
                OutputUtil.clearScreen();
                Employee.displayCustomer();
                break;
            case(2):
                OutputUtil.clearScreen();
                Employee.displayRe();
                break;
            case(0):
                OutputUtil.clearScreen();
                displayOptions();
                break;
        }
    }

    public static void displayOptionFour() 
    {
        Storage.admin.resetPassword();
        Storage.admin.showData();
    }
}