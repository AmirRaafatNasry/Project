package menu;

import utility.OutputUtil;
import utility.ScannerUtil;

public class CustomerMenu
{
    public static void start()
    {
        while (true) 
        {
            CarMenu.carMenuStart();
            switch (ScannerUtil.takeInteger(2, 1)) 
            {
                case (1):
                    displayRentalOptions();
                case(2):

            }
        }
    }

    public static void displayLevelOne() 
    {
        System.out.println("01. Rent");
        System.out.println("02. Buy");

        OutputUtil.clearScreen();
    }

    public static void displayRentalOptions() 
    {
        System.out.println("01. Start Date:");
        System.out.println("02. End Date:");
        System.out.println();

        OutputUtil.clearScreen();
    }

    public static void displayDataFields() 
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

        OutputUtil.clearScreen();
    }

    public static void paymentMethod() 
    {
        System.out.println("Payment methods:");
        System.out.println("01. Cash");
        System.out.println("02. Visa");
        System.out.println("03. Installment ");
        System.out.println();
        System.out.println("0. Back");

        OutputUtil.clearScreen();
    }

    public static void visa()
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
        OutputUtil.delayMessage();
        
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

        OutputUtil.delayMessage();
        System.out.println();
        System.out.println("CARD NUMBER");
        // takes input

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

        OutputUtil.delayMessage();
        System.out.println();
        System.out.println("EXPIRY DATE");
        // takes input

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

        OutputUtil.delayMessage();
        System.out.println();
        System.out.println("CVV");
        // takes input

        OutputUtil.clearScreen();
    }

    public static void Installment() 
    {
        System.out.println("Installment");
        System.out.println("01. 12 Months");
        System.out.println("02. 24 Months");
        System.out.println();
        System.out.println("0. Back");

        OutputUtil.clearScreen();
    }

    public static void cash() 
    {
        System.out.println("Cash");
        System.out.println();
        System.out.println("0. Back");

        OutputUtil.clearScreen();
    }
}