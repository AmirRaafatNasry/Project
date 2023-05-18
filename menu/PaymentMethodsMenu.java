package menu;

import utility.OutputUtil;
import utility.ScannerUtil;

public class PaymentMethodsMenu 
{
    public static void start()
    {
        System.out.println("Payment methods");
        OutputUtil.delayMessage();
        displayPaymentMethods();
    }

    public static void displayPaymentMethods() 
    {
        System.out.println("01. Cash");
        System.out.println("02. Card");
        System.out.println("03. Installment ");

        switch (ScannerUtil.takeInteger(1, 3))
        {
            case (1): 
                CustomerMenu.displayDataFields();
            case (2):

            case (3): 
        }

        OutputUtil.clearScreen();
    }

    public static void displayVisaOptions() 
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

        OutputUtil.delayMessage();
        OutputUtil.clearScreen();

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

        OutputUtil.delayMessage();
        OutputUtil.clearScreen();

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

        OutputUtil.clearScreen();

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

        OutputUtil.clearScreen();

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

    public static void displayInstallmentOptions() 
    {
        System.out.println("Installment");
        System.out.println("01. 12 Months");
        System.out.println("02. 24 Months");
        System.out.println();

        ScannerUtil.takeInteger(1, 2)
        OutputUtil.clearScreen();
    }
}
