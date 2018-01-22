package lesson9.strategies;

public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String expireDate;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String expireDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expireDate = expireDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + "$ paid with credit card");
    }
}
