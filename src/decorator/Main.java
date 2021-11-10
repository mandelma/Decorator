package decorator;

public class Main {
    public static void main(String[] args) {
        // Valmistetaan ensimmäinen pizza
        PizzaAineet pizzaWithMushrooms = new Cheese(
                new TomatoFilling(new MushroomFilling(new Pizza())
                ));

        System.out.println("Pizza with mushrooms: " + pizzaWithMushrooms.getPrice() + " eur.");

        // Valmistetaan toinen pizza
        PizzaAineet salamiPizza = new Cheese(new TomatoFilling(
                new SalamiFilling(new Pizza())
        ));

        System.out.println("Salamipizza: " + salamiPizza.getPrice() + " eur.");

        // Valmistetaan kolmas pizza
        PizzaAineet special = new TomatoFilling(new Cheese(
                new PawnFilling(new OnionFilling(new MushroomFilling(new Pizza())))
        ));
        System.out.println("Special pizza: " + special.getPrice() + " eur.");
    }
}
