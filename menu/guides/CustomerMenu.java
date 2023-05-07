package menu.guides;

public abstract class CustomerMenu 
{
    public void rentOrBuy() 
    {
        optionLevel = 01;

        System.out.println("01. Rent");
        System.out.println("02. Buy");
        System.out.println();
        System.out.println("0. Back");

        Functions.chooseOption();
        Functions.clearScreen();
    }

    public void price() 
    {
        optionLevel = 2;

        System.out.println(" Maximum Price");
        System.out.println();
        System.out.println("0. Back");

        Functions.chooseOption();
        Functions.clearScreen();
    }

    public void disabled() 
    {
        optionLevel = 2;

        System.out.println("Car for disabled?");
        System.out.println();
        System.out.println("0. Back");

        Functions.chooseOption();
        Functions.clearScreen();
    }

    public void carBodyType()
    {
        optionLevel = 2;

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

        Functions.chooseOption();
        Functions.clearScreen();
    }

    public void fuelType()
    {
        optionLevel = 2;

        System.out.println("Fuel Type");
        System.out.println("01. Electric");
        System.out.println("02. Gasoline");
        System.out.println("03. Diesel");
        System.out.println("04. CNG");
        System.out.println();
        System.out.println("0. Back");

        Functions.chooseOption();
        Functions.clearScreen();
    }

    public void automaticOrManual() 
    {
        optionLevel = 2;

        System.out.println("Transmission Type");
        System.out.println("01. Automatic");
        System.out.println("02. Manual");
        System.out.println();
        System.out.println("0. Back");

        Functions.chooseOption();
        Functions.clearScreen();
    }

    public void numberOfSeats() 
    {
        optionLevel = 2;

        System.out.println("Number of Seats");
        System.out.println();
        System.out.println("0. Back");

        Functions.chooseOption();
        Functions.clearScreen();
    }

    public void year() 
    {
        optionLevel = 2;

        System.out.println("Year");
        System.out.println();
        System.out.println("0. Back");

        Functions.chooseOption();
        Functions.clearScreen();
    }

    public void color() 
    {
        optionLevel = 2;

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

        Functions.chooseOption();
        Functions.clearScreen();
    }

    public void condition() 
    {
        optionLevel = 2;

        System.out.println("Condition");
        System.out.println("01. Zero");
        System.out.println("02. Used");
        System.out.println();
        System.out.println("0. Back");

        Functions.chooseOption();
        Functions.clearScreen();
    }

    public void kilometers() 
    {
        optionLevel = 2;

        System.out.println("Kilometers");
        System.out.println();
        System.out.println("0. Back");

        Functions.chooseOption();
        Functions.clearScreen();
    }

    public void userData() 
    {
        optionLevel = 2;

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

        Functions.chooseOption();
        Functions.clearScreen();
    }

    public void paymentMethod() 
    {
        optionLevel = 2;

        System.out.println("Payment methods:");
        System.out.println("01. Cash");
        System.out.println("02. Visa");
        System.out.println("03. Installment ");
        System.out.println();
        System.out.println("0. Back");

        Functions.chooseOption();
        Functions.clearScreen();
    }

    public void visa()
    {
        optionLevel = 2;

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

        System.out.println("CARD NUMBER");

        System.out.println("EXPIRY DATE");

        System.out.println("CVV");

        Functions.chooseOption();
        Functions.clearScreen();
    }

    public void Installment() 
    {
        optionLevel = 2;

        System.out.println("Installment");
        System.out.println("01. 12 Months");
        System.out.println("02. 24 Months");
        System.out.println();
        System.out.println("0. Back");

        Functions.chooseOption();
        Functions.clearScreen();
    }

    public void cash() 
    {
        optionLevel = 2;

        System.out.println("Cash");
        System.out.println();
        System.out.println();
        System.out.println("0. Back");

        Functions.chooseOption();
        Functions.clearScreen();
    }
}