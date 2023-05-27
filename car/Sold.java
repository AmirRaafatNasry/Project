package car;

public class Sold extends Car 
{
    // Attributes
    private int sellDate;

    // Constructor
    public Sold(String accessibility, String bodyType, String fuelType, String transmissionType, String color, int numberOfSeats, int sellDate) 
    {
        super(accessibility, bodyType, fuelType, transmissionType, color, numberOfSeats);
        this.sellDate = sellDate;
    }

    // Getters (Accessors) & Setters (Mutators)
    public int getSellDate() 
    {
        return sellDate;
    }
    public void setSellDate(int sellDate) 
    {
        this.sellDate = sellDate;
    }
}