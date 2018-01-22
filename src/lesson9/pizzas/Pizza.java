package lesson9.pizzas;

public abstract class Pizza {

    String description = "Base pizza";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();

}
