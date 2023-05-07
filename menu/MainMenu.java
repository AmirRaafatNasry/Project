package menu;

import java.lang.ModuleLayer.Controller;

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
        Controller.delayMessages();
        Controller.delayMessages();
        System.out.println("Choose by typing the number next to the option");
    }

    public void chooseUser()
    {
        printRules();

        System.out.println("1. Customer");
        System.out.println("2. Employee");

        Controller.chooseOption();
        Controller.clearScreen();

        if (Console.chooseOption() == 1)
        {


        }
        else
        {
            EmployeeMenu.login();
            switch ()
            {
                case (1): EmployeeMenu.b();
                        
                case (2) : EmployeeMenu.c();
                case (3) : EmployeeMenu.d();

            }
        }

    }
}