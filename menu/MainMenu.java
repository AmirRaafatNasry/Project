package menu;

import menu.guides.CustomerMenu;
import menu.guides.EmployeeMenu;
import menu.guides.MenuController;

public class MainMenu
{
    public static void mainMenuStart()
    {
        printRules();
        // chooseUser();
        
        
    }

    public static void printRules() 
    {
        System.out.println("Welcome to \"????????????\" Agency!");
        MenuController.delayMessage();
        System.out.println("Choose by typing the number next to the option");
        System.out.println("You cannot go back to the main menu");
        System.out.println("Choose by typing the number next to the option");
        System.out.println("Choose by typing the number next to the option");
        System.out.println("Choose by typing the number next to the option");
        System.out.println("Choose by typing the number next to the option");
        MenuController.delayMessage();
    }

    public static int chooseUser()
    {
        System.out.println("1. Customer");
        System.out.println("2. Employee");

        MenuController.delayMessage();
        MenuController.clearScreen();

        switch (MenuController.chooseOption())
        {
            case (1): CustomerMenu.customerMenuStart();
                    break;
            case (2): EmployeeMenu.employeeMenuStart();
                    break;
        }

    }