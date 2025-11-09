package Figures;

import java.util.*;


interface Employee {
    void doWork();
}

// Concrete employee types
class Designer implements Employee {
    public void doWork() {
        System.out.println("Designer: Creating game art and UI designs...");
    }
}

class Artist implements Employee {
    public void doWork() {
        System.out.println("Artist: Drawing characters and environments...");
    }
}

class Programmer implements Employee {
    public void doWork() {
        System.out.println("Programmer: Writing and debugging code...");
    }
}

class Tester implements Employee {
    public void doWork() {
        System.out.println("Tester: Testing the software for bugs...");
    }
}


// Abstract Company class - contains the factory method
abstract class Company {
    
    // Factory Method (implemented differently by subclasses)
    protected abstract List<Employee> getEmployees();

    // Common method that uses factory-created employees
    public void createSoftware() {
        System.out.println("\n" + this.getClass().getSimpleName() + " is starting a new project...");
        List<Employee> team = getEmployees();
        for (Employee e : team) {
            e.doWork();
        }
        System.out.println(this.getClass().getSimpleName() + " has completed the project!\n");
    }
}

// Concrete Company Classes (each provides its own employee set)

class GameDevCompany extends Company {
    protected List<Employee> getEmployees() {
        List<Employee> team = new ArrayList<>();
        team.add(new Designer());
        team.add(new Artist());
        return team;
    }
}

class OutsourcingCompany extends Company {
    protected List<Employee> getEmployees() {
        List<Employee> team = new ArrayList<>();
        team.add(new Programmer());
        team.add(new Tester());
        return team;
    }
}


// Main Class
public class Fig3 {
    public static void main(String[] args) {

        Company gameDev = new GameDevCompany();
        Company outsourcing = new OutsourcingCompany();

        // Both companies use the same process, but create different teams
        gameDev.createSoftware();
        outsourcing.createSoftware();
    }
}
