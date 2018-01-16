package lesson7;

public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    private void setPriceCode(int newPriceCode) {
        switch (newPriceCode) {
            case Movie.REGULAR:
                price = new RegularPrice();
                break;
            case Movie.CHILDREN:
                price = new ChildrenPrice();
                break;
            case Movie.NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code!");
        }
    }

    public String getTitle() {
        return this.title;
    }

    public double getCharge(int daysRented) {
        return this.price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return this.price.getFrequentRenterPoints(daysRented);
    }

}
