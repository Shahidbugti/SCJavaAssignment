package Figures;

interface Shipping {
    double getCost(Order order);
    String getDate(Order order);
}

class GroundShipping implements Shipping {
    public double getCost(Order order) {
        if (order.getTotal() > 100) {
            return 0;
        }
        double cost = order.getTotalWeight() * 1.5;
        return Math.max(10, cost);
    }

    public String getDate(Order order) {
        return "Delivery in 5 days (Ground)";
    }
}

class AirShipping implements Shipping {
    public double getCost(Order order) {
        return order.getTotalWeight() * 3.0;
    }

    public String getDate(Order order) {
        return "Delivery in 2 days (Air)";
    }
}

class Order {
    private double total;
    private double totalWeight;
    private Shipping shipping;

    public Order(double total, double totalWeight) {
        this.total = total;
        this.totalWeight = totalWeight;
    }

    public double getTotal() {
        return total;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public void showShippingDetails() {
        System.out.println("Order Total: $" + total);
        System.out.println("Weight: " + totalWeight + " kg");
        System.out.println("Shipping Cost: $" + shipping.getCost(this));
        System.out.println("Shipping Type: " + shipping.getDate(this));
        System.out.println("-------------------------------");
    }
}

public class Fig4 {
    public static void main(String[] args) {

        Order order1 = new Order(80, 5);
        Order order2 = new Order(150, 8);

        Shipping ground = new GroundShipping();
        Shipping air = new AirShipping();

        order1.setShipping(ground);
        order1.showShippingDetails();

        order2.setShipping(air);
        order2.showShippingDetails();
    }
}
