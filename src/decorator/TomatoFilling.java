package decorator;

public class TomatoFilling extends PizzaDecorator {
    final double price;
    public TomatoFilling(PizzaAineet pizza) {
        super(pizza);
        this.price = 0.7;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
