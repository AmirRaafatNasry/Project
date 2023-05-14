package menu;

import utility.OutputUtil;
import utility.ScannerUtil;
public class MainMenu
{
    public static void start()
    {
        printTermsAndConditions();
        printInstructions();
        chooseUser();
    }

    public static void printTermsAndConditions() 
    {
        System.out.println("--------------------------------------------------");
        System.out.println("\"Quality is Job One.\"");
        System.out.println("- Canadian International College (CIC) Car Agency");
        System.out.println("--------------------------------------------------");
        System.out.println("Terms & Condition");

        System.out.println("01. ");
        System.out.println("    A) ");
        System.out.println("    B) ");
        System.out.println("    C) ");

        System.out.println("02. ");

        System.out.println("03. ");
        System.out.println("    A) ");
        System.out.println("    B) ");

        System.out.println("04. ");

        System.out.println("05 ");
        System.out.println("    A) ");
        System.out.println("    B) ");
        System.out.println("    C) ");
        System.out.println("    D) ");
        System.out.println("---------------------------------------------------");
        System.out.println();

        ScannerUtil.takeString("Do you agree to our Terms & Conditions? [Y/N]", "Expected Y", "Y");
        OutputUtil.clearScreen();
    }
    
    public static void printInstructions() 
    {
        System.out.println("---------------------------------------------------");
        System.out.println("01. ");
        System.out.println("02. ");
        System.out.println("03. ");
        System.out.println("04. ");
        System.out.println("---------------------------------------------------");
        System.out.println();

        ScannerUtil.takeString("Proceed? [Y/N]", "Expected Y", "Y");
        OutputUtil.clearScreen();
    }

    public static void chooseUser()
    {
        System.out.println("1. Customer");
        System.out.println("2. Employee");

        switch (ScannerUtil.takeInteger(2, 1)) 
        {
            case (1):
                OutputUtil.clearScreen();
                CustomerMenu.start();
                break;
            case (2):
                OutputUtil.clearScreen();
                EmployeeMenu.start();
                break;
        }
    }
}