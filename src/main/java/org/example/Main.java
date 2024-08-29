

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Vehicle vehicle1 = new Vehicle(4, "Blue", 2.0f, "Petrol");
       Car car1 = new Car(4, "Red", 3.5f, "Diesel", "Toyota");

        System.out.println("Vehicle:");
        System.out.println("Number of Wheels: " + vehicle1.getNumberofWheels());
        System.out.println("Color: " + vehicle1.getColor());
        System.out.println("Engine Size: " + vehicle1.getEngineSize());
        System.out.println("Fuel Type: " + vehicle1.getFuelType());


        car1.honk();
        car1.displayInfo();
        }
    }
