package menu;

import menu.guides.CustomerMenu;
import menu.guides.EmployeeMenu;

public class MainMenu extends EmployeeMenu, CustomerMenu
{
    public void start()
    {
        printRules();
        
        
    }

    public void printRules() 
    {
        System.out.println("Welcome to \"????????????\" Agency!");
        delay();
        System.out.println("Choose by typing the number next to the option");
    }

    public void chooseUser()
    {
        optionLevel = 1;

        System.out.println("1. Customer");
        System.out.println("2. Employee");
        System.out.println();
        System.out.println("0. Back");

        chooseOption();
        clearScreen();
    }
}