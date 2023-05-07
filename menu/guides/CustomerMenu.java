package menu.guides;

public class CustomerMenu /*implements CustomerOptions*/
{
    public void rentOrBuy() 
    {
        System.out.println("01. Rent");
        System.out.println("02. Buy");
        System.out.println();

        MenuController.chooseOption();
        MenuController.clearScreen();
    }

    public void dateOfRental() {
        System.out.println("01. Start Date:");
        System.out.println("02. End Date: ");
        System.out.println();

        MenuController.chooseOption();
        MenuController.clearScreen();
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

        MenuController.chooseOption();
        MenuController.clearScreen();
    }

    public void paymentMethod() 
    {
        System.out.println("Payment methods:");
        System.out.println("01. Cash");
        System.out.println("02. Visa");
        System.out.println("03. Installment ");
        System.out.println();
        System.out.println("0. Back");

        MenuController.chooseOption();
        MenuController.clearScreen();
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
        MenuController.delayMessage();
        
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

        MenuController.delayMessage();
        System.out.println();
        System.out.println("CARD NUMBER");
        MenuController.chooseOption();
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

        MenuController.delayMessage();
        System.out.println();
        System.out.println("EXPIRY DATE");
        MenuController.chooseOption();
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

        MenuController.delayMessage();
        System.out.println();
        System.out.println("CVV");

        MenuController.chooseOption();
        MenuController.clearScreen();
    }

    public void Installment() 
    {
        System.out.println("Installment");
        System.out.println("01. 12 Months");
        System.out.println("02. 24 Months");
        System.out.println();
        System.out.println("0. Back");

        MenuController.chooseOption();
        MenuController.clearScreen();
    }

    public void cash() 
    {
        System.out.println("Cash");
        System.out.println();
        System.out.println("0. Back");

        MenuController.chooseOption();
        MenuController.clearScreen();
    }
}