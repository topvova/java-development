package lesson9.pizzas;

public class Margherita extends Pizza {

    public Margherita() {
        description = "Margherita pizza";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}

