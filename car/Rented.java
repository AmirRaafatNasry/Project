package car;

public class Rented extends Car
{
    // Attributes
    private int rentalStartDate;
    private int rentalTime;
    private int rentalEndDate;

    // Constructor
    public Rented(boolean disabled, String bodyType, String fuelType, String transmissionType, String color, int numberOfSeats, int rentalStartDate, int rentalTime, int rentalEndDate) 
    {
        super(disabled, bodyType, fuelType, transmissionType, color, numberOfSeats);
        this.rentalStartDate = rentalStartDate;
        this.rentalTime = rentalTime;
        this.rentalEndDate = rentalEndDate;
    }

    // Getters (Accessors) & Setters (Mutators)
    public int getRentalStartDate() 
    {
        return rentalStartDate;
    }
    public void setRentalStartDate(int rentalStartDate)
    {
        this.rentalStartDate = rentalStartDate;
    }

    public int getRentalTime() 
    {
        return rentalTime;
    }
    public void setRentalTime(int rentalTime) 
    {
        this.rentalTime = rentalTime;
    }

    public int getRentalEndDate() 
    {
        return rentalEndDate;
    }
    public void setRentalEndDate(int rentalEndDate) 
    {
        this.rentalEndDate = rentalEndDate;
    }


    // Methods
    public void calculateRentalPrice()
    {
        
    }
}
