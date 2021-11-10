package decorator;

public class MushroomFilling extends PizzaDecorator {
    final double price;
    public MushroomFilling(PizzaAineet pizza) {
        super(pizza);
        this.price = 2.25;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }
}
