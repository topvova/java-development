package lesson9.condiments;

import lesson9.pizzas.Pizza;

public class Mozzarella extends CondimentDecorator {

    Pizza pizza;

    public Mozzarella(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", mozzarella";
    }

    @Override
    public double cost() {
        return 1.49 + pizza.cost();
    }

}
