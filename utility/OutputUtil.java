package utility;

public class OutputUtil 
{
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
            Thread.sleep(10000);
        } 
        catch (InterruptedException exception) 
        {
            Thread.currentThread().interrupt();
        }
    }
}