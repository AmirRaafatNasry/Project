package menu;

import human.ScannerUtil;
import menu.guides.CustomerMenu;
import menu.guides.EmployeeMenu;
import menu.guides.MenuController;

public class MainMenu
{
    public static void mainMenuStart()
    {
        printRules();
        chooseUser();

        switch (ScannerUtil.takeInteger(2,1)) 
        {
            case (1):
                CustomerMenu.customerMenuStart();
                break;
            case (2):
                EmployeeMenu.employeeMenuStart();
                break;
        }
        mainMenuStart();
    }

    public static void printRules() 
    {
        System.out.println("Welcome to \"????????????\" Agency!");
        MenuController.delayMessage();
        System.out.println("Choose by typing the number next to the option");
        MenuController.delayMessage();
        System.out.println("You cannot go back to the main menu");
        MenuController.delayMessage();
        System.out.println("text");
        MenuController.delayMessage();
        System.out.println("text");
        MenuController.delayMessage();
        System.out.println("text");
        MenuController.delayMessage();

        MenuController.clearScreen();
    }

    public static void chooseUser()
    {
        System.out.println("1. Customer");
        System.out.println("2. Employee");

        MenuController.clearScreen();
    }
}