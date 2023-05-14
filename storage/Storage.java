package storage;


import java.util.ArrayList;

import car.Car;
import car.Rented;
import car.Sold;
import human.Customer;
import human.Employee;

public class Storage 
{
    public static Employee admin = new Employee("amirraafatnasry@gmail.com","Admin", "Password01", "+20 128 543 6145");
    
    public static ArrayList<Customer> customers; 
    public static ArrayList<Employee> employees; 
    public static ArrayList<Rented> rentedCars; 
    public static ArrayList<Car> availableCars; 
    public static ArrayList<Sold> soldCars; 
}
