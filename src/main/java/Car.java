/**
 * class car that extends Vehicle
 */
public class Car extends Vehicle{
    private String brand;

    public Car() {}

    public Car(int numberofWheels, String color, float engineSize, String fuelType, String brand) {
        super ( numberofWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    /**
     * method sets brand class member
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * method gets brand class member
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * method that prints out "Honk, honk!"
     */
    public void honk() {
        System.out.println("Honk, honk!");
    }

    /**
     * method displays all attributes of the car object
     * included those inherited from Vehicle class
     */
    public void displayInfo() {
        System.out.println("the car has these specific specs...");
        System.out.println("The number of wheels: " + getNumberofWheels());
        System.out.println("The color of the car is: " + getColor());
        System.out.println("The size of the engine is: " + getEngineSize());
        System.out.println("The fuel type is: " + getFuelType());
        System.out.println("The brand is: " + getBrand());




    }
}
