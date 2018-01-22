package lesson9.condiments;

import lesson9.pizzas.Pizza;

public class Tomatoes extends CondimentDecorator {

    Pizza pizza;

    public Tomatoes(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", tomatoes";
    }

    @Override
    public double cost() {
        return 0.99 + pizza.cost();
    }
}
