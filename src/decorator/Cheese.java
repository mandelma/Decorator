package decorator;

public class Cheese extends PizzaDecorator {
    final double price;

    public Cheese(PizzaAineet pizza) {
        super(pizza);
        this.price = 1.60;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }
}
