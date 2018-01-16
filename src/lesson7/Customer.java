package lesson7;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String name;
    private Vector rentals = new Vector(); // internal data array size 10, capasity increment is 0

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        this.rentals.addElement(rental);
    }

    public String getName() {
        return this.name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements(); // adding elements into the enumeration object
        String result = "Rental Record for " + this.name + "\n";

        while (rentals.hasMoreElements()) {
            Rental eachRental = (Rental) rentals.nextElement();
            // add frequent renter points
            frequentRenterPoints += eachRental.getFrequentRenterPoints();

            // show figures for this rental
            result += "\t" + eachRental.getMovie().getTitle() + "\t" + String.valueOf(eachRental.getCharge()) + "\n";

            totalAmount += eachRental.getCharge();
        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";

        return result;
    }

    private double amountFor(Rental aRental) {
        return aRental.getCharge();
    }

}
