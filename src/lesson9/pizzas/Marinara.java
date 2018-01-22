package lesson9.pizzas;

public class Marinara extends Pizza {

    public Marinara() {
        description = "Marinara pizza";
    }

    @Override
    public double cost() {
        return 3.59;
    }
}
