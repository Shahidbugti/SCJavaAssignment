package Figures;


interface Engine {
    void move();
}

interface Driver {
    void navigate(String destination);
}

// Combustion engine implementation
class CombustionEngine implements Engine {
    public void move() {
        System.out.println("Combustion engine: Moving with fuel power...");
    }
}

// Electric engine implementation
class ElectricEngine implements Engine {
    public void move() {
        System.out.println("Electric engine: Moving quietly with battery power...");
    }
}

// Human driver implementation
class Human implements Driver {
    public void navigate(String destination) {
        System.out.println("Human driver: Driving towards " + destination + " using GPS.");
    }
}

// Robot driver implementation
class Robot implements Driver {
    public void navigate(String destination) {
        System.out.println("Robot driver: Navigating automatically to " + destination + ".");
    }
}

// Transport class uses composition (Engine + Driver)
class Transport {
    private Engine engine;
    private Driver driver;

    public Transport(Engine engine, Driver driver) {
        this.engine = engine;
        this.driver = driver;
    }

    public void deliver(String destination, String cargo) {
        System.out.println("\n--- Transport Delivery Started ---");
        System.out.println("Cargo: " + cargo);
        driver.navigate(destination);
        engine.move();
        System.out.println("Arrived at " + destination + " and delivered " + cargo);
        System.out.println("--- Delivery Completed ---");
    }
}

public class Fig2 {
    public static void main(String[] args) {

        Engine combustion = new CombustionEngine();
        Engine electric = new ElectricEngine();

        Driver human = new Human();
        Driver robot = new Robot();

        // Creating transports using composition
        Transport truck = new Transport(combustion, human);
        Transport drone = new Transport(electric, robot);

        // Delivering cargo
        truck.deliver("Warehouse 42", "Food Supplies");
        drone.deliver("City Center", "Electronics");
    }
}
