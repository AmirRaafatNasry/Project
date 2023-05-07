package menu.guides;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MenuController
{
    // Attributes
    private int option;

    // Getters (Accessors) & Setters (Mutators)
    public int getOption() 
    {
        return option;
    }
    public void setOption(int option) 
    {
        this.option = option;
    }

    // Methods
    public static int chooseOption() 
    {
        // need to check
        while (true) 
        {
            try 
            {
                Scanner input = new Scanner(System.in);
                int option = input.nextInt();
                return option;

            } 
            catch (InputMismatchException exception) 
            {
                System.out.println("Enter a number!");
            }
        }
    }

    public static void takeText(String text) 
    {
        // need to check
        while (true) 
        {
            try 
            {
                Scanner input = new Scanner(System.in);
                int option = input.nextInt();
                // return option;

            } catch (InputMismatchException exception) {
                System.out.println("Enter a number!");
            }
        }
    }

    public static void clearScreen() 
    {
        // \033: It represents the ASCII escape character.
        // [: It represents the escape sequence. It is also known as CSI (Control
        // Sequence Indicator).
        // H: It moves the cursor at the top left corner of the screen or console.
        // 2J: It clears the screen from the cursor to the end of the screen.
        System.out.print("\033[H\033[2J");
        // flush(): Resets the cursor position at the top of the screen.
        System.out.flush();
    }

    public static void delayMessage() 
    {
        try 
        {
            Thread.sleep(1000);
        } 
        catch (InterruptedException exception) 
        {
            Thread.currentThread().interrupt();
        }
    }
}