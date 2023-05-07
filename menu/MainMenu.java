package menu;

import menu.guides.Console;
import menu.guides.CustomerMenu;
import menu.guides.EmployeeMenu;

public class MainMenu
{
    public void start()
    {
        printRules();
        
        
    }

    public void printRules() 
    {
        System.out.println("Welcome to \"????????????\" Agency!");
        Console.delayMessages();
        Console.delayMessages();
        System.out.println("Choose by typing the number next to the option");
    }

    public void chooseUser()
    {
        printRules();

        System.out.println("1. Customer");
        System.out.println("2. Employee");

        Console.chooseOption();
        Console.clearScreen();

        if (Console.chooseOption() == 1)
        {


        }
        else
        {
            EmployeeMenu.takeData();
        }

    }
}