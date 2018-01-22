package lesson9;

import lesson9.condiments.Mozzarella;
import lesson9.condiments.Tomatoes;
import lesson9.pizzas.Pizza;
import lesson9.pizzas.Margherita;
import lesson9.pizzas.Marinara;
import lesson9.strategies.CreditCardStrategy;
import lesson9.strategies.PayPalStrategy;

public class Main {

    public static void main(String[] args) {

        Pizza margherita = new Margherita();
        System.out.println(margherita.getDescription() + ": $" + margherita.cost());

        Pizza margheritaWithTomatoes = new Tomatoes(margherita);
        System.out.println(margheritaWithTomatoes.getDescription() + ": $" + margheritaWithTomatoes.cost());

        Pizza marinaraWithMozzarella = new Mozzarella(new Marinara());
        Pizza marinaraWithMozzarellaAndTomatoes = new Tomatoes(marinaraWithMozzarella);
        System.out.println(marinaraWithMozzarellaAndTomatoes.getDescription() + ": $"
                + marinaraWithMozzarellaAndTomatoes.cost());

        ShoppingCart cart = new ShoppingCart();
        cart.addPizza(margheritaWithTomatoes);
        cart.addPizza(marinaraWithMozzarella);
        cart.removePizza(marinaraWithMozzarella);
        cart.addPizza(marinaraWithMozzarellaAndTomatoes);

        cart.pay(new CreditCardStrategy("Test", "1111222233334444", "123","01/20"));
        cart.pay(new PayPalStrategy("test@test.com", "password"));
    }

}
