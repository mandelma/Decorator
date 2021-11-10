package decorator;

public class Pizza implements PizzaAineet {
    final double price = 3.30;
    @Override
    public double getPrice() {
        return price;
    }
}
