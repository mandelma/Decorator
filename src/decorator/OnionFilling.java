package decorator;

public class OnionFilling extends PizzaDecorator {
    final double price;
    public OnionFilling(PizzaAineet pizza) {
        super(pizza);
        this.price = 2.25;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }
}
