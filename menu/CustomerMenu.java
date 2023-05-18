package menu;

import utility.OutputUtil;
import utility.ScannerUtil;

public class CustomerMenu
{
    public static void start()
    {

    }

    public static void login() 
    {
        System.out.println("01. Login In:");
        System.out.println("02. Guest:");
        System.out.println();

        OutputUtil.clearScreen();
        
    }

    public static void displayOptionTwo() 
    {
        OutputUtil.clearScreen();
    
        System.out.println("01. Rent Car/s");
        System.out.println("02. Buy Car/s");
        System.out.println();



    }

    public static void displayRentalOptions() 
    {
        System.out.println("01. Start Date:");
        System.out.println("02. End Date:");
        System.out.println();

        OutputUtil.clearScreen();
    }

    public static void displayDataFields() 
    {
        System.out.println("Email");
        System.out.println();
        System.out.println("Username");
        System.out.println();
        System.out.println("Password");
        System.out.println();
        System.out.println("Phone Number");
        System.out.println();
        System.out.println("National Identification Number");
        System.out.println();
        System.out.println("Insurance");
        System.out.println();
        System.out.println("0. Back");

        OutputUtil.clearScreen();
    }

}