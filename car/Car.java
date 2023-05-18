package car;

public class Car 
{
    // Attributes
    private boolean disabled;
    private String bodyType;
    private String fuelType;
    private String transmissionType;
    private String color;
    private int numberOfSeats;

    // Constructor
    public Car(boolean disabled, String bodyType, String fuelType, String transmissionType, String color,
            int numberOfSeats) {
        this.disabled = disabled;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
    }

    // Getters (Accessors) & Setters (Mutators)
    public boolean isDisabled() 
    {
        return disabled;
    }
    public void setDisabled(boolean disabled) 
    {
        this.disabled = disabled;
    }

    public String getBodyType() 
    {
        return bodyType;
    }
    public void setBodyType(String bodyType) 
    {
        this.bodyType = bodyType;
    }

    public String getFuelType() 
    {
        return fuelType;
    }
    public void setFuelType(String fuelType) 
    {
        this.fuelType = fuelType;
    }

    public String getTransmissionType() 
    {
        return transmissionType;
    }
    public void setTransmissionType(String transmissionType) 
    {
        this.transmissionType = transmissionType;
    }

    public String getColor() 
    {
        return color;
    }
    public void setColor(String color) 
    {
        this.color = color;
    }

    public int getNumberOfSeats() 
    {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) 
    {
        this.numberOfSeats = numberOfSeats;
    }

    // Methods
    public void calculatePrice(boolean disabled, String bodyType, String fuelType, String transimssionType, String Color , int numberOfSeats)
    {

    }
}