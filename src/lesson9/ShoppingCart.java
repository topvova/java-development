package lesson9;

import lesson9.pizzas.Pizza;
import lesson9.strategies.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Pizza> pizzas;

    public ShoppingCart() {
        this.pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    public void removePizza(Pizza pizza) {
        this.pizzas.remove(pizza);
    }

    public double calculateTotal() {
        double sum = 0;

        for (Pizza pizza : pizzas) {
            sum += pizza.cost();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        double amount = calculateTotal();

        paymentMethod.pay(amount);
    }

}
