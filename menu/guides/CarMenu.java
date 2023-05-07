package menu.guides;

public class CarMenu 
{
    public void disabled() 
    {
        System.out.println("Car for disabled?");
        System.out.println();
        System.out.println("0. Back");

        MenuController.chooseOption();
        MenuController.clearScreen();
    }

    public void carBodyType()
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

        MenuController.chooseOption();
        MenuController.clearScreen();
    }

    public void fuelType()
    {
        System.out.println("Fuel Type");
        System.out.println("01. Electric");
        System.out.println("02. Gasoline");
        System.out.println("03. Diesel");
        System.out.println("04. CNG");
        System.out.println();
        System.out.println("0. Back");

        MenuController.chooseOption();
        MenuController.clearScreen();
    }

    public void automaticOrManual() 
    {
        System.out.println("Transmission Type");
        System.out.println("01. Automatic");
        System.out.println("02. Manual");
        System.out.println();
        System.out.println("0. Back");

        MenuController.chooseOption();
        MenuController.clearScreen();
    }

    public void color() 
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

        MenuController.chooseOption();
        MenuController.clearScreen();
    }

    public void numberOfSeats() 
    {
        System.out.println("Number of Seats");
        System.out.println();
        System.out.println("0. Back");

        MenuController.chooseOption();
        MenuController.clearScreen();
    }

}