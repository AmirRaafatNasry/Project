package menu;

import utility.OutputUtil;
import utility.ScannerUtil;

public class CustomerMenu
{
    public static void start()
    {
        login();
    }

    public static void login() 
    {
        OutputUtil.clearScreen();
        System.out.println("01. Login in");
        System.out.println("02. Sign up");
        System.out.println("03. log in as Guest");
        System.out.println();

        switch (ScannerUtil.takeInteger(1, 2))
        {
            case(1):
                // TODO finish this
                break;
            case(2):
                // TODO finish this
                break;
            case(3):
                displayOptionTwo();
                break;
        }
    }

    public static void displayOptionTwo() 
    {
        OutputUtil.clearScreen();
        System.out.println("01. Rent Car/s");
        System.out.println("02. Buy Car/s");
        System.out.println();

        switch (ScannerUtil.takeInteger(1, 2))
        {
            case(1):
                // TODO finish this
                break;
            case(2):
                displayOptionTwo();
                break;
        }
    }

    public static void displayRentalOptions() 
    {
        OutputUtil.clearScreen();
        System.out.println("01. Start Date:");
        System.out.println("02. End Date:");
        System.out.println();

        switch (ScannerUtil.takeInteger(1, 2))
        {
            case(1):
                // TODO finish this
                break;
            case(2):
                displayOptionTwo();
                break;
        }
    }

    public static void displayDataFields() 
    {
        OutputUtil.clearScreen();
        System.out.println("Email");
        System.out.println("Username");
        System.out.println("Password");
        System.out.println("Phone Number");
        System.out.println("National Identification Number");
        System.out.println("Insurance");
        System.out.println("00. Back");

    }
}