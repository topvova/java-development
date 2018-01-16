package lesson7;

public class NewReleasePrice extends Price {

    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        // add bonus for a two day new release rental
        return (daysRented > 1) ? 2 : 1;
    }
}
