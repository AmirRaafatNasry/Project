package human;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtil 
{
    public static Scanner input = new Scanner(System.in);

    public static String takeString(String label, String hint, String expected) 
    {
        while (true)
        {
            try {
                System.out.println(label);
                String text = input.next();

                if (text == expected)
                    return text;
                else
                    System.out.println("Invalid " + label.toLowerCase() + ".");
            } catch (InputMismatchException exception) {
                System.out.println(hint);
                input.next();
            }
        }
    }

    public static int takeInteger(String label, String hint, int expected) 
    {
        while (true) 
        {
            try 
            {
                System.out.println(label);
                int number = input.nextInt();

                if (number == expected)
                    return number;
                else
                    System.out.println("Invalid " + label.toLowerCase() + ".");
            } 
            catch (InputMismatchException exception) 
            {
                System.out.println(hint);
                input.next();
            }
        }
    }

    public static int takeInteger(int maximum, int minimum) 
    {
        while (true) 
        {
            try 
            {
                int number = input.nextInt();

                if (number > maximum || number < minimum)
                    System.out.println("Wrong Entry.");
                else
                    return number;
            } 
            catch (InputMismatchException exception) 
            {
                System.out.println("Expected an integer");
                input.next();
            }
        }
    }
}