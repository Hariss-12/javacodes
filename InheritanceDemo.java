class Vehicle {
    String brand;
    int speed;

    void start() {
        System.out.println(brand + " is starting...");
    }

    void stop() {
        System.out.println(brand + " is stopping...");
    }
}
class Car extends Vehicle {
    void showCar() {
        System.out.println("This is a Car.");
    }
}
class Bike extends Vehicle {
    void showBike() {
        System.out.println("This is a Bike.");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {

        Car c = new Car();
        c.brand = "Toyota";
        c.start();
        c.showCar();
        c.stop();

        Bike b = new Bike();
        b.brand = "Royal Enfield";
        b.start();
        b.showBike();
        b.stop();
    }
}
