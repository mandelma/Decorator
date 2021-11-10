package decorator;

public class SalamiFilling extends PizzaDecorator {
    final double price;
    public SalamiFilling(PizzaAineet pizza) {
        super(pizza);
        this.price = 4.20;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }
}
