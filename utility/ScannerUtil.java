package utility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtil 
{
    public static Scanner input = new Scanner(System.in);

    public static String takeString(String label, String message, String expected)
    {
        System.out.println(label);
        while (true)
        {
            String text = input.nextLine();
            if (text.equals(expected))
                return text;
            else
                System.out.println(message);
        }
    }

    public static String takeString() 
    {
        String text = input.nextLine();
        return text;
    }

    public static int takeInteger(String label, String message, int expected) 
    {
        System.out.println(label);
        while (true) 
        {
            try 
            {
                int number = input.nextInt();
                if (number == expected)
                    return number;
                else
                    System.out.println(message);
            } 
            catch (InputMismatchException exception) 
            {
                System.out.println("Expected Number!");
                input.next();
            }
        }
    }

    public static int takeInteger(int minimum, int maximum) 
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
                System.out.println("Expected Number!");
                input.next();
            }
        }
    }
}