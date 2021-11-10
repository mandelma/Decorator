package decorator;

public class PawnFilling extends PizzaDecorator {
    final double price;

    public PawnFilling(PizzaAineet pizza) {
        super(pizza);
        this.price = 2.50;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }
}
