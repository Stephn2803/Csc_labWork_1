package org.example;

/**
 * class contains methods to set and get class members
 */
public class Vehicle {
    //class members
    private int numberOfWheels;
     private String color;
     private float engineSize;
     private String fuelType;

    //default constructor
    public Vehicle(){
        numberOfWheels = 4;
        color = "";
        engineSize = 0;
        fuelType = "";
    }

    //parameter constructor
    public Vehicle(int numberOfWheels,String color,float engineSize,String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    /**
     * method sets numberOfWheels member
     * @param numberOfWheels
     */
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    /**
     * method returns numberOfWheels member
     * @return numberOfWheels
     */
    public int getNumberofWheels() {
        return numberOfWheels;
    }

    /**
     * method sets color member
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * method returns color class member
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * sets enginSize class member
     * @param engineSize
     */
    public void setEngineSize(float engineSize) {
        this.engineSize  = engineSize ;
    }

    /**
     * method gets engineSize class member
     * @return engineSize
     */
    public float getEngineSize() {
        return engineSize;
    }

    /**
     * method sets fuelType class member
     * @param fuelType
     */
    public void setFuelType(String fuelType ) {
        this.fuelType   = fuelType  ;
    }

    /**
     * method gets fuelType class member
     * @return fuelType
     */
    public String getFuelType() {
        return fuelType;
    }

}
