package menu.guides;

public class CustomerMenu /*implements CustomerOptions*/
{
    public void rentOrBuy() 
    {
        System.out.println("01. Rent");
        System.out.println("02. Buy");
        System.out.println();
        System.out.println("0. Back");

        Controller.chooseOption();
        Controller.clearScreen();
    }

    public void price() 
    {
        System.out.println(" Maximum Price");
        System.out.println();
        System.out.println("0. Back");

        Controller.chooseOption();
        Controller.clearScreen();
    }

    public void disabled() 
    {
        System.out.println("Car for disabled?");
        System.out.println();
        System.out.println("0. Back");

        Controller.chooseOption();
        Controller.clearScreen();
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

        Controller.chooseOption();
        Controller.clearScreen();
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

        Controller.chooseOption();
        Controller.clearScreen();
    }

    public void automaticOrManual() 
    {
        System.out.println("Transmission Type");
        System.out.println("01. Automatic");
        System.out.println("02. Manual");
        System.out.println();
        System.out.println("0. Back");

        Controller.chooseOption();
        Controller.clearScreen();
    }

    public void numberOfSeats() 
    {
        System.out.println("Number of Seats");
        System.out.println();
        System.out.println("0. Back");

        Controller.chooseOption();
        Controller.clearScreen();
    }

    public void year() 
    {
        System.out.println("Year");
        System.out.println();
        System.out.println("0. Back");

        Controller.chooseOption();
        Controller.clearScreen();
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

        Controller.chooseOption();
        Controller.clearScreen();
    }

    public void condition() 
    {
        System.out.println("Condition");
        System.out.println("01. Zero");
        System.out.println("02. Used");
        System.out.println();
        System.out.println("0. Back");

        Controller.chooseOption();
        Controller.clearScreen();
    }

    public void kilometers() 
    {
        System.out.println("Kilometers");
        System.out.println();
        System.out.println("0. Back");

        Controller.chooseOption();
        Controller.clearScreen();
    }

    public void userData() 
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

        Controller.chooseOption();
        Controller.clearScreen();
    }

    public void paymentMethod() 
    {
        System.out.println("Payment methods:");
        System.out.println("01. Cash");
        System.out.println("02. Visa");
        System.out.println("03. Installment ");
        System.out.println();
        System.out.println("0. Back");

        Controller.chooseOption();
        Controller.clearScreen();
    }

    public void visa()
    {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("┃                                     ┃");
        System.out.println("┃ CARD NUMBER                         ┃");
        System.out.println("┃ XXXX  XXXX  XXXX  XXXX              ┃");
        System.out.println("┃                                     ┃");
        System.out.println("┃ EXPIRY DATE                         ┃");
        System.out.println("┃ MM/YY                               ┃");
        System.out.println("┃                                     ┃");
        System.out.println("┃                             VISA    ┃");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        
        System.out.println();
        Controller.delay();
        
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("┃                                     ┃");
        System.out.println("┃ CARD NUMBER                         ┃");
        System.out.println("┃ XXXX  XXXX  XXXX  XXXX              ┃");
        System.out.println("┃                                     ┃");
        System.out.println("┃                                     ┃");
        System.out.println("┃                                     ┃");
        System.out.println("┃                                     ┃");
        System.out.println("┃                             VISA    ┃");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        Controller.delay();
        System.out.println();
        System.out.println("CARD NUMBER");
        Console.chooseOption();
        System.out.println();

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("┃                                     ┃");
        System.out.println("┃                                     ┃");
        System.out.println("┃                                     ┃");
        System.out.println("┃                                     ┃");
        System.out.println("┃ EXPIRY DATE                         ┃");
        System.out.println("┃ MM/YY                               ┃");
        System.out.println("┃                                     ┃");
        System.out.println("┃                             VISA    ┃");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        Controller.delay();
        System.out.println();
        System.out.println("EXPIRY DATE");
        Console.chooseOption();
        System.out.println();

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("┃                                     ┃");
        System.out.println("┃                 CVV                 ┃");
        System.out.println("┃ ||||||||||||||| XXX                 ┃");
        System.out.println("┃                                     ┃");
        System.out.println("┃                                     ┃");
        System.out.println("┃                                     ┃");
        System.out.println("┃                                     ┃");
        System.out.println("┃                                     ┃");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println();

        Controller.delay();
        System.out.println();
        System.out.println("CVV");
        Console.chooseOption();

        Controller.clearScreen();
    }

    public void Installment() 
    {
        System.out.println("Installment");
        System.out.println("01. 12 Months");
        System.out.println("02. 24 Months");
        System.out.println();
        System.out.println("0. Back");

        Controller.chooseOption();
        Controller.clearScreen();
    }

    public void cash() 
    {
        System.out.println("Cash");
        System.out.println();
        System.out.println();
        System.out.println("0. Back");

        Controller.chooseOption();
        Controller.clearScreen();
    }
}