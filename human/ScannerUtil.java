package human;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtil 
{
    static Scanner input = new Scanner(System.in);

    public static void takeString()
    {
        String text = input.next();
    }

    public static void takeInteger()
    {
        String number = input.next();
    }


}
