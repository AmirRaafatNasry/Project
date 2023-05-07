package menu.guides;

import java.util.function.Function;

public abstract class EmployeeMenu 
{
    private static int option;
    private static int optionLevel;

    public int takeData() 
    {
        optionLevel = 01;

        System.out.println("Username");
        if (Employee.getPassword() == Function.takeText())
        System.out.println();
        System.out.println("Password");
        Function.takeText();
        System.out.println();
        System.out.println("0. Back");

        option = Functions.chooseOption();
        Functions.clearScreen();
        return option;
    }

    public int chooseEmployeeOptions() 
    {
        optionLevel = 02;

        System.out.println("1. Display");
        System.out.println("2. Add/Remove Car");
        System.out.println("3. Reset Password");
        System.out.println();
        System.out.println("0. Back");

        option = Functions.chooseOption();
        Functions.clearScreen();
        return option;
    }

    public int levelThreeA() 
    {
        optionLevel = 03;

        System.out.println("1. Display Customers");
        System.out.println("2. Display Rented Cars");
        System.out.println("3. Display Sold Cars");
        System.out.println("4. Display Cars in Maintenance ");
        System.out.println();
        System.out.println("0. Back");

        option = Functions.chooseOption();
        Functions.clearScreen();
        return option;
    }

    public int levelThreeB() 
    {
        optionLevel = 04;

        System.out.println("1. Add Car");
        System.out.println("2. Remove Car");
        System.out.println();
        System.out.println("0. Back");

        Functions.chooseOption();
        Functions.clearScreen();
    }

    public void levelThreeC()
    {
        optionLevel =  05;
        // employee.resetPassword();
    }
}