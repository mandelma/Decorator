package decorator;

public abstract class PizzaDecorator implements PizzaAineet {
    protected PizzaAineet pizzaForDecorating;

    public PizzaDecorator(PizzaAineet pizza) {
        this.pizzaForDecorating = pizza;
    }

    @Override
    public double getPrice() {

        return this.pizzaForDecorating.getPrice();
    }
}
