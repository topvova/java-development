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
        Enumeration rentals = this.rentals.elements(); // adding elements into the enumeration object
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental eachRental = (Rental) rentals.nextElement();

            // show figures for this rental
            result += "\t" + eachRental.getMovie().getTitle() + "\t" + String.valueOf(eachRental.getCharge()) + "\n";

        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";

        return result;
    }

    private double getTotalFrequentRenterPoints() {
        double result = 0;
        Enumeration rentals = this.rentals.elements();

        while (rentals.hasMoreElements()) {
            Rental eachRental = (Rental) rentals.nextElement();
            result += eachRental.charge();
        }
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = this.rentals.elements();

        while (rentals.hasMoreElements()) {
            Rental eachRental = (Rental) rentals.nextElement();
            result += eachRental.getCharge();
        }
        return result;
    }

    private double amountFor(Rental aRental) {
        return aRental.getCharge();
    }

}
