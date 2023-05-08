package menu.guides;

import human.ScannerUtil;
import human.Storage;

public class CarMenu 
{
    
    public static void carMenuStart()
    {
        System.out.println("Car Specifications ");
        MenuController.delayMessage();

        while (true) 
        {
            askIfDisabled();
            switch (ScannerUtil.takeInteger(2, 1)) 
            {
                case(0):
                    askIfDisabled();
                    break;
                default:
                    displayCarBodyType();
                    switch (ScannerUtil.takeInteger(8, 1)) 
                    {
                        case (0):
                            askIfDisabled();
                            break;
                        default:
                            displayCarBodyType();

                    }
            }
            }
    }

    public static void askIfDisabled() 
    {
        System.out.println("Car for disabled?");
        System.out.println();
        // input????????
        // 

        MenuController.clearScreen();
    }

    public static void displayCarBodyType()
    {
        System.out.println("Available Body Types");
        System.out.println("01. Hatchback");
        System.out.println("02. Muscle");
        System.out.println("03. Sports");
        System.out.println("04. Estate");
        System.out.println("05. Coupe");
        System.out.println("06. Sedan");
        System.out.println("07. Suv");
        System.out.println("08. Van");
        System.out.println();
        System.out.println("0. Back");
        

        MenuController.clearScreen();
    }

    public static void displayFuelType()
    {
        System.out.println("Fuel Type");
        System.out.println("01. Electric");
        System.out.println("02. Gasoline");
        System.out.println("03. Diesel");
        System.out.println("04. CNG");
        System.out.println();
        System.out.println("0. Back");

        MenuController.clearScreen();
    }

    public static void displayAutomaticOrManual() 
    {
        System.out.println("Transmission Type");
        System.out.println("01. Automatic");
        System.out.println("02. Manual");
        System.out.println();
        System.out.println("0. Back");

        MenuController.clearScreen();
    }

    public static void displayColor() 
    {
        System.out.println("Color");
        System.out.println("01. Black");
        System.out.println("02. White");
        System.out.println("03. Gray");
        System.out.println("04. Silver");
        System.out.println("05. Blue");
        System.out.println("06. Red");
        System.out.println("07. Brown");
        System.out.println("08. Gold");
        System.out.println("09. Green");
        System.out.println("10. Tan");
        System.out.println("11. Orange");
        System.out.println();
        System.out.println("0. Back");

        MenuController.clearScreen();
    }

    public static void displayNumberOfSeats() 
    {
        System.out.println("Number of Seats");
        System.out.println();
        System.out.println("0. Back");


        MenuController.clearScreen();
    }

}