package menu.guides;

import human.Employee;

public class EmployeeMenu /* implements EmployeeOptions */
{
    private static int option;

    public static int takeData() 
    {
        Employee.takeUsername();
        
        System.out.println();
        System.out.println("Password");
        Controller.takeText();
        System.out.println();
        System.out.println("0. Back");

        option = Controller.chooseOption();
        Controller.clearScreen();
        return option;
    }

    public static int chooseEmployeeOptions() 
    {
        System.out.println("1. Display");
        System.out.println("2. Add/Remove Car");
        System.out.println("3. Reset Password");
        System.out.println();
        System.out.println("0. Back");

        option = Controller.chooseOption();
        Controller.clearScreen();
        return option;
    }

    public static int levelThreeA() 
    {
        System.out.println("1. Display Customers");
        System.out.println("2. Display Rented Cars");
        System.out.println("3. Display Sold Cars");
        System.out.println();
        System.out.println("0. Back");

        option = Controller.chooseOption();
        Controller.clearScreen();
        return option;
    }

    public static int levelThreeB() 
    {
        System.out.println("1. Add Car");
        System.out.println("2. Remove Car");
        System.out.println();
        System.out.println("0. Back");

        option = Controller.chooseOption();
        Controller.clearScreen();
        return option;
    }

    public static void levelThreeC()
    {
        // employee.resetPassword();
    }
}